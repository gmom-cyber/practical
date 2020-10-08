package ru.mirea.exercise9and10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Company {
    int companyIncome = 0;
    int operators = 0;
    int managers = 0;
    int topManagers = 0;
    int allStaff = 0;
    int salary = 80000;
    ArrayList<Employee> staff = new ArrayList<>();
    public void main() {

        System.out.println("Оклад: " + salary + " руб.");
        System.out.println("Найм всех сотрудников");
        hireAll();
        System.out.println("Капитализация компании");
        System.out.println(companyIncome);
        System.out.println("Топы зарплат");
        statistics();
        System.out.println("Увольнение 50% сотрудников компании, обновление капитализации компании и зарплат топ менеджеров");
        ypolovinevanie();
        System.out.println("Капитализация компании");
        System.out.println(companyIncome);
        refreshSalary();
        System.out.println("Обновлённые топы зарплат");
        statistics();
    }
    public void  hire(){//Найм сотрудника
        if (operators < 180)
        {
            staff.add(new Employee(new Operator(),salary));
            operators++;
            allStaff++;
            return;
        }
        if ( managers< 80)
        {
            int z = (int)((Math.random() * 25000) + 115000);
            companyIncome += z;
            staff.add(new Employee(new Manager(z),salary));
            managers++;
            allStaff++;
            return;
        }
        if (topManagers < 10)
        {
            staff.add(new Employee(new TopManager(companyIncome),salary));
            topManagers++;
            allStaff++;
        }
    }

    public int getIncome() {
        return companyIncome;
    }

    private void hireAll()
    {
        while(allStaff < 270)
        {
            hire();
        }
    }
    private void statistics()//Вывод топа зарплат
    {
        int top = (int)(Math.random()*5) + 10;
        System.out.println("Вывод списка из " + top + " самых высоких зарплат в компании");
        int i = 1;
        for(Employee s : getTopSalaryStaff(top))
        {
            System.out.println("№: " + i + ", " + s.getSalary() + " руб.");
            i++;
        }
        System.out.println("Вывод списка из 30 самых низких зарплат в компании");
        i = 1;
        for(Employee s : getLowestSalaryStaff(30))
        {
            System.out.println("Номер " + i + ", " + s.getSalary() + " р.");
            i++;
        }
    }
    private void refreshSalary()
    {
        for(Employee sd : staff)
        {
            if(sd.getPosition().getJobTitle().equals("TopManager"))
            {
                TopManager sg = (TopManager)sd.getPosition();
                sg.setCompanyIncome(11000000);
                sd.setPosition(sg);
            }
        }
    }
    private int getPost(String post)//сотрудника по должности
    {
        for (int sad = 0; sad < staff.size(); sad++) {
            if (staff.get(sad).getPosition().getJobTitle().equals(post)) {
                return sad;
            }
        }
        return -1;
    }
    private void fire()
    {
        if (operators > 90)
        {
            staff.remove(getPost("Operator"));
            operators--;
            allStaff--;
            return;
        }
        if (managers > 40)
        {
            Employee sd = staff.get(getPost("Manager"));
            companyIncome -= ((Manager)sd.getPosition()).getCompanyIncome();
            staff.remove(sd);
            managers--;
            allStaff--;
            return;
        }
        if (topManagers > 5)
        {
            staff.remove(getPost("TopManager"));
            topManagers--;
            allStaff--;
        }
    }
    private void ypolovinevanie()
    {
        while (allStaff > 135)
        {
            fire();
        }
    }
    public static Comparator<Employee> getTop()
    {
        return new Comparator<Employee>(){
            @Override
            public int compare(Employee s1, Employee s2)
            {
                return s2.getSalary() - s1.getSalary();
            }
        };
    }
    public static Comparator<Employee> getLow()
    {
        return new Comparator<Employee>(){
            @Override
            public int compare(Employee s1, Employee s2)
            {
                return s1.getSalary() - s2.getSalary();
            }
        };
    }
    private List<Employee> getTopSalaryStaff(int count)
    {
        Collections.sort(staff, getTop());
        return staff.subList(0, count);
    }

    private List<Employee> getLowestSalaryStaff(int count)
    {
        Collections.sort(staff, getLow());
        return staff.subList(0, count);
    }
}
