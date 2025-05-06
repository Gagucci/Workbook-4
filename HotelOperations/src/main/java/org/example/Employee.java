package org.example;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0; // Default to 0 hours worked
    }

    public int employeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String department() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double payRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double hoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }
    
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }
}
