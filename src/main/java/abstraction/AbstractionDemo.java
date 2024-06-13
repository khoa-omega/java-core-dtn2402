package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // Abstract class
        // Trừu tượng không hoàn toàn (< 100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());
        // Không thể khởi tạo
        // Shape shape = new Shape();

        // Interface
        // Trừu tượng hoàn toàn (100%)
        // Mặc định: public abstract
        // Đa kế thừa
        circle.draw();
        circle.extend();
    }
}
