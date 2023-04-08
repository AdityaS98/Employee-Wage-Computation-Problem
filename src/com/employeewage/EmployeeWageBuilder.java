package com.employeewage;


import java.util.Scanner;

public class EmployeeWageBuilder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Calculate a random value
         * 2) Checked condition whether the employee was present.
         * 3) Printing the display message if the employee is absent
         */
        /*
         * 1) Calculated a random value
         */
        double is_present = Math.random();
        /*
         *2) Checked condition whether the employee was present
         */
        if (is_present > 0.5) {
            System.out.println("Employee is present");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter working hours");
            int hours = sc.nextInt();
            System.out.println("Enter wage per hour ");
            int wagePerHour = sc.nextInt();
            int totalWage = hours * wagePerHour;

            System.out.println("Daily Employee Wage " + totalWage);


        }
        /*
         * 3) Printing the display message if the employee is absent
         */

        else {
            System.out.println("Employee is absent");
        }
    }
}
