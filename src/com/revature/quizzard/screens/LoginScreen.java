package com.revature.quizzard.screens;

import com.revature.quizzard.models.AppUser;
import com.revature.quizzard.services.UserService;
import com.revature.quizzard.util.ScreenRouter;

import java.io.BufferedReader;

// TODO: Implement me!
public class LoginScreen extends Screen {

    private final UserService userService;

    public LoginScreen(BufferedReader consoleReader, ScreenRouter router, UserService userService) {
        super("LoginScreen", "/login", consoleReader, router);
        this.userService = userService;
    }

    @Override
    public void render() throws Exception {
        System.out.println("The user selected Login");
        System.out.println("Please provide us with your username and password:");

        System.out.print("Username: ");
        String username = consoleReader.readLine();

        System.out.print("Password: ");
        String password = consoleReader.readLine();

        System.out.printf("Provided username and password: { \"Username\": %s, \"Password\": %s}\n", username, password);



//        AppUser newUser = new AppUser(firstName, lastName, email, username, password);

//        boolean registerSuccessful = userService.registerNewUser(newUser);
//
//        if (registerSuccessful) {
//            // router.navigate("/dashboard");
//        } else {
//            System.out.println("You have provided invalid data. Please try again.");
//        }
//

    }

}