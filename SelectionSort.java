public class SelectionSort {
	static void sort(int array[]) {
		for(int i = 0; i <= array.length - 1; i++) {
			int min = array[i];
			int Imin = 0;
			for(int t = i; t < array.length; t++) {
				if(array[t] < min) {
					min = array[t];
					Imin = t;
				}
			}
			if(min < array[i]) {
				int temp = array[Imin];
	            array[Imin] = array[i];
	            array[i] = temp;
			}
		}
	}
	static void print(int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
	}
}
