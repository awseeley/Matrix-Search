package ibm;

public class Matrix {

	private char[][] chars; // [Row][Column]

	/**
	 * Create a new n x m matrix where all strings are equal length. If they are not equal length an exception is thrown.
	 * @param strMatrixText The string you wish to create a matrix from.
	 */
	public Matrix(String strMatrixText){
		// Check how many lines we need
		int matrixLines = countLines(strMatrixText); // Check the # of lines in the matrix graph. If -1 then we have an invalid matrix.
		
		if(matrixLines != -1) {
				// Create the Matrix
			   String[] lines = strMatrixText.split("\r\n|\r|\n"); // Split the string by different types of terminators (Windows, Unix, etc...)
			
			   int lineLength = lines[0].length(); // The length of the lines
			   
			   this.chars = new char[matrixLines][lineLength]; // Create out matrix array with chars
			   		   
			   for(int r = 0; r < matrixLines; r++) { // For each row
				   char[] lineChars = lines[r].toCharArray(); // Get the line string
				   for(int c = 0; c < lineLength; c++) { // For each column
					   this.chars[r][c] = lineChars[c]; // Place the entire string in that column
				   }
			   }
			
		} else {
			throw new IllegalArgumentException("Invalid matrix, please ensure all strings are equal length.");
		}

	}
	
	/**
	 * Returns true there is a match on any given line. The search starts from the start index and finishes at the end index.
	 * @param Line The line you are searching.
	 * @param String The string you are searching for in the line
	 * @param StartIndex The start position that you want to begin the search.
	 * @param lastIndex The end position that you want to finish the search.
	 */
	public boolean isMatchLine(char[] Line,String searchStr, int startIndex, int lastIndex) {
		// Convert the Line[] chars array to a string for easier searching.
		String LineString = "";	
		if(startIndex > lastIndex) { // We are searching backwards, so get the string and reverse it.
			LineString = new String(Line, lastIndex, startIndex - lastIndex + 1);	
			LineString = new StringBuilder(LineString).reverse().toString();
		} else { // Search string forwards
			LineString = new String(Line, startIndex, lastIndex - startIndex + 1);	
		}

		return LineString.contains(searchStr); // Returns if the string is contained in the Line
		
	}
	
	/**
	 * Returns the matrix.
	 * @return char[][]
	 */
	public char[][] getMatrix() {
		return chars;
	}
	
	/**
	 * Count the number of lines given in a string and ensure the strings will fit in a n x n character array. Returns -1 if invalid.
	 * @param str The matrix string you wish to count the lines for.
	 * @return int
	 */
	private static int countLines(String str) {
		   String[] lines = str.split("\r\n|\r|\n"); // Split the string by different types of terminators (Windows, Unix, etc...)
		   int lineLength = lines[0].length();
		   
		   // Ensure the string array is n x n, if it dosen't meet this condition return -1
		   for(int i = 0; i < lines.length; i++) { // Loop over each line
			   
			   if(lines[i].length() != lineLength) {
				   return -1;
			   }
		   }
		   		   
		   return lines.length; // Total number of lines in the string
	}
	
}
