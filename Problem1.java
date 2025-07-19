import java.util.Scanner;
public class Problem1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter value b: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter operation (add, sub, mul, div): ");
	        String operation = sc.next();

	        Calculator calc = new Calculator();
	        double result = calc.calculate(a, b, operation);
	        System.out.println("Result: " + result);
	    }
}
class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div": 
                if (b != 0) return a / b;
                else {
                    System.out.println("Cannot divide by zero.");
                    return 0;
                }
            default: 
                System.out.println("Invalid operation.");
                return 0;
        }
    }
}