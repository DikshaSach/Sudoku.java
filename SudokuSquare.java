
public class SudokuSquare {
int row;
int column;
int value;
boolean locked;

public SudokuSquare(int r, int c, int v, boolean l) {
	// TODO Auto-generated constructor stub
	if ((r<1)||(r>4)) {
		row = 0; 
	} else {
		row = r;
	}
	if ((c<1)||(c>4)) {
		column = 0;
	} else {
		column = c;
	}
	if ((v>=1) && (v<=4)) {
		value = v;
	} else {
		value =0;
	}
	
	
	locked = l;

}
// getter and setters
public int getRow(){
	return row;	
}
public int getColumn(){
	return column;
}
public int getValue(){
	return value;
}
public boolean isLocked (){
	return locked;
}
public void setValue(int v){
	//ensure that the value is valid meaning 0-4
	if ((v>=0)&&(v<=4) && (!locked)) { 
	value = v;
}
}
}