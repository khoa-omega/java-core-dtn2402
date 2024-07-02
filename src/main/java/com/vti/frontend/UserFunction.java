package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng nhập dành cho admin");
            System.out.println("2. Tìm kiếm employee và manager theo project id");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAdminByEmailAndPassword();
            } else if (menu == 2) {
                findEmployeeAndManagerByProjectId();
            } else if (menu == 3) {
                System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void showAdminMenu() {
        while (true) {
            System.out.println("1. Tìm kiếm employee và manager theo project id");
            System.out.println("2. Thêm employee");
            System.out.println("3. Đăng xuất");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findEmployeeAndManagerByProjectId();
            } else if (menu == 2) {
                create();
            } else if (menu == 3) {
                System.out.println("Đăng xuất thành công!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void findEmployeeAndManagerByProjectId() {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeAndManagerByProjectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void findAdminByEmailAndPassword() {
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();
        User user = controller.findAdminByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf(
                    "Đăng nhập thành công: %s - %s%n",
                    user.getFullName(), role
            );
            showAdminMenu();
        }
    }

    private void create() {
        System.out.println("Mời bạn nhập vào thông tin user.");
        System.out.println("Nhập vào full name:");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        int result = controller.create(fullName, email);
        System.out.printf("Đã tạo thành công %d user.%n", result);
    }
}
