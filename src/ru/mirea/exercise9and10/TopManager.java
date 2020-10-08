package ru.mirea.exercise9and10;

public class TopManager implements EmployeePosition {

    private int companyIncome;
    public TopManager(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    public void setCompanyIncome(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    public int getCompanyIncome() {
        return companyIncome;
    }

    @Override
        public String getJobTitle() {
        return "TopManager";
    }

        @Override
        public double calcSalary(double salary) {

        if (companyIncome<=10000000)
            return salary;
        else
            return salary+(salary*1.5);


        }
}
