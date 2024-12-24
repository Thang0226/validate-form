package com.model;

import javax.validation.constraints.*;

public class User {
    @NotNull
    @Size(min = 2, max = 45)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 45)
    private String lastName;

    @Email
    private String email;

    @Min(18)
    private int age;

    @NotNull
    @Size(min = 10, max = 11)
    @Pattern(regexp = "^0[0-9]*$")
    private String phoneNumber;

    public User() {
    }

    public User(@NotNull @Size(min = 2, max = 45) String firstName, @NotNull @Size(min = 2, max = 45) String lastName,
                @Email String email, @Min(18) int age, @NotNull @Size(min = 10, max = 11) @Pattern(regexp = "^0[0-9]*$") String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
