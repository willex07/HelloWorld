package wilson_p2;

import java.util.Scanner;

public class BMI_Calulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in); 
		double feet;
		double height;
		double weight;
		double BMI;
		
		System.out.print("Please enter your height (in feet): ");
         feet = scnr.nextDouble();
         
        System.out.print("Please enter your height (in inches): ");
         height = scnr.nextDouble();
        height = (feet * 12) + height;
        
        System.out.print("Please enter your weight (in pounds): ");
         weight = scnr.nextDouble();
         BMI = (weight * 703 / height / height);
         
        System.out.println("BMI =" + BMI);
        
        if (BMI < 18.5) {
            System.out.println("underweight");
        } else if (BMI < 25) {
            System.out.println("normal");
        } else if (BMI < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
		
		
	}

}
