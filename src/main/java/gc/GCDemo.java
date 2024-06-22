package gc;

public class GCDemo {
    public static void main(String[] args) {
        // Ví dụ 1
        Dog dog1 = new Dog("Long");
        Dog dog2 = new Dog("Linh");
        dog2 = null;
        System.gc();

        // Ví dụ 2
        demo();
        System.gc();
    }

    public static void demo() {
        Dog dog = new Dog("ABC");
    }
}
