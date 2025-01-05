
import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorApp calc = new CalculatorApp();
		
		while (true) {
			System.out.println("Select an operation: + , - , *, /");
			String operation = scanner.next(); 
			
			if (operation.equals("leave")) {
				System.out.println("You exited : )");
				break;
			}
			
			System.out.print("Enter first number");
			double num1 = scanner.nextDouble();
			
			System.out.print("Enter another number");
			double num2 = scanner.nextDouble();
			
			double result = 0;
			boolean validOperation = true;
			
			switch (operation) {
			case "+":
				result = num1 + num2;
				break;
			 case "-":
                 result = num1 - num2;
                 break;
             case "*":
                 result = num1*num2;
                 break;
             case "/":
                 if (num2 != 0) {
                     result = num1 / num2;
                 } else {
                     System.out.println("Cannot divide by zero!");
                     validOperation = false;
                 }
                 break;
             default:
                 System.out.println("Invalid operation!");
                 validOperation = false;
                 break;
         }
         
         if (validOperation) {
             System.out.println("The result is: " + result);
         }
     }
     
     scanner.close();
						
     
	}

}




















