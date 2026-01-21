package IntroToOOP;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "John";
        student1.age = 25;
        student1.course = "Backend LLD";
        student1.graduationYear = 2019;
        student1.email = "john@gmail.com";
        student1.id = 1;

        student1.printDetails();

        Student student2 = new Student();

        student2.name = "Jane";
        student2.age = 23;
        student2.course = "Backend LLD";
        student2.graduationYear = 2021;
        student2.email = "jane@gmail.com";
        student2.id = 2;

        student2.printDetails();
    }
}