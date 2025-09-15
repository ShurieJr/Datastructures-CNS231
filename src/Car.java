public class Car {
    //data fields
    String color;
    int year;
    String model;

    //constructors
    Car() {  //no arg
        color = "blue";
        year = 2016;
        model = "toyota";
    }

    Car(String newcolor, int newyear, String newmodel) {
        color = newcolor;
        year = newyear;
        model = newmodel;

    }

    //methods
    void displY() {
        System.out.println("the color is : " + color);
        System.out.println("the year is : " + year);
        System.out.println("the model is : " + model);
    }
}
