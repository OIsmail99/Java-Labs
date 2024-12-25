
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Find the most populated city of each continent
public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();

        List<List<City>> listOflists = countryDao.findAllCountries().stream()
                .map(country -> country.getCities())
                .collect(Collectors.toList());

        List<City> highestPopulatedCity = listOflists.stream()
                .map(cities -> cities.stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(city -> city.get())
                .collect(Collectors.toList());

        // List<City> highestPopulatedOfEachContinent =
        countryDao.getAllContinents()
                .stream()
                .map(Continent -> highestPopulatedCity.stream()
                        .filter(city -> countryDao
                                .findCountryByCode(city.getCountryCode())
                                .getContinent().equals(Continent))
                        .max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent) // filter(optional -> city.isPresent)
                .map(city -> city.get())
                .forEach(city -> System.out.println(
                        countryDao
                                .findCountryByCode(city.getCountryCode())
                                .getContinent() + " :" + city.getName()));
        // .collect(Collectors.toList());
        // System.out.println(highestPopulatedOfEachContinent);

        // write your answer here

    }

}
