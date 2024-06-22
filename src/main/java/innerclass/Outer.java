package innerclass;

public class Outer {
    private int value;
    private static int count = 3;

    public Outer(int value) {
        this.value = value;
    }

    public class Inner {
        public void showInfo() {
            System.out.println("outer value = " + value);
            System.out.println("outer count = " + count);
        }
    }

    public static class Nested {
        public void showInfo() {
            // System.out.println("outer value = " + value);
            System.out.println("outer count = " + count);
        }
    }
}
