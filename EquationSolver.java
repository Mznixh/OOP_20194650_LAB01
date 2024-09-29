import javax.swing.JOptionPane;
public class EquationSolver {
	public static void main(String[] args) {
        	String[] options = {"First-degree equation (1 variable)", "System of first-degree equations (2 variables)", "Second-degree equation (1 variable)"};
        	int choice = JOptionPane.showOptionDialog(null, "Select the type of equation to solve:", "Equation Solver",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		switch (choice) {
			case 0:
                		solveFirstDegreeEquation();
                		System.exit(0);
            		case 1:
                		solveLinearSystem();
                		System.exit(0);
            		case 2:
                		solveSecondDegreeEquation();
                		System.exit(0);
            		default:
                		JOptionPane.showMessageDialog(null, "Invalid selection.");
        	}
    	}

    	public static void solveFirstDegreeEquation() {
        	String strA = JOptionPane.showInputDialog("Enter coefficient a:");
        	double a = Double.parseDouble(strA);

        	if (a == 0) {
            		JOptionPane.showMessageDialog(null, "a cannot be zero for a first-degree equation.");
            		return;
       		}

        	String strB = JOptionPane.showInputDialog("Enter constant b:");
        	double b = Double.parseDouble(strB);

        	double x = -b / a;

        	JOptionPane.showMessageDialog(null, "The solution is: x = " + x);
    	}

    	public static void solveLinearSystem() {
        	String strA11 = JOptionPane.showInputDialog("Enter coefficient a11:");
        	String strA12 = JOptionPane.showInputDialog("Enter coefficient a12:");
        	String strB1 = JOptionPane.showInputDialog("Enter constant b1:");
        	String strA21 = JOptionPane.showInputDialog("Enter coefficient a21:");
        	String strA22 = JOptionPane.showInputDialog("Enter coefficient a22:");
        	String strB2 = JOptionPane.showInputDialog("Enter constant b2:");

        	double a11 = Double.parseDouble(strA11);
        	double a12 = Double.parseDouble(strA12);
        	double b1 = Double.parseDouble(strB1);
        	double a21 = Double.parseDouble(strA21);
        	double a22 = Double.parseDouble(strA22);
        	double b2 = Double.parseDouble(strB2);

        	double D = a11 * a22 - a21 * a12;
        	double D1 = b1 * a22 - b2 * a12;
        	double D2 = a11 * b2 - a21 * b1;

        	if (D == 0) {
            		if (D1 == 0 && D2 == 0) {
                		JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            		} else {
                		JOptionPane.showMessageDialog(null, "The system has no solution.");
            		}
        	} else {
            	double x1 = D1 / D;
            	double x2 = D2 / D;
            	JOptionPane.showMessageDialog(null, "The solution is: x1 = " + x1 + ", x2 = " + x2);
        	}
    	}

    	public static void solveSecondDegreeEquation() {
                String strA = JOptionPane.showInputDialog("Enter coefficient a:");
        	double a = Double.parseDouble(strA);

        	if (a == 0) {
            		JOptionPane.showMessageDialog(null, "a cannot be zero for a second-degree equation.");
            		return;
        	}

        	String strB = JOptionPane.showInputDialog("Enter coefficient b:");
        	double b = Double.parseDouble(strB);

        	String strC = JOptionPane.showInputDialog("Enter constant c:");
        	double c = Double.parseDouble(strC);

        	double discriminant = b * b - 4 * a * c;

        	if (discriminant > 0) {
            		double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            		double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            		JOptionPane.showMessageDialog(null, "The equation has two distinct real roots: x1 = " + root1 + ", x2 = " + root2);
        	} else if (discriminant == 0) {
            		double root = -b / (2 * a);
            		JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + root);
        	} else {
            		JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        	}
    	}
}
