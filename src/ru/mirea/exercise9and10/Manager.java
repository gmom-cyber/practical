package ru.mirea.exercise9and10;

public class Manager implements EmployeePosition {

    private int companyIncome;

    public Manager(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    public int getCompanyIncome() {
        return companyIncome;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (companyIncome*0.05);
    }
}
