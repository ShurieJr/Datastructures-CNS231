public class University {
    String name;
    String location;
    University(){
        name = "Jamhuriya university";
        location = "Hodan";
    }
    University(String newName, String newLocation){
        name=newName;
        location=newLocation;
    }
    void display(){
        System.out.println("name: " + name);
        System.out.println("Location: " + location);
    }

}
