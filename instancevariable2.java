class Student {
    String name;
    int age;
}

public class instancevariable2 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Anu";
        s1.age = 18;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
