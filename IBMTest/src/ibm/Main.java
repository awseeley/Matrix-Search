package ibm;

public class Main {

	public static void main(String[] args) {

	}
	
	/**
	 * Searches a matrix lines for a particular string. Each line is searched forwards and backwards.
	 * Returns true if the string is found, false otherwise.
	 * Search strings are case sensitive
	 * @param myMatrix The matrix you wish to search in.
	 * @param searchStr The string you wish to search for.
	 * 
	 */
	public boolean searchMatrix(Matrix myMatrix, String searchStr) {
		boolean found = false; 
		
		for(int i = 0; i < myMatrix.getMatrix().length; i++){ // Loop through each line in the matrix
			
			char line[] = myMatrix.getMatrix()[i]; // Get the next line from the matrix
			
			// The start and end index you wish to search the line
			int startIndex = 0;
			int endIndex = line.length - 1;
			
			// If the string is found in the line, return true and exit the loop
			if(myMatrix.isMatchLine(line, searchStr, startIndex, endIndex) == true) {
				found = true;
				break;
			}
			
			// Search backwards in the line as well;
			if(myMatrix.isMatchLine(line, searchStr, endIndex, startIndex) == true) {
				found = true;
				break;
			}
		}

		return found;
		
	}
	
	
}
