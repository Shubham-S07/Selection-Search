
public class selectionSort {

	public static void main(String[] args) {
		
		selectionSort obj = new selectionSort();

		int[] arr = { 64, 56, 34, 12, 22, 11, 88, 90, 1 };
		obj.printArray(arr);
		obj.selectionSort(arr);
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int min_idx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
		
	}

}
