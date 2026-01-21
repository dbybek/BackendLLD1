package IntroToOOP;

public class Student {
//    Data Attributes
    String name;
    int age;
    int graduationYear;
    int id;
    String email;
    String course;

    void raiseHR(){
        System.out.println("Help Request raised.");
    }

    void rateClass(){
        System.out.println("Rate class:");
    }

    void printDetails(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Course: "+this.course);
        System.out.println("graduation Year: "+this.graduationYear);
        System.out.println("Mail Address: "+this.email);
    }
}
