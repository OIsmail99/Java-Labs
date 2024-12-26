public class Client {
    int id;
    String name;
    String email;
    public Client(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void getItemsDetails(){
        System.out.println( "ID: " + getID() + "\nName: " + getName() + "\nEmail: " + getEmail());
    }
}
