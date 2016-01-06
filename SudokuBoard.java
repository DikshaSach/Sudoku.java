
public class SudokuBoard {
	// 4x4 array
	SudokuSquare array[][] = new SudokuSquare[4][4];
// takes in sudokusquarelinkedlist object
	public SudokuBoard(SudokuSquareLinkedList list) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// initial value should be 0
				array[i][j] = new SudokuSquare(i, j, 0, false);
			}
		}
		// go through nodes and set up squares using getNext
		SudokuSquareNode n = list.getNext();
		SudokuSquare sudSquare = n.getData();
		while (n != null) {
			array[sudSquare.getRow()][sudSquare.getColumn()] = new SudokuSquare(sudSquare.getRow(), sudSquare.getRow(), sudSquare.getValue(), true);
			n = list.getNext();
			if (n != null) {
				sudSquare = n.getData();
			}

		}

	}
	
 // method isValid takes in three int's only returns true if the value is a legal move
	public boolean isValid(int r, int c, int v) {
		if(array[r][c].isLocked()){
			System.out.println("You enter an invalid number please try again!");
			return false;
		}
		if(array[r][c].getValue()==v) {
			System.out.println("true");
			return true;
					
		}	
		for (int i = 0; i < 4; i++) {
			if (i != c && array[r][i].getValue() == v) {
				System.out.println("You enter an invalid number please try again!");
				return false;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (i != r && array[i][c].getValue() == v) {
				System.out.println("You enter an invalid number please try again!");
				return false;
			}
		}

		int x = r / 2;
		int y = c / 2;
		x = x * 2;
		y = y * 2;
		for (int i = x; i <= x + 1; i++) {
			for (int j = y; j < y + 1; j++) {
				if ((array[i][j].getValue() == v)) {
					return false;
				}
			}
		}
		return true;
	}
// enterMove method takes in three int's
	// should call isValid method and if it's false board shouldn't be changed
	public void enterMove(int r, int c, int v) throws SudokuException {
		if (isValid(r, c, v)) {
			array[r][c].setValue(v);
		} else { 
			// throw exception if the board isn't changed
			throw new SudokuException("Invalid Move try again");
		}
	}
// reset the values to 0
	public void reset() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (!array[i][j].isLocked()) {
					array[i][j].setValue(0);
				}
			}
		}
	}
// return true only when the board has no 0 values
	public boolean isFull() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j].getValue() == 0) {
					return false;
				}
			}
		}
		return true;
	}
	// will return Square object specified by the row and column parameter
	public SudokuSquare getSquare(int r, int c) {
		return array[r][c];
	}
	
}