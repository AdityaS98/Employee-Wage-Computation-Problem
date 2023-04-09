package week2;
import java.util.*;

public class employeewage {

	/**
  
     * @param args
      */
     public static void main(String[] args) {System.out.println("Please enter number of days");
     Scanner sc = new Scanner(System.in);
     int sum=0, wageOfEmployee=80;
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
             sum +=  wageOfEmployee;
             System.out.println("Employee is present");
         }

         /*
          * 5) Calculate the wage of employee if employee is partially present
          */
         else if (isPresent >= 1 && isPresent < 2) {
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
         sum=sum+wageOfEmployee;
         System.out.println("Sum is "+wageOfEmployee);
     }

     /*
      * 7) Print total wage of employee
      */
     System.out.println("Employee earned " + sum);
     sc.close();
 }
}


