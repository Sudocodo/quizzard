package com.revature.quizzard.screens;

import com.revature.quizzard.services.UserService;
import com.revature.quizzard.util.ScreenRouter;
import org.omg.Messaging.SyncScopeHelper;

import java.io.BufferedReader;
import java.sql.SQLOutput;

// TODO: Implement me!
public class LoginScreen extends Screen {

    private UserService userService = null;

    public LoginScreen(BufferedReader consoleReader, ScreenRouter router, UserService userService) {
        super("LoginScreen", "/login" , consoleReader, router);
        this.userService = userService;
    }

    @Override
    public void render() throws Exception {
        System.out.print("Enter username :");
        String username = consoleReader.readLine();
        System.out.print("Enter password :");
        String password = consoleReader.readLine();

        System.out.println(userService.authenticateUser(username, password));
    }


}
