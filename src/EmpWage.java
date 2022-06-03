public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Initializing variables
        int isFullTime = 1;
        int isPartTime = 2;
        int empRatePerHour = 20;
        int empDailyWage = 0;
        int empHours = 0;

        /*Checked if employee is full time working or part time or absent*/
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime)
            empHours = 8;
        else if (empCheck == isPartTime)
            empHours = 4;
        else
            empHours = 0;

        //Calculating employee's daily wage
        empDailyWage = empHours * empRatePerHour;
        System.out.println("EMPLOYEE DAILY WAGE IS:" + empDailyWage);
    }
}