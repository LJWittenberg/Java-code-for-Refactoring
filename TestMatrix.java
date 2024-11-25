class TestMatrix {
	
	public static void main(String[] args) {

	String[][] matrix = new String[][] { // TestMatrix 
		{"Elden Ring", "Bloodborne", "Darksouls 1", "Darksouls 2"},
		{"Radahn", "Ludwig", "Ornstein", "Pursuer"}
	};
 
	Matrix<String> tmatrix = new Matrix<String>(matrix); // Initialisierung des Strings als Matrix

	System.out.println("Anzahl der Zeilen der Matrix: " + tmatrix.getNumRows() + "\nAnzahl der Spalten der Matrix: " + tmatrix.getNumCols()); // Ausgabe der Zeilen und  	//Spalten der Matrix
	
	tmatrix.set("Malenia", 1, 0); // Änderung eines Elements
	System.out.println("tmatrix[1][0]: " + tmatrix.get(1, 0)); // Ausgabe des geänderten Elements

	for( int i = 0; i < tmatrix.getNumRows();i++) { // Ausgabe der gesamten Matrix mit getRow und getCol als Begrenzungen
		for(int j = 0; j < tmatrix.getNumCols();j++) { 
			System.out.println("Ausgabe der Matrix bei den Indexen " + i + " und " + j + " " + tmatrix.get(i, j));
		}
	}
	
	}
		

}
