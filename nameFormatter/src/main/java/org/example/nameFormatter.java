package org.example;

public class nameFormatter {

    public static String format(String fullName) {
      return fullName;
    }

    public static String format(String firstName,String lastName) {
        return firstName + " " + lastName;
    }

    public static String format(String lastName, String prefix, String firstName, String middleName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + " , " + suffix;
    }


}
