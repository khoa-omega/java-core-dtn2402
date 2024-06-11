import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên constructor trùng với tên class
        // 2. Constructor không có kiểu trả về
        Dog dog1 = new Dog("Long", 2);
        System.out.println("dog1 = " + dog1);

        Dog dog2 = new Dog("Linh");
        System.out.println("dog2 = " + dog2);

        // Mặc định: 0 tham số
        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }
}
