package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // Student -> Person
        Student student = new Student("Huy", 24);
        student.run();
        student.study();
        Person person = (Person) student;
        person.run();

        // instanceof
        if (person instanceof Student) {
            Student s = (Student) person;
            s.study();
        }
    }
}
