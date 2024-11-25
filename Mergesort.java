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
			merge(arr, arrL, arrR);
		}
	
	}

	public static void merge(int[] a, int[] L, int[] R) {
		int[] g = new int[a.length];
		int k = 0;
		int i = 0;
		int j = 0;

		while( i < L.length && j < R.length) {
			if( L[i] <= R[j]) {
				g[k] = L[i];
				i++;
				k++;
			}
			else {
				g[k] = R[j];
				k++;
				j++;
			}
		}
    		while (i < L.length) {
        		g[k] = L[i];
			k++;
			i++;
   		}
    		while (j < R.length) {
        		g[k] = R[j];
			k++;
			j++;
   		}
		for( int n = 0; n < g.length; n++) {
			a[n] = g[n];
		}
	}


}
