package sort;

public class Sort {
	public static void quickSort(int[] sortArray, int left, int right) {
		if (left < right) {
			int key = sortArray[left];
			int low = left;
			int high = right;
			while (low < high) {
				while (low < high && sortArray[high] >= key) {
					high--;
				}
				sortArray[low] = sortArray[high];
				while (low < high && sortArray[low] < key) {
					low++;
				}
				sortArray[high] = sortArray[low];
			}
			sortArray[low] = key;
			quickSort(sortArray, left, low - 1);
			quickSort(sortArray, low + 1, right);
		}
	}
}
