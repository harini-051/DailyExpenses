import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class payroll {

	public static void main(String[] args)
	{
		JFrame f = new JFrame("Login Page");
		JLabel l = new JLabel("USER NAME");
		JLabel l2=new JLabel("PASSWORD");
		JPasswordField pass = new JPasswordField(20);
		pass.setBounds(350,250,250,50);
		pass.setFont(new Font("Verdana",Font.BOLD,20));
		JCheckBox c = new JCheckBox("Show Password");
		c.setBackground(Color.cyan);
		c.setForeground(Color.BLACK);
		c.setBounds(100,350,420,40);
		c.setFont(new Font("Verdana",Font.BOLD,20));
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.isSelected())
				{
					pass.setEchoChar((char)0);
				}
				else
				{
					pass.setEchoChar('*');
				}
			}
		});
		JTextField t = new JTextField();
		t.setBounds(350,150,250,50);
		t.setFont(new Font("Verdana",Font.BOLD,20));
		JButton b = new JButton("Login");
		b.setBounds(250,500,150,60);
		b.setFont(new Font("Verdana",Font.BOLD,20));
		b.setBackground(Color.YELLOW);
		b.setForeground(Color.BLACK);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String a = pass.getText();
				
				if(a.equals("payroll"))
				{	
				  new demo();
				}
				else
				{
					JOptionPane.showMessageDialog(f,"Enter Correct Password","Backup Problem",JOptionPane.ERROR_MESSAGE);
				}
				  
			}
		});
		    l.setFont(new Font("Verdana",Font.BOLD,30));
			l.setBounds(100,150,420,40);
			l2.setBounds(100,250,420,40);
			l2.setFont(new Font("Verdana",Font.BOLD,30));
			f.setVisible(true);
			f.setSize(800,800);
			f.getContentPane().setBackground(Color.WHITE);
			f.add(l);
			f.add(l2);
			f.add(t);
			f.add(b);
			f.add(c);
			f.add(pass);
			f.setLayout(new BorderLayout());
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class demo
{
	demo()
	{
		JFrame f1 = new JFrame("PAYROLL MANAGMENT");
		JTabbedPane tp = new JTabbedPane(JTabbedPane.BOTTOM);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		
		JLabel l1 = new JLabel("Employee Name");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setBounds(400,300,420,30);
		JTextField t1 = new JTextField();
		t1.setFont(new Font("Verdana",Font.BOLD,20));
		t1.setBounds(930,300,300,40);
		
		
		JLabel l3 = new JLabel("Contact No");
		l3.setBounds(400,400,420,30);
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		JTextField t3 = new JTextField();
		t3.setFont(new Font("Verdana",Font.BOLD,20));
		t3.setBounds(930,400,300,40);
		
		JLabel l4 = new JLabel("Designation");
		l4.setBounds(400,500,420,30);
		l4.setFont(new Font("Times New Roman",Font.BOLD,30));
		String[] work = {"Reception","Cook","Manager","Project_Manager"};
		JComboBox cb  = new JComboBox(work); 
		cb.setBounds(930,500,300,40);
		cb.setFont(new Font("Verdana",Font.BOLD,20));
		cb.setBackground(Color.WHITE);
		
		JLabel l = new JLabel("Salary");
		l.setBounds(400,600,420,30);
		l.setFont(new Font("Times New Roman",Font.BOLD,30));
		JTextField t = new JTextField();
		t.setFont(new Font("Verdana",Font.BOLD,20));
		t.setBounds(930,600,300,40);
		
		

        JButton b= new JButton("Add");
		b.setBounds(1000,690,160,60);
		b.setFont(new Font("Verdana",Font.BOLD,20));
		b.setBackground(Color.CYAN);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
				      String port_no="3306";
				      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/payroll?autoReconnect=true&useSSL=false";
				      Connection con =DriverManager.getConnection(jdbcServer,"root","");
				      Statement st = con.createStatement();
					  String city1 = (String) cb.getSelectedItem();
				      if(city1.equals("Reception"))
				       {
				    	    city1 = "Reception";
				       }
				      else if(city1.equals("Cook"))
				      {
				    	  city1 = "Cook";
				      }
			         else if(city1.equals("Manager"))
			         {
			    	      city1 = "Manager";
			         }
			         else if(city1.equals("ProjectManager"))
			         {
			    	      city1 = "ProjectManager";
			         }
				      
					st.executeUpdate("insert into employee (name,phone_no,designation,salary) values ('"+t1.getText()+"',"+t3.getText()+",'"+city1+"',"+t.getText()+")");
				      st.close();
				      con.close();
				                                                            
				      
				}catch(SQLException ex)
				{
				  ex.printStackTrace();                     
					
				 }
				catch(ClassNotFoundException cx)
				{
					
				}
			}
		});
		
		
		jp1.add(l);
		jp1.add(l1);
		jp1.add(l3);
		jp1.add(l4);
		jp1.add(t1);
		jp1.add(t);
		jp1.add(cb);
		jp1.add(t3);
		jp1.add(b);
		
		
		JLabel l2 = new JLabel("Employee id");
		l2.setFont(new Font("Times New Roman",Font.BOLD,30));
		l2.setBounds(400,300,420,30);
		JTextField t4 = new JTextField();
		t4.setFont(new Font("Verdana",Font.BOLD,20));
		t4.setBounds(930,300,300,40);
		
		JLabel l5 = new JLabel("Increament");
		l5.setFont(new Font("Times New Roman",Font.BOLD,30));
		l5.setBounds(400,400,420,30);
		JTextField t5 = new JTextField();
		t5.setFont(new Font("Verdana",Font.BOLD,20));
		t5.setBounds(930,400,300,40);
		
		
		JLabel l6 = new JLabel("Total Salary");
		l6.setFont(new Font("Times New Roman",Font.BOLD,30));
		l6.setBounds(400,500,420,30);
		JTextField t6 = new JTextField();
		t6.setFont(new Font("Verdana",Font.BOLD,20));
		t6.setBounds(930,500,300,40);
		
		
		  JButton b1 = new JButton("Calculate");
			b1.setBounds(1500,300,160,60);
			b1.setFont(new Font("Verdana",Font.BOLD,20));
			b1.setBackground(Color.CYAN);
			b1.addActionListener(new ActionListener()
			{

				public void actionPerformed(ActionEvent arg0)
				{
					
					int one = Integer.parseInt(t.getText());
					int two = Integer.parseInt(t5.getText());
					String value = String.valueOf(one+two);
					t6.setText(value);
				 
					
				}	
				
			});
					
		
			
			 JButton b2 = new JButton("Update");
			 b2.setBounds(1500,400,160,60);
			 b2.setFont(new Font("Verdana",Font.BOLD,20));
			 b2.setBackground(Color.CYAN);
			 b2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						System.out.println("Here");
						try
						{
							System.out.println("and Here");
							 Class.forName("com.mysql.jdbc.Driver");
						      String port_no="3306";
						      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/payroll?autoReconnect=true&useSSL=false";
						      Connection con =DriverManager.getConnection(jdbcServer,"root","");
						      String value1 = t6.getText();
						      String value2 = t4.getText();
						      PreparedStatement st = con.prepareStatement("update employee set salary = '"+value1+"' where id = '"+value2+"' ");
						      st.execute();
						      st.close();
						      con.close();
						      
						      
						}catch(SQLException ex)
						{
						  ex.printStackTrace(); 
						  
							
						 }
						catch(ClassNotFoundException cx)
						{
							
						}
					}
				});
			
		
			    JButton b3 = new JButton("Delete");
				b3.setFont(new Font("Verdana",Font.BOLD,20));
				b3.setBackground(Color.CYAN);
				b3.setBounds(1500,500,160,60);
				b3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							 Class.forName("com.mysql.jdbc.Driver");
						      String port_no="3306";
						      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/payroll?autoReconnect=true&useSSL=false";
						      Connection con =DriverManager.getConnection(jdbcServer,"root","");
						      Statement st = con.createStatement();
						      st.executeUpdate("delete from employee where id = '"+ t4.getText()+"' ");
						      st.close();
						      con.close();
						      
						      
						}catch(SQLException ex)
						{
						  ex.printStackTrace(); 
						  
							
						 }
						catch(ClassNotFoundException cx)
						{
							
						}
					}
				});
		
				JButton b4 = new JButton("Clear");
				b4.setBounds(1500,600,160,60);
				b4.setFont(new Font("Verdana",Font.BOLD,20));
				b4.setBackground(Color.CYAN);
				b4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						t4.setText(" ");
						t5.setText(" ");
						t6.setText(" ");
					}
				});
		
		
		jp2.add(l2);
		jp2.add(l5);
		jp2.add(l6);
		jp2.add(t4);
		jp2.add(t5);
		jp2.add(t6);
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		jp2.add(b4);
		
		
		
		
		  JTable table = new JTable();
		  Object Head[] = {"id","name","phone_no","designation","salary"};
		  DefaultTableModel model1 = new DefaultTableModel();
		  model1.setColumnIdentifiers(Head);
		  table.setModel(model1);
		  table.setBackground(Color.WHITE);
		  table.setSelectionBackground(Color.BLACK);
		  table.setSelectionForeground(Color.WHITE);
		  table.setGridColor(Color.BLACK);
		  table.setForeground(Color.BLACK);
		  table.setFont(new Font("Imprint MT Shadow for date",Font.BOLD,20));
		  table.setRowHeight(50);
		  JScrollPane sp = new JScrollPane(table);
		  sp.setBounds(800,70,900,800);
		  sp.setBackground(Color.WHITE);
		  sp.setForeground(Color.BLACK);
		  
		  
		  
		  JButton b5 = new JButton("Display");
		  b5.setBounds(100,570,140,50);
		  b5.setBackground(Color.CYAN);
		  b5.setFont(new Font("Georgia",Font.BOLD,20));
		  b5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						 Class.forName("com.mysql.jdbc.Driver");
					      String port_no="3306";
					      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/payroll?autoReconnect=true&useSSL=false";
					      
					      Connection con =DriverManager.getConnection(jdbcServer,"root","");
					      Statement st = con.createStatement();
					      ResultSet rs=st.executeQuery("select * from employee");
					      while(rs.next())
					      {
					    	  String id = rs.getString("id");
					    	  String name = rs.getString("name");
					    	  String phone_no = rs.getString("phone_no");
					    	  String designation = rs.getString("designation");
					    	  String salary = rs.getString("salary");
					    	  
					    	  String tbData[] = {id,name,phone_no,designation,salary};
					    	  DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
					    	  tblModel.addRow(tbData);
					      }
					      	        
					    	
					    	rs.close();
					   
					        st.close();
					        con.close();
					      
					   }
					catch(SQLException ex)
						{
							ex.printStackTrace();
						}
					catch(ClassNotFoundException cx)
					{
						
					}
				}
			});
		  
		
		  
		 jp3.add(sp);
		 jp3.add(b5);
		
		 
		tp.addTab("Add Employee",jp1);
		tp.addTab("Pay Increament",jp2);
		tp.addTab("Display",jp3);
		tp.setBounds(1,1,1920,1000); 
		tp.setFont(new Font("Times New Roman",Font.PLAIN,30));
		tp.setBackground(Color.YELLOW);
		tp.setForeground(Color.BLACK);
		
		
		
		
		jp1.setLayout(null);
		jp1.setBackground(Color.WHITE);
		jp2.setLayout(null);
		jp2.setBackground(Color.WHITE);
		jp3.setLayout(null);
		jp3.setBackground(Color.WHITE);
		
		

		f1.getContentPane().setBackground(Color.WHITE);
		f1.setLayout(null);
		f1.setSize(2000,2000);
		f1.setVisible(true);
		f1.add(tp);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
