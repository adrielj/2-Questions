import java.util.Scanner;

public class TwoQuestionsPartTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		int firstAnswer;
		int secondAnswer;
		
		System.out.println("Hello, think of an object!");
		System.out.println("Question 1");
		System.out.println("Is your object a/an...:");
		System.out.println("1) Animal?");
		System.out.println("2) Vegetable?");
		System.out.println("3) Mineral?");
		System.out.print("Please enter the number that matches your answer: ");
		
		firstAnswer = in.nextInt();
		
		System.out.println("");
				
		System.out.println("Question 2:");
		System.out.println("Compared to a laptop, is your object...:");
		System.out.println("1) Smaller?");
		System.out.println("2) Larger?");
		System.out.print("Please enter the number that matches your answer: ");
			
		secondAnswer = in.nextInt();
		
		if (firstAnswer == 1 && secondAnswer == 1) {
			
			System.out.println("");
			System.out.println("Is your object a bunny?");
			
		} 
		
		if (firstAnswer == 1 && secondAnswer == 2) {
			
			System.out.println("");
			System.out.println("Is your object an octopus?");
			
		}
		
		if (firstAnswer == 2 && secondAnswer == 1) {
			
			System.out.println("");
			System.out.println("Is your object a carrot?");
			
		}
		
		if (firstAnswer == 2 && secondAnswer == 2) {
			
			System.out.println("");
			System.out.println("Is your object a pumpkin?");
			
		} 
		
		if (firstAnswer == 3 && secondAnswer == 1) {
			
			System.out.println("");
			System.out.println("Is your object a pebble?");
			
		}
		
		if (firstAnswer == 3 && secondAnswer == 2) {
			
			System.out.println("");
			System.out.println("Is your object a boulder?");
			
		}
		
	}

}
