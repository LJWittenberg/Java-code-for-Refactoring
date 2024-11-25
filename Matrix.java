/** Klasse Matrix mit generischem Typparameter T fuer die Matrixelemente. 
  * T muss in der Vererbungshierarchie unter Comparable<T> stehen, also
  *     der eingesetzte Datentyp T muss das Interface Comparable implementieren
  *     und mit anderen T (was auch immer T ist) vergleichbar sein. Die einzelnen
  *     Matrixelemente sind also ueber compareTo() vergleichbar.
  * Weiterhin implementiert die Klasse Matrix selbst das Interface Comparable, um
  *     mit anderen Matritzen mit gleichem generischen Typparameter T vergleichbar
  *     zu sein.
  */
class Matrix<T extends Comparable<T>> implements Comparable<Matrix<T>> {

	private T[][] mat; // [Zeilen][Spalten]	

	/* Methoden */
	
    

    // Konstruktor
	public Matrix(T[][] mat) {
		this.mat = mat;
	}
    

    // Anzahl der Zeilen
	public int getNumRows() { // gibt die Anzahl der Zeilen der Matrix zurück
		int rows = 0;
		for(int i = 0; i < mat.length;i++) {
			rows++;
		}
		return rows;
	}
    

    // Anzahl der Spalten
	public int getNumCols() { // gibt die Anzahl der Spalten der Matrix zurück
		int colums = 0;
		for(int i = 0; i < this.mat[0].length;i++) {
			colums++;
		}
		return colums;
	}
		

    // Getter
	public T get(int i, int j) { // gibt den Inhalt der Matrix bei den Indexen i und j zurück
		return this.mat[i][j];
	}
		
    

    // Setter
	public void set(T val, int i, int j) { // Ersetzt den Inhalt der Matrix bei den Indexen i und j
			this.mat[i][j] = val;
	}
		
    
    // Vergleicht zwei Matrizen anhand des minimalen Elements
    public int compareTo(Matrix<T> other) {
        
        // Minimum in dieser Matrix
        T minThis  = mat[0][0]; 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (minThis.compareTo(mat[i][j]) > 0) { // Kleineres Elem gefunden
                    minThis = mat[i][j];
                }
            }
        }

        // Minimum in der Matrix other
        T minOther = other.get(0,0);
        for (int i = 0; i < other.getNumRows(); i++) {
            for (int j = 0; j < other.getNumCols(); j++) {
                if (minOther.compareTo(other.get(i,j)) > 0) { // Kleineres Elem gefunden
                    minOther = other.get(i,j);
                }
            }
        }

        // Minimalwerte vergleichen
        return minThis.compareTo(minOther);
        
    }

}
