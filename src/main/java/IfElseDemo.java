public class IfElseDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        if (a > b) {
            System.out.println("max = " + a);
        } else if (a == b) {
            System.out.println("hai số bằng nhau");
        } else if (100 > 10) {
            System.out.println("100 lớn hơn 10");
        } else {
            System.out.println("max = " + b);
        }
    }
}
