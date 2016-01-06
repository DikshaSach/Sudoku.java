

// identical to Node1 except data element of type SudokuSquare!
public class SudokuSquareNode {
	private SudokuSquare data;
	private SudokuSquareNode next;

	public SudokuSquareNode(SudokuSquare sq) {
		
		data = sq;
	}

	public SudokuSquareNode(SudokuSquare sq, SudokuSquareNode n) {
		data = sq;
		next = n;
	} 

	public SudokuSquare getData() {
		return data;
	}

	public SudokuSquareNode getNext() {
		return next;
	}

	public void setNext(SudokuSquareNode n) {
		next = n;
	}
}