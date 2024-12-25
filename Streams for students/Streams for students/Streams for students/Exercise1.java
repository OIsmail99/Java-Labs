
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao = InMemoryWorldDao.getInstance();
      // 1. Find highest populated city for each country.
      List<List<City>> listOflists = countryDao.findAllCountries().
            stream()
            .map(country -> country.getCities())
            .collect(Collectors.toList());

      List<City> highestPopulatedCity = listOflists.stream()
            .map(cities -> cities.stream().max(Comparator.comparing(City::getPopulation)))
            .filter(Optional::isPresent)
            .map(city -> city.get())
            .collect(Collectors.toList());

      List<String> highestCitiesByCode = highestPopulatedCity.stream().map(city -> city.getCountryCode())
            .collect(Collectors.toList());

      InMemoryWorldDao dao = InMemoryWorldDao.getInstance();
      Set<String> continents = dao.getAllContinents();

      
         continents.stream().map(continent -> highestPopulatedCity.stream()
         .filter(x -> highestPopulatedCity.findCountryByCode(x.getCountryCode()).getContinent().equals(x))
         .max(Comparator.comparing(City::getPopulation)))
         .filter(Optional::isPresent)
         .map( x->x.get())
         .forEach(city -> System.out.println(city.getName()));  
           

      // country code

      // List<Integer> lst = highestPopulatedCity.stream().
      // map(city->Integer.parseInt(city.getCountryCode()))
      // .collect(Collectors.toList());

      // countryDao.
      // System.out.println(lst);

      // System.out.println(highestPopulatedCity);
      // list of list of cities

      // List <City> highestPopulatedCity = listOflists.stream()
      // .map(cities ->
      // cities.stream().max(Comparator.comparing(City::getPopulation)))
      // .collect(Collectors.toList());

      // System.out.println(highestPopulatedCity);

      // write your answer here
   }

}