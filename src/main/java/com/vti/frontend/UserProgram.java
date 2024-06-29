package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.repository.UserRepository;
import com.vti.service.UserService;

public class UserProgram {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction function = new UserFunction(controller);
        function.showMenu();
    }
}
