package com.gl.LoginCredentialSystem.service;

import java.util.Random;

import com.gl.LoginCredentialSystem.Interfaces.CredentialSystem;
import com.gl.LoginCredentialSystem.model.Employee;

public class CredentialService implements CredentialSystem {


    @Override
    public String generateEmailAddress(String firstName, String lastName, String department) {
        return  firstName + lastName + "@" + department + ".greatlearning.com";
    }

    @Override
    public String generatePassword() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String specialChars = "!@#$%^&*_=+-/?.<>";
        String numbers = "1234567890";
        String values = upper + lower + specialChars + numbers;
        Random random = new Random();
        String password = "";
         for(int i = 0; i < 8; i++) {
             password += String.valueOf(values.charAt(random.nextInt(values.length())));
         }

         return password;
    }


    @Override
    public void showCredential(Employee employee) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Password: " + employee.getPassword());



    }
}
