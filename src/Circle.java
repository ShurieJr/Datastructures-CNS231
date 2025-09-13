public class Circle {
    //variables  - data fields
    double radius;
    //constructors
    Circle(){     //no argument
        radius = 1.0;
    }
    Circle( double value){   // with arguments
        radius = value;
    }

    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
}
