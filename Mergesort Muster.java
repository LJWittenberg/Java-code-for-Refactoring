public class Mergesort {

    // von aussen zugreifbare Sortier-Methode
	public static void sort(int[] arr) {
		if(arr.length <= 1) {
			return;
		}
		else {
			int Mitte = arr.length / 2;
			int[] arrL = new int[Mitte];
			int[] arrR = new int[arr.length-Mitte];

			for( int i = 0; i < Mitte; i++) {
				arrL[i] = arr[i];
			}
			for( int i = Mitte; i < arr.length; i++) {
				arrR[i - Mitte] = arr[i];
			}
			sort(arrL);
			sort(arrR);
			merge(arr, arrL, arrR, Mitte, arr.length-Mitte);
		}
	
	}

	public static void merge(int[] a, int[] L, int[] R, int left, int right) {
		int[] g = new int[a.length];

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
        		if (L[i] <= R[j]) {
            		g[k++] = L[i++];
       		}
        		else {
           			g[k++] = R[j++];
        		}
		}
    		while (i < left) {
        		g[k++] = L[i++];
   		}
    		while (j < right) {
        		g[k++] = R[j++];
   		}
		for( int n = 0; n < g.length; n++) {
			a[n] = g[n];
		}
	}


}
