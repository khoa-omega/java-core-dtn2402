public class StringDemo extends Object {
    public static void main(String[] args) {
        // Primitive
        String s1 = "Java Core"; // 1
        String s2 = "Java Core"; // 1

        // Non primitive
        String s3 = new String("Java Core"); // 2
        String s4 = new String("Java Core"); // 3

        // So sánh == và equals
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }
}
