package Lesson13Mentor;
class Worker {
    String name;
    String birthDate;
    String endOfContract;

    void retire() {
        System.out.println(name + " has retired.");
    }
}

class Employee extends Worker {
    long employeeId;
    String hireDate;
}

class SalariedEmployee extends Employee {
    double annualSalary;

    double getMonthlySalary() {
        return annualSalary / 12;
    }
}

class HourlyEmployee extends Employee {
    double hourlySalary;

    double getMonthlySalary() {
        return hourlySalary * 160; // Assuming 40 hours per week, 4 weeks per month
    }
}

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.name = "John Doe";
        salariedEmployee.annualSalary = 60000;

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.name = "Jane Smith";
        hourlyEmployee.hourlySalary = 20;

        System.out.println("Monthly salary of " + salariedEmployee.name + ": $" + salariedEmployee.getMonthlySalary());
        System.out.println("Monthly salary of " + hourlyEmployee.name + ": $" + hourlyEmployee.getMonthlySalary());

        salariedEmployee.retire();
        hourlyEmployee.retire();
    }
}