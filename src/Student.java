public class Student {
    String studentID, name, tel, Class;
    int age;

    Student() {
        studentID = "C112160";
        name = "Mohamed ali";
        tel = "6760";
        Class = "CNS231";
        age = 20;
    }

    Student(String id, String stdname, String telephone,
            String stdClass, int stdAge) {
        studentID = id;
        name = stdname;
        tel = telephone;
        Class = stdClass;
        age = stdAge;
    }

    //method
    void displayStudentInfo() {
        System.out.println("ID:" + studentID);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("tel:" + tel);
        System.out.println("class:" + Class);
    }


    //main method
    public static void main(String[] args) {
        Student std1 = new Student("c12131", "Osman",
                "68768", "CNS231", 25);
        std1.tel = "0000";
        std1.displayStudentInfo();
    }
}
