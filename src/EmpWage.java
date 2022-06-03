public class EmpWage {
    //Initializing static variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Initializing variables
        int empDailyWage = 0;
        int empHours = 0;

        /*Checking if the employee is full time working or part time or is absent using switch case*/
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }

        //Calculated employee's daily wage
        empDailyWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("EMPLOYEE DAILY WAGE IS:" + empDailyWage);
    }
}