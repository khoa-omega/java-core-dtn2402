import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Bảo vệ";
        System.out.println("Tên phòng ban: " + department.name);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("Tên chức vụ: " + position.name);

        Account account = new Account();
        account.id = 1;
        account.username = "khoa.nv";
        account.email = "khoa.nv@gmail.com";
        account.fullName = "Nguyễn Văn Khoa";
        account.department = department;
        account.position = position;
        account.createdDate = LocalDate.of(2004, 4, 16);
    }
}
