public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.name = "Long";
        dog.age = 2;
        System.out.println("dog = " + dog);

        // equals
        Dog dog1 = new Dog();
        dog1.name = "Long";
        dog1.age = 2;
        Dog dog2 = new Dog();
        dog2.name = "Long";
        dog2.age = 2;
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        // hashCode
    }
}
