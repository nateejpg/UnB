import javax.swing.JOptionPane;

public class ArrayOperations {

	public static void main(String[] args) {
		
		
		// input of arrays
		
		int size1, size2;
		
		String strSize1 = JOptionPane.showInputDialog("Enter the size of the First Array:");
		size1 = Integer.parseInt(strSize1);
		
		
		String strSize2 = JOptionPane.showInputDialog("Enter the size of the Second Array:");
		size2 = Integer.parseInt(strSize2);
		
		// Declare Arrays and create them
		
		int array1[];
		int array2[];
		int arraySum[];
		int arrayTimes[];
		int arrayMinus[];
		
		int minSize = Math.min(size1, size2);
		
		array1 = new int [size1];
		array2 = new int [size2];
		
		// To add to a new array of the required operation;
	
		arraySum = new int[minSize];
	    arrayTimes = new int[minSize];
		
		// Get the elements from the arrays;
		
		for(int i = 0; i < size1; i++) {
			
			String strNums1 = JOptionPane.showInputDialog("Enter numbers of First Array: ["+ i +"]");
			
			array1[i] = Integer.parseInt(strNums1);
			
			
		}
		
		for(int i = 0; i < size2; i++) {
			
			String strNums2 = JOptionPane.showInputDialog("Enter numbers of Second Array: ["+ i +"]");
			
			array2[i] = Integer.parseInt(strNums2);
			
		}
		
		
		// Array Operations
				
		int entireSum = 0;
		int entireSubs = 0;
		int entireTimes = 1;
		
		
				for(int i = 0; i < arraySum.length; i++) {
					
					arraySum[i] = array1[i] + array2[i];
					
					// To sum into a single variable the entire result;
					
					entireSum += arraySum[i];
					
				}
			
			
				for(int i = 0; i < arrayTimes.length; i++) {
					
					arrayTimes[i] = array1[i] * array2[i];
					
					entireTimes *= arrayTimes[i];
				}
				
				
				
		// print the Arrays
				
		
		
		// Print the results;
			
				
			JOptionPane.showMessageDialog(null, 
					"The entire sum of the arrays is: " + entireSum + "\n" + 
					"The entire product of the arrays is: " + entireTimes + "\n"
					);
			
			
		

	}

}
