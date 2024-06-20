package generic;

public class Printer {
    public static <T> void printAny(T object) {
        System.out.println(object);
    }
}
