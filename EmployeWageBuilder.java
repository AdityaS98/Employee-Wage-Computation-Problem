package week2;

import java.util.*;

public class employeewage {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter number of days");
		Scanner sc = new Scanner(System.in);
		int sum = 0, wageOfEmployee = 80, totalhours = 0, totaldays = 0, Hours = 0;
		int numberOfDays = sc.nextInt();

		for (int i = 1; i <= numberOfDays; i++) {

			/*
			 * 3) Calculate the random number
			 */
			double isPresent = Math.random() * 3;

			/*
			 * 4) Calculate the wage of employee if employee is present
			 */
			if (isPresent >= 2) {
				Hours = 8;
				sum += wageOfEmployee;
				System.out.println("Employee is present");
			}

			/*
			 * 5) Calculate the wage of employee if employee is partially present
			 */
			else if (isPresent >= 1 && isPresent < 2) {
				Hours = 4;
				sum += (wageOfEmployee / 2);
				System.out.println("Employee is partial present");
			}

			/*
			 * 6) Print if employee is absent
			 */
			else {
				System.out.println("Employee is absent");
				System.out.println("Employee earned " + 0);
			}
			if (totalhours <= 100 && totaldays <= 20) {
				sum = sum + wageOfEmployee;
				totalhours += Hours;
				totaldays++;
			}
			System.out.println("Sum is " + wageOfEmployee);
			System.out.println("Total Hours is " + totalhours);
			System.out.println("Total Days are" + totaldays);
		}

		/*
		 * 7) Print total wage of employee
		 */
		System.out.println("Employee earned " + sum);
		sc.close();
	}
}
