import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class LoginPage implements ActionListener{
	JFrame f;
	JLabel id,l1;
	JButton b;
	
	//code to make code comes in Constructor
	LoginPage(){
		f = new JFrame("EMS");
		f.setBackground(Color.DARK_GRAY);
		f.setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("pics/study.PNG"));
		//To change image size
        Image i2 = i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        //set boundaries (x,y-axis,length,width)
        l1.setBounds(0,150,1410,530);
        f.add(l1);
        
        b= new JButton("Click here to continue");
        b.setBackground(Color.MAGENTA );
        b.setForeground(Color.WHITE);
        
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        
        id = new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        //Label On Screen
        JLabel lid = new JLabel("WELCOME TO EMPLOYEE DATABASE");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif",Font.BOLD,50));
        lid.setForeground(Color.red);
        id.add(lid);
        
        id.add(b);
        f.add(id);
        //background color of frame
        f.getContentPane().setBackground(Color.DARK_GRAY);
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(0); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(100000000);
            }catch(Exception e){}
        }

    }
	@Override
	//override actionPerformed method to perform any action
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new Login();    
        }
    }

    public static void main(String[] arg){
        LoginPage f = new LoginPage();
    }
         
		
}


