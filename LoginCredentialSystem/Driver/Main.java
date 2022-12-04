package com.gl.LoginCredentialSystem.Driver;

import com.gl.LoginCredentialSystem.Interfaces.CredentialSystem;
import com.gl.LoginCredentialSystem.model.Employee;
import com.gl.LoginCredentialSystem.service.CredentialService;

import java.util.Scanner;

public class Main { // as driver class

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option;
        Employee employee = new Employee("harshit", "choudary");

        CredentialService cs = new CredentialService();

        System.out.println("Please enter the department from the following: ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");

        option = in.nextInt();

        String generatedEmail = null;
        String generatedPassword = null;

        switch (option) {

            case 1: {
                generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
                generatedPassword = cs.generatePassword();
                break;
            }

            case 2: {
                generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
                generatedPassword = cs.generatePassword();
                break;
            }

            case 3: {
                generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "humanresources");
                generatedPassword = cs.generatePassword();
                break;
            }

            case 4: {
                generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
                generatedPassword = cs.generatePassword();
                break;
            }

            default: {
                System.out.println("Enter a valid option ");
            }
        }

        employee.setEmail(generatedEmail);
        employee.setPassword(generatedPassword);
        cs.showCredential(employee);

    }
}
