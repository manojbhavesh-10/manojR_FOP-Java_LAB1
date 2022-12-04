package com.gl.LoginCredentialSystem.Interfaces;

import com.gl.LoginCredentialSystem.model.Employee;

public interface CredentialSystem {

    public String generateEmailAddress(String firstName, String lastName, String department);
    public String generatePassword();
    public void showCredential(Employee employee);
}
