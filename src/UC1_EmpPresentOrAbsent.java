public class UC1_EmpPresentOrAbsent {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Initializing variable isFullTime as 1
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        //Checking if employee is absent or present using if else
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
