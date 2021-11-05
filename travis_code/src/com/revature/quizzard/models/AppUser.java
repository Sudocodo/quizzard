package com.revature.quizzard.models;

import java.util.Objects;

/*
    POJO = Plain Ol' Java object

    Simple encapsulation of data.  They do not have rich features, they simply hold related values.

    common convention re: class structures:
        class X {
            fields
            constructors
            instance methods
            overridden methods
            static methods
            nested classes/enums/interfaces
        }

       Common methods from java.lang.object that are overridden in most POJOS:
        -boolean equals (Object o)
        -int hashcode()
        - string toString()
 */
public class AppUser {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public AppUser(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //potentially add validation logic here (but there's really a better place ot do this kind of logic)
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toFileString() {
        StringBuilder builder = new StringBuilder();
        builder.append(firstName).append(":")
                .append(lastName).append(":")
                .append(email).append(":")
                .append(username).append(":")
                .append(password);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o; // explicit type casting
        return Objects.equals(firstName, appUser.firstName)
                && Objects.equals(lastName, appUser.lastName)
                && Objects.equals(email, appUser.email)
                && Objects.equals(username, appUser.username)
                && Objects.equals(password, appUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, username, password);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
