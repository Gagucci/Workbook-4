package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a generic person
        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

        Student student = new Student("Brian", "Vega-Solano", "brianvs@example.com", "male", 2,"https://github.com/BrianVegaSol", "https://www.linkedin.com/in/brianvs/", "Crash n' Burn", "0", "img/Avatar_Student_Male.jpg","Windows",0,"81");

        // Print information about the student
        System.out.println("Student:");
        System.out.println("Full Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Nickname: " + student.getCodingNickname());
        System.out.println("GitHub: " + student.getGithub());
        System.out.println("Device: " + student.getDeviceType());
        System.out.println("Currently Working On: " + student.getCurrentlyWorkingOn());
    }
}