
public class QuickSort {

public static void quickSort (int [] arr, int lo, int hi) {
	if (lo < hi) {
		int pivotIndex = partition (arr, lo, hi);
		quickSort (arr, lo, pivotIndex - 1);
		quickSort (arr, pivotIndex + 1, hi);
	}
}
	public static int partition (int [] arr, int lo, int hi) {
	int pivot = arr [0];  
	for (int i = 1; i < arr.length; i++) { 
		if (arr [i] < arr [0]) {
		arr [i] = arr [0 -1];
		
		}
	//	else 
}
		return pivot;
	}
}
