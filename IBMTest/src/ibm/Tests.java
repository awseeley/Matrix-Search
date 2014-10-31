package ibm;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testOneLine() {
		Main main1 = new Main();
		String matrixText = 	
				"DOG\n"
			+ 	"CAT\n"
			+ 	"FOX";
	
		Matrix matrix1 = new Matrix(matrixText);
		String searchStr = "CAT";
	
		boolean found = main1.searchMatrix(matrix1, searchStr);	
		assertTrue(found);
		
	}
	
	@Test
	public void testMultipleLines() {
		Main main1 = new Main();
		String matrixText = 	
				"LOOPS\n"
			+ 	"TRUCK\n"
			+ 	"SCARY\n"
			+ 	"WINGS";
	
		Matrix matrix1 = new Matrix(matrixText);
		String searchStr = "WINGS";
	
		boolean found = main1.searchMatrix(matrix1, searchStr);	
		assertTrue(found);	
	}
	
	@Test
	public void testReverseLine() {
		Main main1 = new Main();
		String matrixText = 	
				"YLF\n"
			+ 	"SUB\n"
			+ 	"GUH";
	
		Matrix matrix1 = new Matrix(matrixText);
		String searchStr = "HUG";
	
		boolean found = main1.searchMatrix(matrix1, searchStr);	
		assertTrue(found);
	}
	 
	
}
