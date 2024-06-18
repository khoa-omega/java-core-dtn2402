public class FinalDemo {
    public static void main(String[] args) {
        // final property
        final double pi = 3.1415;
        // pi = 5; // Lỗi

        // final method
        Dog dog = new Dog();
        dog.run();

        // final class
        // Shiba shiba = Shiba();
        // shiba.run();

        // constant
        System.out.println("Math.PI = " + Math.PI);
        // Math.PI = 5;
    }
}
