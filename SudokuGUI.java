
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;




public  class SudokuGUI extends JFrame implements ActionListener, MouseListener{
	

		JTextField textfield1 = new JTextField("The Sudoku game has begun");
		JTextField textfield2 = new JTextField("Please enter numbers 1-4 here. Then click  a box");
		JRadioButton button1 = new JRadioButton("Valid");
		JRadioButton button2 = new JRadioButton("Enter");
		JRadioButton button3 = new JRadioButton("Clear");
		JRadioButton button4 = new JRadioButton("Reset");
		JButton button5 = new JButton("3");//00
		JButton button6 = new JButton(" ");//01
		JButton button7 = new JButton(" ");//02
		JButton button8 = new JButton("");//03
		JButton button9 = new JButton(" ");//10
		JButton button10 = new JButton("2");//11
		JButton button11= new JButton(" ");//12
		JButton button12 = new JButton("3");//13
		JButton button13 = new JButton("4");//20
		JButton button14 = new JButton(" ");//21
		JButton button15 = new JButton("2");//22
		JButton button16 = new JButton(" ");//23
		JButton button17 = new JButton(" ");//30
		JButton button18 = new JButton("1");//31
		JButton button19 = new JButton(" ");//32
		JButton button20 = new JButton(" "); //33
		
		public SudokuGUI(String x){
			setTitle(x); 
			textfield1.setEditable(false);
			button5.setEnabled(false);
			button10.setEnabled(false);
			button13.setEnabled(false);
			button12.setEnabled(false);
			button15.setEnabled(false);
			button18.setEnabled(false);
			setLayout(new GridLayout (6,4,4,4));
			setLocation(350,300);
			
			button1.addMouseListener(this);
			button2.addMouseListener(this);
			button3.addMouseListener(this);
			button4.addMouseListener(this);
			button6.addMouseListener(this);
			button7.addMouseListener(this);
			button8.addMouseListener(this);
			button9.addMouseListener(this);
			button11.addMouseListener(this);
			button14.addMouseListener(this);
			button16.addMouseListener(this);
			button17.addMouseListener(this);
			button19.addMouseListener(this);
			button20.addMouseListener(this);
			textfield2.addMouseListener(this);
			
			add(button1);
			add(button2);
			add(button3); 
			add(button4);
			add(button5);
			add(button6);
			add(button7);
			add(button8);
			add(button9);
			add(button10);
			add(button11);
			add(button12);
			add(button13);
			add(button14);
			add(button15);
			add(button16);
			add(button17);
			add(button18);
			add(button19);
			add(button20);
			add(textfield1);
			add(textfield2);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(700,400);
			
		}
		 
		

		public void reset(){
			//this.JFrame.close();
			int result = JOptionPane.showConfirmDialog (null, "Do you really wanna reset the board?");
			if(result==0){
				button6.setText(" ");
				button7.setText(" ");
				button9.setText(" ");
				button11.setText(" ");
				button19.setText(" ");
				button20.setText(" ");
				button12.setText(" ");
				button7.setText(" ");
			}
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			String field = textfield2.getText();
			// TODO Auto-generated method stub
			
		
			if(e.getSource()==button4){
				reset();
			}
		

			if(e.getSource()==button5){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button5.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button6){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button6.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button7){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
				JOptionPane.showMessageDialog(null, "you can only use numbers 1-4");
				}
				else {
				button7.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button8){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number");
				}
				else {
				button8.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button9){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number1-4");
				}
				else {
				button9.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button10){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button10.setText(textfield2.getText());
				}
			}
			
			if(e.getSource()==button11){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4 ");
				}
				else {
				button11.setText(textfield2.getText());
				}
			}
					
			if(e.getSource()==button12){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number1-4 ");
				}
				else {
				button12.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button13){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button13.setText(textfield2.getText());
				}
			}

			
			if(e.getSource()==button14){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button14.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button15){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button15.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button16){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");	
				}
				else {
				button16.setText(textfield2.getText());
				}
			}
			
			if(e.getSource()==button17){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button17.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button18){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button18.setText(textfield2.getText());
				}
			}
			if(e.getSource()==button19){
			int x = Integer.parseInt(field);
				if((x<1) || (x>4)) {
					JOptionPane.showMessageDialog(null, "you can only use number 1-4");
				}
				else {
				button19.setText(textfield2.getText());
				}
			}
				if(e.getSource()==button20){
					int x = Integer.parseInt(field);
						if((x<1) || (x>4)) {
							JOptionPane.showMessageDialog(null, "you can only use number 1-4");
						}
						else {
						button20.setText(textfield2.getText());
						}
					}
			}
		

		@Override
		public void mouseEntered(MouseEvent d) {
			// TODO Auto-generated method stub
			
			if(d.getSource()==textfield2){
				textfield2.setBackground(Color.red);
			}
		}

		@Override
		public void mouseExited(MouseEvent c) {
			// TODO Auto-generated method stub
			
			if(c.getSource()==textfield2){
				textfield2.setBackground(Color.pink);
			}
			
		}

		@Override
		public void mousePressed(MouseEvent b) {
			// TODO Auto-generated method stub
			
		}
		

		@Override
		public void mouseReleased(MouseEvent a) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}



			
		}
		
	