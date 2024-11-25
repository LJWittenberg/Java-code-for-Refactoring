public class TestMergesort {

	public static void main(String[] args) {
		int[] arrtest = new int[6];
		arrtest[0] = 100;
		arrtest[1] = 3;
		arrtest[2] = 5;
		arrtest[3] = 0;
		arrtest[4] = 2;
		arrtest[5] = 1;

		for(int i = 0; i < arrtest.length; i++) {
			System.out.println("Ausgabe des Arrays vor der Sortierung: " + arrtest[i]);
		}

		Mergesort.sort(arrtest);

		for(int i = 0; i < arrtest.length; i++) {
			System.out.println("Ausgabe des Arrays nach der Sortierung: " + arrtest[i]);
		}

	}


}
