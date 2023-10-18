import javax.swing.JOptionPane;

public class pocoperations {
	
	public static void main(String[] args) {
		
		double num1, num2 = 0;
		double result = 0;
		int sum, div, sub, times;
		
		String nume1 = JOptionPane.showInputDialog("Enter your first number: \n ");
		num1 = Double.parseDouble(nume1);
		
		String nume2 = JOptionPane.showInputDialog("Enter your second number: \n");
		num2 = Double.parseDouble(nume2);
	
		String choice = JOptionPane.showInputDialog("What operation you  want to "
				+ "perform?  + - * / \n ");
		
		
		switch(choice) {
		
			case "+": 
			
				result = num1 + num2;
				
			    break;
			
			case "-":
				
				result = num1 - num2;
				
				break;

			case "*":
				
				result = num1 * num2;
				
				break;
				
			case "/":
				
				if(num1 != 0) {
					
				result = num1 / num2;
					
				}else {
					
					String message = "Number != 0";
					JOptionPane.showInternalMessageDialog(null,message);
					
					return;
				}
				
				break;
			
			
		}
		
		String resultWords = String.valueOf(result);
		
				
		String resultFull = "The result of your operation is:" + resultWords + "! \n";
		
		JOptionPane.showInternalMessageDialog(null, resultFull);
		
		
	}

}
