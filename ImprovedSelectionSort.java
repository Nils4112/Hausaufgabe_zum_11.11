public class ImprovedSelectionSort {

	static void sort(int array[]) {
		for(int n = 0; n <= (array.length - 1); n++) {

            // nMin
			int nMin = n;

			for(int t = n + 1; t < array.length; t++) {
				if(array[t] < array[nMin]) {
					nMin = t;
				}
			}

			if(array[nMin] < array[n]) {
				int temp = array[nMin];
	            array[nMin] = array[n];
	            array[n] = temp;
			}

            // nMax
            int nMax = n;

            for(int t = n + 1; t < array.length - n; t++) {
                if(array[t] > array[nMax]) {
					nMax = t;
				}
            }

            if(array[nMax] > array[n]) {
                int temp = array[nMax];
	            array[nMax] = array[array.length - n - 1];
	            array[array.length - n - 1] = temp;
            }

            if((array.length - n) - (n + 1) <= 1) {
                return;
            }
		}
	}

    static void print(int[] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
}
