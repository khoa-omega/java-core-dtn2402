package entity;

public class Dog {
    public String name;
    protected int age;

    String color;
    private int id;

    public Dog() {
        System.out.println("Khởi tạo 0 tham số");
    }

    public Dog(String name) {
        System.out.println("Khởi tạo 1 tham số");
        this.name = name;
    }

    public Dog(String name, int age) {
        System.out.println("Khởi tạo 2 tham số");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
