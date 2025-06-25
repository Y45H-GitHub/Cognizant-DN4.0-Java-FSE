package com.yash.DN4JavaFSE;

public class UserService {

    public boolean isEmailValid(String email) {
        return email != null && email.contains("@") && email.endsWith(".com");
    }

    public String formatUsername(String firstName, String lastName) {
        if (firstName == null || lastName == null) return null;
        return (firstName + "." + lastName).toLowerCase();
    }
}
