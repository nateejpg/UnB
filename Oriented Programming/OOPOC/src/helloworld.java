import javax.swing.JOptionPane;

public class helloworld {
	
	public static void main(String[] args) {
		
		
		String name, message;
		
		name = JOptionPane.showInputDialog("Enter your name: \n");
		
		message = "Hello World! " + name;
		
	    JOptionPane.showMessageDialog(null, message);
		
	}

}
