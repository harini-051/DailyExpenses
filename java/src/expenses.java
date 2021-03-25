import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class expenses
{
	public static void main (String[] args)
	{
		JFrame f = new JFrame("Expenses");
		f.setVisible(true);
		f.setSize(2000,2000);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JLabel l = new JLabel("USER NAME");
		l.setBounds(600,390,420,40);
		l.setForeground(Color.BLACK);
		l.setFont(new Font("Footlight MT Light",Font.BOLD,50));
		JTextField t = new JTextField();
		t.setBounds(1000,390,250,50);
		t.setFont(new Font("Georgia",Font.BOLD,30));
		JLabel l1 = new JLabel("PASSWORD");
		l1.setFont(new Font("Footlight MT Light",Font.BOLD,50));
		l1.setBounds(600,490,420,40);
		l1.setForeground(Color.BLACK);
		JPasswordField pass = new JPasswordField(20);
		pass.setBounds(1000,490,250,50);
		pass.setFont(new Font("Georgia",Font.BOLD,30));
		JLabel l2 = new JLabel("KANNAN CONSTRUCTION");
		l2.setFont(new Font("Goudy Old Style",Font.BOLD,70));
		l2.setBounds(500,30,990,90);
		l2.setForeground(Color.BLACK);
		
		
		
		JCheckBox c = new JCheckBox("Show Password");
		c.setBackground(Color.YELLOW);
		c.setForeground(Color.BLACK);
		c.setBounds(500,700,420,40);
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
		
		
		
		ImageIcon image1 = new ImageIcon("C:\\Users\\harini\\eclipse-workspace\\java\\bin\\images\\f1.png");
		JLabel l4 = new JLabel(image1);
		l4.setBounds(700, 170, 500,500);
		
		JButton b = new JButton("Login");
		b.setBounds(1200,700,230,50);
		b.setFont(new Font("Georgia",Font.BOLD,30));
		b.setBackground(Color.CYAN);
		b.setForeground(Color.BLACK);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String text;
				String text1;
				text = t.getText();
				text1 = pass.getText();
				if(text.equals("Kannan") && text1.equals("Rajam") ){
					new table();
				}
				else{
					JOptionPane.showMessageDialog(f,"Enter Correct Password Kanna","Problem",JOptionPane.ERROR_MESSAGE);
				}    
				
				  
			}
		});
		f.getContentPane().setBackground(Color.WHITE);
		f.add(t);
		f.add(pass);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l4);
		f.add(b);
		f.add(c);
		
       }
}
  class table
   {
	table()
	      {
		        JFrame f1 = new JFrame("Expenses");
		        JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);
		        JPanel jp1 = new JPanel(); 
		        jp1.setLayout(null);
		        JLabel l = new JLabel("Material Name");
				l.setBounds(490,150,500,100);
				l.setFont(new Font("Goudy Old Style",Font.BOLD,50));
				JLabel l2 = new JLabel("Quantity");
				l2.setBounds(490,240,500,100);
				l2.setFont(new Font("Goudy Old Style",Font.BOLD,60));
				JLabel l3 = new JLabel("Amount");
				l3.setBounds(490,340,500,100);
				l3.setFont(new Font("Goudy Old Style",Font.BOLD,60));
				JLabel l4 = new JLabel("Date");
			    l4.setBounds(490,440,500,100);
				l4.setFont(new Font("Goudy Old Style",Font.BOLD,60));
				JLabel l5 = new JLabel("ID");
			    l5.setBounds(40,20,500,100);
				l5.setFont(new Font("Goudy Old Style",Font.BOLD,60));
				JLabel l8 = new JLabel("INFORMATIONS");
			    l8.setBounds(800,10,600,100);
				l8.setFont(new Font("Goudy Old Style",Font.BOLD,70));
				
				
				
				JTextField t1 = new JTextField();
				t1.setBounds(990,180,250,50);
				t1.setFont(new Font("Georgia",Font.BOLD,30));
				JTextField t2 = new JTextField();
				t2.setBounds(990,270,250,50);
				t2.setFont(new Font("Modern No. 20",Font.BOLD,40));
				JTextField t3 = new JTextField();
				t3.setBounds(990,370,250,50);
				t3.setFont(new Font("Modern No. 20",Font.BOLD,40));
				JTextField t5 = new JTextField();
				t5.setBounds(990,470,250,50);
				t5.setFont(new Font("Modern No. 20",Font.BOLD,40));
				JTextField t6 = new JTextField();
				t6.setBounds(190,45,250,50);
				t6.setFont(new Font("Modern No. 20",Font.BOLD,40));
				
				
				ImageIcon image = new ImageIcon("C:\\Users\\harini\\eclipse-workspace\\java\\bin\\images\\f11.png");
				JLabel l6 = new JLabel(image);
				l6.setBounds(160, 460, 600,600);
				

				ImageIcon image2 = new ImageIcon("C:\\Users\\harini\\eclipse-workspace\\java\\bin\\images\\f13.png");
				JLabel l9 = new JLabel(image2);
				l9.setBounds(10, 260, 500,600);
				
				JButton b = new JButton("Add");
				b.setBounds(1500,190,160,60);
				b.setFont(new Font("Georgia",Font.BOLD,20));
				b.setBackground(Color.CYAN);
				b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						System.out.println("Here");
						try
						{
							System.out.println("and Here");
							 Class.forName("com.mysql.jdbc.Driver");
						      String port_no="3306";
						      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/expenses?autoReconnect=true&useSSL=false";
						      Connection con =DriverManager.getConnection(jdbcServer,"root","");
						      Statement st = con.createStatement();
						      
						     
						     st.executeUpdate("insert into amount (Material_Name,Quantity,Amount,Date) values ('"+t1.getText()+"',' "+t2.getText()+" ',"+t3.getText()+",'"+t5.getText()+"')");
						  
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
				
				 JButton b3 = new JButton("Update");
					b3.setBounds(1500,290,160,60);
					b3.setFont(new Font("Georgia",Font.BOLD,20));
					b3.setBackground(Color.CYAN);
					b3.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							System.out.println("Here");
							try
							{
								System.out.println("and Here");
								 Class.forName("com.mysql.jdbc.Driver");
							      String port_no="3306";
							      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/expenses?autoReconnect=true&useSSL=false";
							      Connection con =DriverManager.getConnection(jdbcServer,"root","");
							      String value1 = t1.getText();
								  String value2 = t2.getText();
							      String value3 = t3.getText();
								  String value4 = t5.getText();
								  String value5 = t6.getText();
							      PreparedStatement st = con.prepareStatement("update amount set Material_Name = '"+value1+"', Quantity = '"+value2+"' , Amount = '"+value3+"', Date = '"+value4+"'  where id = '"+value5+"' ");
							      st.executeUpdate();
							      st.close();
							      con.close();
							      JOptionPane.showMessageDialog(f1,"***Successfully Updated***");
							}catch(SQLException ex)
							{
							  ex.printStackTrace(); 
							  
								
							 }
							catch(ClassNotFoundException cx)
							{
								System.out.println("anddd Here");
							}
						}
					});
				
				
					
					
					JButton b8 = new JButton("Delete");
					b8.setFont(new Font("Georgia",Font.BOLD,20));
					b8.setBackground(Color.CYAN);
					b8.setBounds(1500,390,160,60);
					b8.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							try
							{
								 Class.forName("com.mysql.jdbc.Driver");
							      String port_no="3306";
							      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/expenses?autoReconnect=true&useSSL=false";
							      Connection con =DriverManager.getConnection(jdbcServer,"root","");
							      Statement st = con.createStatement();
							      st.executeUpdate("delete from amount where id = '"+ t6.getText()+"' ");
							      st.close();
							      con.close();
							      JOptionPane.showMessageDialog(f1,"***Successfully Deleted***");
							      
							}catch(SQLException ex)
							{
							  ex.printStackTrace(); 
							  
								
							 }
							catch(ClassNotFoundException cx)
							{
								
							}
						}
					});
					
					
					
				

				JButton b6 = new JButton("Clear");
				b6.setBounds(1500,490,160,60);
				b6.setBackground(Color.CYAN);
				b6.setFont(new Font("Georgia",Font.BOLD,20));
				b6.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						t1.setText(" ");
						t2.setText(" ");
						t3.setText(" ");
						t5.setText(" ");
						t6.setText(" ");
					}
				});
				
				
				
				jp1.add(t1);
				jp1.add(t5);
				jp1.add(t2);
				jp1.add(t3);
				jp1.add(t6);
				jp1.add(l);
				jp1.add(l2);
				jp1.add(l3);
				jp1.add(l4);
				jp1.add(l5);
				jp1.add(l6);
				jp1.add(l8);
				jp1.add(l9);
				jp1.add(b);
				jp1.add(b3);
				jp1.add(b6);
				jp1.add(b8);
				
		      
		        
		      
		      
		      
		      
		      
		      JPanel jp2 = new JPanel();   
		      
			  JTable table = new JTable();
			  Object Head[] = {"Material_Name","Quantity","Amount","Date"};
			  DefaultTableModel model1 = new DefaultTableModel();
			  model1.setColumnIdentifiers(Head);
			  table.setModel(model1);
			  table.setBackground(Color.YELLOW);
			  table.setSelectionBackground(Color.BLACK);
			  table.setSelectionForeground(Color.WHITE);
			  table.setGridColor(Color.WHITE);
			  table.setForeground(Color.BLACK);
			  table.setFont(new Font("Imprint MT Shadow for date",Font.BOLD,20));
			  table.setRowHeight(50);
			  JScrollPane sp = new JScrollPane(table);
			  sp.setBounds(900,70,900,800);
			  sp.setBackground(Color.WHITE);
			  sp.setForeground(Color.BLACK);
			  JTextField t = new JTextField();
			  t.setBounds(100,400,450,50);
			  t.setFont(new Font("Georgia",Font.BOLD,30));
			
			  TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model1);
		      table.setRowSorter(sorter);
			
		      
		      
		      ImageIcon image1 = new ImageIcon("C:\\Users\\harini\\eclipse-workspace\\java\\bin\\images\\f8.png");
			  JLabel l7 = new JLabel(image1);
			  l7.setBounds(50, 10, 200,200);
				
				
			ImageIcon image3 = new ImageIcon("C:\\Users\\harini\\eclipse-workspace\\java\\bin\\images\\f12.png");
			JLabel l10 = new JLabel(image3);
			l10.setBounds(100, 50, 300,300);	
				
			  JButton b1 = new JButton("Search");
			  b1.setBounds(100,500,140,50);
			  b1.setFont(new Font("Georgia",Font.BOLD,20));
			  b1.setBackground(Color.CYAN);
			  b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							 Class.forName("com.mysql.jdbc.Driver");
						      String port_no="3306";
						      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/expenses?autoReconnect=true&useSSL=false";
						      Connection con =DriverManager.getConnection(jdbcServer,"root","");
						      Statement st = con.createStatement();
						      ResultSet rs=st.executeQuery("SELECT * FROM amount WHERE  (`Material_Name`) LIKE '%"+ t.getText()+"%' ");
						      while(rs.next())
						      {
						    	  String Material_Name = rs.getString("Material_Name");
						    	  String Quantity = rs.getString("Quantity");
						    	  String Amount = rs.getString("Amount");
						    	  String Date =  rs.getString("Date");
						    	  
						    	  String tbData[] = {Material_Name,Quantity,Amount,Date};
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
								 JOptionPane.showMessageDialog(null, ex);
							
							}
						catch(ClassNotFoundException cx)
						{
							
						}
					}
				});
			  

			  
						      
						      	        
						    	
						    
			  
			  JButton b2 = new JButton("Display");
			  b2.setBounds(100,570,140,50);
			  b2.setBackground(Color.CYAN);
			  b2.setFont(new Font("Georgia",Font.BOLD,20));
			  b2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							 Class.forName("com.mysql.jdbc.Driver");
						      String port_no="3306";
						      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/expenses?autoReconnect=true&useSSL=false";
						      
						      Connection con =DriverManager.getConnection(jdbcServer,"root","");
						      Statement st = con.createStatement();
						      ResultSet rs=st.executeQuery("select * from amount");
						      while(rs.next())
						      {
						    	  String Material_Name = rs.getString("Material_Name");
						    	  String Quantity = rs.getString("Quantity");
						    	  String Amount = rs.getString("Amount");
						    	  String Date = rs.getString("Date");
						    	  
						    	  String tbData[] = {Material_Name,Quantity,Amount,Date};
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
			  

			  JTextField t4 = new JTextField();
			  t4.setBounds(400,300,250,50);
			  t4.setFont(new Font("Footlight MT Light",Font.BOLD,50));
			  JButton b5 = new JButton("Total");
			  b5.setBounds(100,300,140,50);
			  b5.setFont(new Font("Georgia",Font.BOLD,20));
			  b5.setBackground(Color.CYAN);
			  b5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						int row = table.getRowCount();
						int sum = 0;
						for(int i =0;i<row;i++)
						{
							int val = Integer.parseInt((String) table.getValueAt(i, 2));
							sum += val;
						}
						t4.setText(String.valueOf(sum));
					}
				});
			
			  

				JButton b7 = new JButton("Remove");
				b7.setBounds(410,500,140,50);
				b7.setBackground(Color.CYAN);
				b7.setFont(new Font("Georgia",Font.BOLD,20));
			    b7.addActionListener(new ActionListener() 
			    {
		        public void actionPerformed(ActionEvent e)
		        {
		        	DefaultTableModel model1 = (DefaultTableModel)table.getModel();
		        	 try
				       {
		        		 int SelectedRowIndex = table.getSelectedRow();
		        		 model1.removeRow(SelectedRowIndex);
				       }
		        	 catch(Exception ex)
		        	 {
		        		 JOptionPane.showMessageDialog(null, ex);
		        	 }
				       
		        }
		        });
			

			    JButton b4 = new JButton("Clear");
				b4.setBounds(410,570,140,50);
				b4.setBackground(Color.CYAN);
				b4.setFont(new Font("Georgia",Font.BOLD,20));
				b4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						t.setText(" ");
						t4.setText(" ");
						model1.setRowCount(0);
					}
				});
				
				
			  jp2.add(t);
			  jp2.add(l7);
			  jp2.add(l10);
			  jp2.add(t4);
			  jp2.add(b1);
			  jp2.add(b2);
			  jp2.add(b4);
			  jp2.add(b5);
			  jp2.add(b7);
		      jp2.add(sp);
			  jp2.setLayout(null);
		      
			  jp1.setBackground(Color.WHITE);
			  jp2.setBackground(Color.WHITE);
			  
			  
			  tp.setBounds(1,1,1920,1000);
			  tp.addTab("DETAILS",jp1);
			  tp.addTab("TABLE",jp2);
			  tp.setFont(new Font("Times New Roman",Font.PLAIN,30));
			  tp.setBackground(Color.YELLOW);
			  tp.setForeground(Color.BLACK);
				
			 
			  f1.add(tp);
              f1.getContentPane().setBackground(Color.WHITE);
			  f1.setLayout(null);
			  f1.setSize(2000,2000);
			  f1.setVisible(true);
			  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      }

	
	}

  





