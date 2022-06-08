public class EmpWage {
    //Initializing static variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    //Method computeEmpWage which checks if the employee is working for full time or part time or is absent and gives working hours accordingly
    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHours) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Initializing variables
        int totalEmpHours = 0;
        int empHours = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;

        /*Checking if the employee is full time working or part time or is absent using switch case*/
        while (totalEmpHours <= maxWorkingHours && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
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
            totalEmpHours += empHours;
            //Printing total working days and hours
            System.out.println("DAY#: " + totalWorkingDays + " Emp hour: " + empHours);
        }
        //Calculating total employee wage of particular company employee and then printing it
        totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Employees's Total Wage for company : " + company + " is " + totalEmpWage);
        return totalEmpWage;
    }

    //Main method calling computeEmpWage method
    public static void main(String[] args) {
        computeEmpWage("Bridgelabz", 20, 4, 20);
        computeEmpWage("Hike", 10, 4, 20);
        computeEmpWage("Edu", 30, 6, 60);
        computeEmpWage("Rising", 10, 8, 40);

    }
}