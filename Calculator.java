import javax.swing.JOptionPane;
public class Calculator {
	public static void main(String[] args) {
        	String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        	double num1 = Double.parseDouble(strNum1);
	
        	String strNum2 = JOptionPane.showInputDialog("Enter the second number:");
        	double num2 = Double.parseDouble(strNum2);

        	double sum = num1 + num2;
        	double difference = num1 - num2;
        	double product = num1 * num2;

        	String message = "Sum: " + sum + "\n" +
                         	 "Difference: " + difference + "\n" +
                         	 "Product: " + product + "\n";

        	if (num2 != 0) {
            		double quotient = num1 / num2;
            		message += "Quotient: " + quotient;
        	} else {
            		message += "Cannot divide by zero.";
        	}

        JOptionPane.showMessageDialog(null, message);
	System.exit(0);
    	}
}
