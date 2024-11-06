package com.cgs.collegegrading.bootstrap;

import com.cgs.collegegrading.model.UserModel;
import com.cgs.collegegrading.model.UserRole;
import com.cgs.collegegrading.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CollegeGradingBootstrap implements CommandLineRunner {

    private UserService userService;

    public CollegeGradingBootstrap(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        loadUserData();
    }

    private void loadUserData() {
        userService.register(new UserModel("admin", "admin", UserRole.ADMIN));
    }
}
