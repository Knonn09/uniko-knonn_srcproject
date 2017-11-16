import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PublicTests {

	int[] inputA;
	int[] inputB;
	int[] inputC;
	
	int[][] resultA;
	int[][] resultB;
	int[][] resultC;
	
	@Before
	public void init() {
		int[] inputA = {42,3,73,11,5};
		this.inputA = inputA;
		int[] inputB = {1231,-521,-1234,611,2,65};
		this.inputB = inputB;
		int[] inputC = {15,3,11,7};
		this.inputC = inputC;
		
		int[][] resultA = 
			{ { 42, 3, 73, 11, 5 }, 
			  { 3, 42, 73, 11, 5 }, 
			  { 3, 42, 73, 11, 5 }, 
			  { 3, 11, 42, 73, 5 },
			  { 3, 5, 11, 42, 73 } };
		this.resultA = resultA;
		
		int[][] resultB = 
				{ { 1231, -521, -1234, 611, 2, 65 }, 
				  { -521, 1231, -1234, 611, 2, 65 },
				  { -1234, -521, 1231, 611, 2, 65 }, 
				  { -1234, -521, 611, 1231, 2, 65 },
				  { -1234, -521, 2, 611, 1231, 65 }, 
				  { -1234, -521, 2, 65, 611, 1231 } };
		this.resultB = resultB;
		
		int[][] resultC = 
				{ { 15, 3, 11, 7 }, 
				  { 3, 15, 11, 7 }, 
				  { 3, 11, 15, 7 }, 
				  { 3, 7, 11, 15 } };
		this.resultC = resultC;
		
	}
	
	@Test
	public void test() {
		assertArrayEquals(resultA, Functionality.insertionSort(inputA));
		assertArrayEquals(resultB, Functionality.insertionSort(inputB));
		assertArrayEquals(resultC, Functionality.insertionSort(inputC));
	}
}
