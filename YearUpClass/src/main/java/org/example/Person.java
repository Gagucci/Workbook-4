package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    // Constructor
    public Person() {

    }

    public Person(String _firstName, String _lastName, String _email, String _gender) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.gender = _gender;
    }

    // Getters en Setters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    public void setFirstName(String _firstName) { this.firstName = _firstName; }
    public void setLastName (String _lastName) { this.lastName = _lastName; }
    public void setEmail(String _email) { this.email = _email; }
    public void setGender(String _gender) { this.gender = _gender; }
}
