package com.project.libmansys9may;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public  void run() {
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("loginDetails.txt"));
            while (scan.hasNextLine()) {
                String user = scan.nextLine();
                String pass = scan.nextLine();
                users.add(user);
                passwords.add(pass);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inpUser = keyboard.nextLine();
        System.out.print("Enter password: ");
        String inpPass = keyboard.nextLine();

        int index = users.indexOf(inpUser);
        if (index != -1 && passwords.get(index).equals(inpPass)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}

