public class EmpWage {
    //Initializing static variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxWorkingHours;
    private int totalEmpWage;

    //Objects in EmpWage method
    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHours) {
        System.out.println("Welcome to Employee Wage Computation Program");
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;

    }

    //Method computeEmpWage which checks if the employee is working for full time or part time or is absent and gives working hours accordingly
    public void computeEmpWage() {

        //Initializing variables
        int totalEmpHours = 0;
        int empHours = 0;
        int totalWorkingDays = 0;

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
            System.out.println("DAY : " + totalWorkingDays + " Emp hour: " + empHours);
        }

        //Calculating total employee wage of particular company employee and then printing it
        totalEmpWage = totalEmpHours * empRatePerHour;
    }

    //Returning the company name and employees of that comapny's total wage
    public String toString() {
        return ("Total Emp Wage for company: " + company + " is: " + totalEmpWage);
    }

    //Main method calling computeEmpWage method
    public static void main(String[] args) {
        EmpWage Bridgelabz = new EmpWage("Bridgelabz", 20, 4, 20);
        EmpWage Hike = new EmpWage("Hike", 10, 4, 20);
        EmpWage Edu = new EmpWage("Edu", 30, 6, 60);
        EmpWage Rising = new EmpWage("Rising", 10, 8, 40);
        Bridgelabz.computeEmpWage();
        System.out.println(Bridgelabz);
        Hike.computeEmpWage();
        System.out.println(Hike);
        Edu.computeEmpWage();
        System.out.println(Edu);
        Rising.computeEmpWage();
        System.out.println(Rising);

    }
}