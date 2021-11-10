public class ImprovedSelectionSort {

	static void sort(int array[]) {
        //System.out.println("array.length=" + array.length);
		for(int n = 0; n <= (array.length - 1); n++) {
            //System.out.println("==== Sort Durchlauf n=" + n+ " ====");
            //print(array);

            // nMin

			int nMin = n;

            //System.out.println("nMin initalized to "+ nMin);

			for(int t = n + 1; t < array.length; t++) {
                //System.out.println("= t=" + t + " =");

				if(array[t] < array[nMin]) {
                    //System.out.println("array[t] < array[nMin]");
					nMin = t;
                    //System.out.println("nMin set to " + nMin);
				}
			}

			if(array[nMin] < array[n]) {

				int temp = array[nMin];
	            array[nMin] = array[n];
	            array[n] = temp;
			}

            // nMax

            int nMax = n;

            //System.out.println("nMax initalized to "+ nMax);
            
            for(int t = n + 1; t < array.length - n; t++) {
                if(array[t] > array[nMax]) {
                    //System.out.println("array[t] > array[nMax]");
					nMax = t;
                    //System.out.println("nMax set to " + nMax);
				}
            }

            if(array[nMax] > array[n]) {
                int temp = array[nMax];
	            array[nMax] = array[array.length - n - 1];
	            array[array.length - n - 1] = temp;
            }

            /*boolean fehler = false;

            for(int i = 0; i < array.length; i++) {
                if(array[i] != richtig[n][i]) {
                    fehler = true;
                }
            }

            if(fehler) {
                System.out.println("Zwischenergebnis falsch");
            } else {
                System.out.println("Zwischenergebnis richtig");
            }*/

            if((array.length - n) - (n + 1) <= 1) {
                return;
            }
		}
        
        //System.out.println("====== FINISHED =======");
	}
    static private void print(int[] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
}
