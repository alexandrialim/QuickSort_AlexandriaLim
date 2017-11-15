
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		if(lo < hi){
			int pivotIndex;
			pivotIndex = partition(arr,lo,hi);
			quickSort (arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
		}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		/*
		 * Partition the integer array arr[] from lo to hi.
		 * Should return the index of the pivot element.
		 */
		//System.out.println(lo + " " + hi);
		int p = arr[lo]; // p = pivot num
		int i= lo + 1;
		int j = hi;
		int temp;
	while(i < j){
			while (arr[i] <= p && i < j){
				i++;
				
			}
				//System.out.println(lo + "  " + hi);
			while (arr[j] >= p && j >= i){
				j--;	
				
			}
				//System.out.println(lo + "  " + hi);
			if(i <= j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				//i++;
				//j--;
			}
	}
	arr[0]= arr[i];
	arr[j] = p;
	return  j;
	}
}
