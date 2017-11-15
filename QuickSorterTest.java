import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSorterTest {
	@Test
	public final void testPartition() {
		int[] test1 = {-2, 0, 5, 3, 10};
	    int i = QuickSorter.partition(test1, 0, 4);
		assertTrue(i == 0);
		
		int[] test2 = {1, 5, 2, 9, 4};
	    i = QuickSorter.partition(test2, 0, 4);
		assertTrue(i == 0);
		
		int[] test3 = {4, 1, 8, 3, 2};
	    i = QuickSorter.partition(test3, 0, 4);
		assertTrue(i == 3);
		
		int[] test4 = {13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
	    i = QuickSorter.partition(test4, 0, 14);
		assertTrue(i == 12);
	}
}
