package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        // ORDER BY id ASC
        // return Integer.compare(this.id, that.id);

        // ORDER BY id DESC
        // return Integer.compare(that.id, this.id);

        // ORDER BY name DESC
        // return that.name.compareTo(this.name);

        // ORDER BY id ASC, name DESC
        int c = Integer.compare(this.id, that.id);
        return c == 0 ? that.name.compareTo(this.name) : c;
    }
}
