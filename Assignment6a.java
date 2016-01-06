
import javax.swing.JOptionPane;


public class  Assignment6a {
	
public static void main(String[] args){ 
	JOptionPane.showMessageDialog(null, "Sudoku Game");
	System.out.println("Game board:");
    SudokuSquareLinkedList Board =new SudokuSquareLinkedList(new SudokuSquareNode(new SudokuSquare(0,0,3,true)));
    // values from file
    Board.append(new SudokuSquareNode(new SudokuSquare(1,1,2,true)));
    Board.append(new SudokuSquareNode(new SudokuSquare(1,3,3,true)));
    Board.append(new SudokuSquareNode(new SudokuSquare(2,0,4,true)));
    Board.append(new SudokuSquareNode(new SudokuSquare(2,2,2,true)));
    Board.append(new SudokuSquareNode(new SudokuSquare(3,1,1,true)));
    //using test method
    test(new SudokuBoard(Board));
}

// method test
public static void test(SudokuBoard Board) {
    print(Board);
    while(!Board.isFull()) {
        String [] answer = JOptionPane.showInputDialog(null, "In order to play please enter row, column and value. Please remember to enter a comma after every number!").split(",");
        // parsing in the values in order of what was entered for each variable
        int row = Integer.parseInt(answer[0]);
        int column = Integer.parseInt(answer[1]);
        int value = Integer.parseInt(answer[2]);
        try {
            Board.enterMove(row, column, value);
        } catch(SudokuException exception) {
            System.out.println("Exception");
        }
        print(Board);
    }// end of while loop
} // end of test
public static void print(SudokuBoard Board) {

   for(int i = 0; i < 4; i++) {
	   for(int j = 0; j < 4; j++) {
       System.out.print(Board.getSquare(i,j).getValue() + "  ");
        } // end of for
        System.out.println();
    } // end of for
    System.out.println();
	} // end of printBoard
} // end of class
