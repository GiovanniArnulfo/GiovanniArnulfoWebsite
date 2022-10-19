import javax.swing.*;
import java.awt.event.*;

public class Grid extends JFrame implements ActionListener{
  private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
  private JLabel tag;
    
    public Grid( ){
      setLayout(null);  

      tag= new JLabel("Waiting boutton selected...");
      tag.setBounds(10,0,200,30);
      add(tag);

      
      b1= new JButton(); 
      b1.setIcon(new ImageIcon("keyboard/b3.gif"));
      b1.setBounds(10,30,50,50);
      add(b1);
      b1.addActionListener(this);
  
      b2= new JButton("2");
      b2.setBounds(60,30,50,50);
      add(b2);
      b2.addActionListener(this); 
          
      b3= new JButton();
      b3.setIcon(new ImageIcon("keyboard/walum.jpg"));
      b3.setBounds(115,30,50,50);
      add(b3);
      b3.addActionListener(this);
    
      b4= new JButton("4");
      b4.setBounds(10,80,50,50);
      add(b4);
      b4.addActionListener(this);
      b4.setIcon(new ImageIcon((getClass().getResource("keyboard/walum.jpg")).getImage());
 

      b5= new JButton("5");
      b5.setBounds(60,80,50,50);
      add(b5);
      b5.addActionListener(this);
        
      b6= new JButton("6");
      b6.setBounds(115,80,50,50);
      add(b6);
      b6.addActionListener(this);
      
      b7= new JButton("7");
      b7.setBounds(10,135,50,50);
      add(b7);
      b7.addActionListener(this);
    
      b8= new JButton("8");
      b8.setBounds(60,135,50,50);
      add(b8);
      b8.addActionListener(this);
          
      b9= new JButton("9");
      b9.setBounds(115,135,50,50);
      add(b9);
      b9.addActionListener(this);    
 }    
 public void actionPerformed(ActionEvent box){
   if(box.getSource() == b1  ){
   tag.setText("The button selected was N: 1" ); 
 }
   if (box.getSource() == b2){
   tag.setText("The button selected was N: 2");
    } 
 if (box.getSource() == b3){
   tag.setText("The button selected was N: 3");
    } 
 if (box.getSource() == b4){
   tag.setText("The button selected was N: 4");
    } 
 if (box.getSource() == b5){
   tag.setText("The button selected was N: 5");
    } 

 if (box.getSource() == b6){
   tag.setText("The button selected was N: 6");
    } 
 if (box.getSource() == b7){
   tag.setText("The button selected was N: 7");
    } 
 if (box.getSource() == b8){
   tag.setText("The button selected was N: 8");
    } 
 if (box.getSource() == b9){
    tag.setText("The button selected was N: 9");
   } 
 }
  public static void main (String args[]){
   Grid window = new Grid (); 
     window.setBounds(0,0,400,400);   
     window.setVisible(true);
     window.setResizable(false);
     window.setLocationRelativeTo(null);
  }
}