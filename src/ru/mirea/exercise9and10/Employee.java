package ru.mirea.exercise9and10;

public class Employee{
    private String name = "noName";
    private String surname = "noSurname";
    private EmployeePosition position;
    private double salary;

    public Employee(EmployeePosition position, double salary) {
        this.position = position;
        this.salary = position.calcSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public int getSalary() {
        return (int)salary;
    }
}
