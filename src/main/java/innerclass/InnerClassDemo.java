package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        // inner class
        Outer outer = new Outer(10);
        Outer.Inner inner = outer.new Inner();
        inner.showInfo();

        // nested class
        Outer.Nested nested = new Outer.Nested();
        nested.showInfo();

        // local class
        demo();
    }

    public static void demo() {
        class Dog {
            private int age;

            public Dog(int age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "age=" + age +
                        '}';
            }
        }
        Dog dog = new Dog(2);
        System.out.println("dog = " + dog);
    }
}
