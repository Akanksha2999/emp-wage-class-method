public class UC2_DailyEmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Initializing variables
        int isFullTime = 1;
        int empRatePerHour = 20;
        int empDailyWage = 0;
        int empHours = 0;

        //Cheking if the employee is full time working for absent
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime) {
            empHours = 8;
        } else {
            empHours = 0;
        }

        //Calculating daily wage of employee
        empDailyWage = empHours * empRatePerHour;
        System.out.println("EMPLOYEE DAILY WAGE IS:" + empDailyWage);
    }
}