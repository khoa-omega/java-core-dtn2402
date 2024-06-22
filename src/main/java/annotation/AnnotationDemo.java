package annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        // Cú pháp: @ + Tên

        // @Override
        AnnotationDemo demo = new AnnotationDemo();
        System.out.println("demo = " + demo);

        // @Deprecated
        int max = Math.maxV1(1, 0);
        System.out.println("max = " + max);

        // SuppressWarnings
        @SuppressWarnings("deprecation")
        int m = Math.maxV1(1, 0);
        System.out.println("max = " + m);
    }

    @Override
    public String toString() {
        return "This is AnnotationDemo class";
    }
}
