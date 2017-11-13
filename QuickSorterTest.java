import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSorterTest {

	//@Test
//	public final void testQuickSort() {
		//fail("Not yet implemented"); // TODO
	// do i make a test for this portion too?
//	}

	@Test
	public final void testPartition() {
		int[] test1 = {-2, 0, 5, 3, 10};
		QuickSorter.quickSort(test1, 0, 4);
		assertTrue(test1[0] == -2 && test1[1] == 0 && test1[2] == 3 && 
					test1[3] == 5 && test1[4] == 10);
	}

	//@Test
//	public final void testSwap() {
//		fail("Not yet implemented"); // TODO
//	}

}
