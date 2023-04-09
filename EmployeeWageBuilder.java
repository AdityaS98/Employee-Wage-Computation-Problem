package com.employeewage;


import java.util.Scanner;

public class EmployeeWageBuilder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Using Switch Case
         * 2) Checked condition whether the employee was present.
         * 3) Checked condition whether the employee was partially present
         * 4)Checked condition whether the employee was absent
         * 5)Checked condition for invalid input by the user
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 8:
                System.out.println("Employee Worked for full day");
                break;
            case 4:
                System.out.println("Employee worked for half day");
                break;
            case 0:
                System.out.println("Employee was absent");
                break;
            default:
                System.out.println("Invalid Choice....");
        }


    }
}
