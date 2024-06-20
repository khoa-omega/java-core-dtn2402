package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(7, "Huy"));
        students.add(new Student(2, "Tiến"));
        students.add(new Student(4, "Hoàng"));
        students.add(new Student(1, "Tiến Anh"));
        students.add(new Student(7, "Anh Long"));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("iterator: " + student);
        }
    }
}
