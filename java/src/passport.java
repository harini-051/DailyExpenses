
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.*;  
import javax.swing.JScrollPane;
import java.awt.event.*;
import java.sql.*;  
public class passport
{
	passport()
	{
		JFrame f=new JFrame("PASSPORT AUTOMATION SYSTEM");
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel im = new JLabel("");
		im.setIcon(new ImageIcon("pass.jpg"));
		im.setBounds(100,310,250,150);
		f.add(im);
		
		JLabel l=new JLabel("PASSPORT AUTOMATION SYSTEM");
		l.setFont(new Font("Verdana",Font.BOLD,20));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setForeground(Color.BLUE);
		l.setBounds(80,20,390,150);
		f.add(l);
		
		JLabel o=new JLabel("LOGIN");
		o.setFont(new Font("Verdana",Font.BOLD,20));
		o.setBounds(100,130,160,50);
		f.add(o);
		
		JTextField t=new JTextField(" ");
		t.setBackground(Color.BLACK);
		t.setForeground(Color.WHITE);
		t.setBounds(250,130,160,40);
		f.add(t);
		
		JLabel l1=new JLabel("PASSWORD");
		l1.setFont(new Font("Verdana",Font.BOLD,20));
		l1.setBounds(100,170,160,50);
		f.add(l1);
		
		JPasswordField t1=new JPasswordField("");
		t1.setBackground(Color.BLACK);
		t1.setForeground(Color.WHITE);
		t1.setBounds(250,170,160,40);
		f.add(t1);
		
		JButton b=new JButton("APPLICANT");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.BLUE);
		b.setBounds(160,250,100,30);
		f.add(b);
		
		JButton b1=new JButton("PASSPORT OFFICER");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.BLUE);
		b1.setBounds(270,250,170,30);
		f.add(b1);
		
		
		b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String a1 = t1.getText();
				
						if(a1.equals("dharani"))
						{	
							new login();
						}
						else
						{
							JOptionPane.showMessageDialog(f,"Enter Correct Password","Problem",JOptionPane.ERROR_MESSAGE);
						}
						  
					}
				});
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					String a1 = t1.getText();
				
						if(a1.equals("dharani"))
						{	
							new check();
						}
						else
						{
							JOptionPane.showMessageDialog(f,"Enter Correct Password","Problem",JOptionPane.ERROR_MESSAGE);
						}
					  
				}
			});
		
	}
	class reg
	{
		reg()
		{
			JFrame f=new JFrame("");
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(600,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel l1=new JLabel("REGISTRATION FORM");
			JLabel l2=new JLabel("ADHAR ID");
			JLabel l3=new JLabel("APPLICANT NAME");
			JLabel l4=new JLabel("GENDER");
		    JLabel l5=new JLabel("CITY");
		    JLabel l6=new JLabel("MOBILE NUMBER");
		    JLabel l7=new JLabel("ADDRESS");
			
			l1.setBounds(160,30,150,30);
			l2.setBounds(80,60,150,30);
			l3.setBounds(80, 110, 150, 30);
			l4.setBounds(80, 150, 150, 30);
			l5.setBounds(80, 190, 150, 30);
			l6.setBounds(80, 230, 150, 30);
			l7.setBounds(80, 270, 150, 30);
			
			JTextField t1=new JTextField();
			JTextField t2=new JTextField();
			JTextField t3=new JTextField();
			JTextField t4=new JTextField();
			JTextField t5=new JTextField();
			JTextArea a =new JTextArea();
			 
			
			t1.setBounds(240, 60, 150, 30);
			t2.setBounds(240, 110, 150, 30);
			t3.setBounds(240, 150, 150, 30);
			t4.setBounds(240, 190, 150, 30);
			t5.setBounds(240, 230, 150, 30);
			a.setBounds(240, 270, 150, 130);
			JButton b1=new JButton("submit");
		    b1.setBounds(80,410,90,30);
			JButton b2=new JButton("back");
		    b2.setBounds(180,410,90,30);
			
			  f.add(l1);
			  f.add(l2);
			  f.add(l3);
			  f.add(l4);
			  f.add(l5);
			  f.add(l6);
			  f.add(l7);
			   
			  f.add(t1);
			  f.add(t2);
			  f.add(t3);
			  f.add(t4);
			  f.add(t5);
			  f.add(a);
			  f.add(b1);
			  f.add(b2);
			  b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						try {
							//Creating Connection Object
							Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
							//Preapared Statement
							PreparedStatement Pstatement=connection.prepareStatement("insert into passd values(?,?,?)");
							//Specifying the values of it's parameter
							Pstatement.setString(1,t1.getText());
							Pstatement.setString(2,t2.getText());
							Pstatement.setString(3,t4.getText());

						  
								Pstatement.executeUpdate();
								JOptionPane.showMessageDialog(null,"Data Registered Successfully");
						   
			 
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
 
						  
					}
				});
				b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					new passport();
					  
				}
			});
			  

		}
		
	}
	
	class check 
	{
		JFrame f=new JFrame("");
		JLabel l2=new JLabel("ADHAR ID");
		JTextField t1=new JTextField();
		JLabel l3=new JLabel("Status");
		JTextField t2=new JTextField();
		check()
		{
			
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(600,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//JLabel l2=new JLabel("ADHAR ID");
			//JTextField t1=new JTextField();
			l2.setBounds(80,60,150,30);
			t1.setBounds(240, 60, 150, 30);
			
			
			l3.setBounds(80,150,150,30);
			t2.setBounds(240, 150, 150, 30);
			
			JButton b=new JButton("SUBMIT");
			b.setBackground(Color.BLACK);
			b.setForeground(Color.BLUE);
			b.setBounds(100,210,200,40);
			f.add(l2);
			f.add(t1);
			f.add(l3);
			f.add(t2);
			
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					rej();
					  
				}
			}); 
			
			
			
			
			
		}
		public void rej()
			{
						String a=t2.getText();
						if(a.equals("processing"))
    				     {
    				    	 JOptionPane.showMessageDialog(f,"Passport is under verification");
    				     }
						
    				     if(a.equals("issue"))
    				     {
    				    	 JOptionPane.showMessageDialog(f,"Passport is Dispatched");
    				     }
						 
    				     if(a.equals("reject"))
    				     {
    				    	 JOptionPane.showMessageDialog(f,"Application was Declined");
    				     }
			}
	}
	class login extends check
	{
		login()
		{
			JFrame f=new JFrame("");
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(600,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton b1=new JButton("REGISTER");
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.BLUE);
			b1.setBounds(100,100,200,40);
			f.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					new reg();
					  
				}
			});
		
			/*JButton b2=new JButton("CHECK STATUS");
			b2.setBackground(Color.BLACK);
			b2.setForeground(Color.BLUE);
			b2.setBounds(100,150,200,40);
			f.add(b2);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					rej();
					  
				}
			}); */
		}
	}
	/*class rej
	{
		String b;
		rej(String a)
		{
			b=a;
			JFrame f=new JFrame("");
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(600,600);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						if(b=="Processing");
    				     {
    				     JOptionPane.showMessageDialog(f,"Your Application is under Verification");
    				     }
    				     
    				     if(b=="issue")
    				     {
    				    	 JOptionPane.showMessageDialog(f,"Your Passport is Dispatched");
    				     }
    				     if(b=="reject")
    				     {
    				    	 JOptionPane.showMessageDialog(f,"Your Application was Declined");
    				     }
		}
	} */
	public static void main(String args[])
	{
		new passport();
	}
}