
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class  Assignment6bc {
	
public static void main(String[] args){ 
	JOptionPane.showMessageDialog(null, "Sudoku Game");
	SudokuGUI GUI = new SudokuGUI("Sudoku Game");
	GUI.setVisible(true);
	
 SudokuSquareLinkedList list = new SudokuSquareLinkedList();
    try {
    	BufferedReader br = new BufferedReader(
				new InputStreamReader(
				new FileInputStream("textfile.txt")));
String line = br.readLine();
while (line!=null){
	int i =0;
        	StringTokenizer st = new StringTokenizer(line, " ");
        	while(st.hasMoreElements()) {
        		if(i==0) {
        			String x = st.nextElement().toString();
        			int a = Integer.parseInt(x);
        			String y = st.nextElement().toString();
        			int b = Integer.parseInt(y);
        			String z = st.nextElement().toString(); 
        			int c = Integer.parseInt(z);
        			list = new SudokuSquareLinkedList(new SudokuSquareNode(new SudokuSquare(a, b, c, true)));
        			i++;
        		
        		}
        	}
           
        }    
           br.close();            
      }catch(IOException ex) {
        	System.out.println("Incorrect File");
      }catch(Exception e) {                   
    		System.out.println("Error");
      }
    
}
}
	