import java.util.Random;
import javax.swing.JOptionPane;

	
	public class Matrizes {

	public static void main(String[] args) {
		
		
		int rows;
		int columns;
		
		String strRows = JOptionPane.showInputDialog("Enter the amount of rows here: ");
		rows = Integer.parseInt(strRows);
		
		String strColumns = JOptionPane.showInputDialog("Enter the amount of columns here: ");
		columns = Integer.parseInt(strColumns);
		
		int matrix1[][];
		int matrix2[][];
		
		matrix1 = new int [rows][columns];
		matrix2 = new int [rows][columns];
		
		
		for(int i = 0; i < rows; i++) {	
			for(int j = 0; j < columns; j++) {
				
                matrix1[i][j] = new Random().nextInt(25);
			}
		}
		
		for(int i = 0; i < rows; i++) {	
			for(int j = 0; j < columns; j++) {
				matrix2[i][j] = new Random().nextInt(25);
			}
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.println("The numbers of Matrix1 are: " + matrix1[i][j] + " ");

			}
		}
		
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				
				System.out.println("The numbers of Matrix2 are: " + matrix2[i][j] + " ");
			}
		}
				
				
	   }
	}

