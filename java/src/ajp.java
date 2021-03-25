 import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ajp {

	public static void main(String[] args) {
		JFrame f = new JFrame("Login Page");
		
		JLabel l = new JLabel("Roll Number");
		l.setBounds(30,340,420,40);
		l.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JTextField t = new JTextField();
		t.setBounds(400,340,250,40);
		
		JLabel l1=new JLabel("Student Name");
		l1.setBounds(30,410,420,40);
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JTextField t1 = new JTextField();
		t1.setBounds(400,410,250,40);
		
		JLabel l2=new JLabel("Gender");
		l2.setBounds(30,490,420,40);
		l2.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JRadioButton m = new JRadioButton("Male");
		m.setBounds(400,490,250,40);
		m.setFont(new Font("Times New Roman",Font.BOLD,20));
		m.setBackground(Color.YELLOW);
		m.setForeground(Color.BLACK);
		JRadioButton m1 = new JRadioButton("Female");
		m1.setBounds(660,490,250,40);
		m1.setFont(new Font("Times New Roman",Font.BOLD,20));
		m1.setBackground(Color.YELLOW);
		m1.setForeground(Color.BLACK);
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);
		bg.add(m1);
		
		
		JLabel l3=new JLabel("Class");
		l3.setBounds(30,570,420,40);
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t2 = new JTextField();
		t2.setBounds(400,570,250,40);
		
		JLabel l4=new JLabel("Admission Date");
		l4.setBounds(30,650,420,40);
		l4.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t3 = new JTextField();
		t3.setBounds(400,650,250,40);
		
		JLabel l12=new JLabel("Admission No");
		l12.setBounds(30,720,420,40);
		l12.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t6 = new JTextField();
		t6.setBounds(400,720,250,40);

		JLabel l5=new JLabel("Identification Marks");
		l5.setBounds(30,780,420,40);
		l5.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JLabel l16=new JLabel("1.");
		l16.setBounds(360,780,420,40);
		l16.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JLabel l17=new JLabel("2.");
		l17.setBounds(360,830,420,40);
		l17.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		
		JTextField t4 = new JTextField();
		t4.setBounds(400,780,1023,40);
		
		JTextField t5 = new JTextField();
		t5.setBounds(400,830,1023,40);
		
		

		JLabel l6=new JLabel("Father's Name");
		l6.setBounds(800,340,420,40);
		l6.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t7 = new JTextField();
		t7.setBounds(1170,340,250,40);
		

		JLabel l7=new JLabel("Mother's Name");
		l7.setBounds(800,410,420,40);
		l7.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t8 = new JTextField();
		t8.setBounds(1170,410,250,40);
		

		JLabel l8=new JLabel("D.O.B");
		l8.setBounds(800,490,420,40);
		l8.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		JTextField t9 = new JTextField();
		t9.setBounds(1170,490,250,40);
		

		JLabel l9=new JLabel("Section");
		l9.setBounds(800,570,420,40);
		l9.setFont(new Font("Times New Roman",Font.BOLD,30));


		JTextField t10 = new JTextField();
		t10.setBounds(1170,570,90,40);

		JLabel l10=new JLabel("Religion");
		l10.setBounds(800,650,420,40);
		l10.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		String[] city1 = {"Hindu","Muslim"};
		JComboBox cb1  = new JComboBox(city1); 
		cb1.setBounds(1170,650,100,40);
		cb1.setFont(new Font("Verdana",Font.BOLD,20));
		

		JLabel l11=new JLabel("Nationality");
		l11.setBounds(800,720,700,40);
		l11.setFont(new Font("Times New Roman",Font.BOLD,30));
		

		String[] city2 = {"Indian","African"};
		JComboBox cb2  = new JComboBox(city2); 
		cb2.setBounds(1170,720,100,40);
		cb2.setFont(new Font("Verdana",Font.BOLD,20));
		
		JLabel l13=new JLabel("Search by");
		l13.setBounds(20,20,700,40);
		l13.setFont(new Font("Times New Roman",Font.BOLD,30));
		
		JRadioButton m2 = new JRadioButton("Student Name");
		m2.setBounds(20,100,250,40);
		m2.setFont(new Font("Times New Roman",Font.BOLD,20));
		m2.setBackground(Color.YELLOW);
		m2.setForeground(Color.BLACK);
		JRadioButton m3 = new JRadioButton("Admission No");
		m3.setBounds(300,100,250,40);
		m3.setFont(new Font("Times New Roman",Font.BOLD,20));
		m3.setBackground(Color.YELLOW);
		m3.setForeground(Color.BLACK);
		JRadioButton m4 = new JRadioButton("Roll No");
		m4.setBounds(600,100,250,40);
		m4.setFont(new Font("Times New Roman",Font.BOLD,20));
		m4.setBackground(Color.YELLOW);
		m4.setForeground(Color.BLACK);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(m2);
		bg1.add(m3);
		bg1.add(m4);
		
		
		String[] city = {"class1","class2"};
		JComboBox cb  = new JComboBox(city); 
		cb.setBounds(850,100,100,40);
		cb.setFont(new Font("Times New Roman",Font.BOLD,20));
	//	cb.setBackground(Color.WHITE);
		
		 JButton b = new JButton("save");
	     b.setBounds(500,900,100,40);
		 b.setFont(new Font("Times New Roman",Font.BOLD,20));
		 b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						 Class.forName("com.mysql.jdbc.Driver");
					      String port_no="3306";
					      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/marks?autoReconnect=true&useSSL=false";
					      Connection con =DriverManager.getConnection(jdbcServer,"root","");
					      Statement st = con.createStatement();
					      String c = (String) cb1.getSelectedItem();
					      if(c.equals("Hindu"))
					       {
					    	    c = "Hindu";
					       }
					      else if(c.equals("Muslim"))
					      {
					    	  c = "Muslim";
					      }
					      
					      String c1 = (String) cb2.getSelectedItem();
					      if(c1.equals("Indian"))
					       {
					    	    c1 = "Indian";
					       }
					      else if(c1.equals("African"))
					      {
					    	  c1 = "African";
					      }
					      
					      String Gender = " ";
					      if(m.isSelected()) 
					      {
					          Gender = "Male";
					      }
					      else if(m1.isSelected())
					      {
					          Gender = "Female";
					      }
						st.executeUpdate("insert into student  (rollno,name,gender,class,addate,adno,idf,ids,fname,mname,dob,section,relegion,nationality) values ("+t.getText()+",'"+t1.getText()+"','"+Gender+"','"+t2.getText()+"','"+t3.getText()+"',"+t6.getText()+",'"+t4.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+c+"','"+c1+"')");
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
		// b.setBackground(Color.GRAY);
			
		 JButton b1 = new JButton("cancel");
		 b1.setBounds(1200,900,100,40);
		 b1.setFont(new Font("Times New Roman",Font.BOLD,20));
		// b1.setBackground(Color.GRAY);
		 
		 
		 JTable table = new JTable();
		  Object Head[] = {"Roll_No","Student_Name","Father_Name","Mother_Name","Admission_Date","Section"};
		  DefaultTableModel model1 = new DefaultTableModel();
		  model1.setColumnIdentifiers(Head);
		  table.setModel(model1);
		//  table.setBackground(Color.YELLOW);
		//  table.setSelectionBackground(Color.BLACK);
		//  table.setSelectionForeground(Color.WHITE);
		//  table.setGridColor(Color.WHITE);
		//  table.setForeground(Color.BLACK);
		  table.setFont(new Font("Times New Roman",Font.BOLD,20));
		  table.setRowHeight(20);
		  JScrollPane sp = new JScrollPane(table);
		  sp.setBounds(20,150,900,100);
		  sp.setBackground(Color.WHITE);
		  sp.setForeground(Color.BLACK);
		
		  TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model1);
	      table.setRowSorter(sorter);
	      
	      JLabel l14=new JLabel("Photos");
		  l14.setBounds(1600,50,700,40);
		  l14.setFont(new Font("Times New Roman",Font.BOLD,30));
		
	      JTextArea t11 = new JTextArea();
		  t11.setBounds(1600,90,300,300);
		  t11.setFont(new Font("Times New Roman",Font.BOLD,30));
		  
		  JLabel l15=new JLabel("Remarks");
		  l15.setBounds(1600,430,700,40);
		  l15.setFont(new Font("Times New Roman",Font.BOLD,30));
			
		  JTextArea t12 = new JTextArea();
		  t12.setBounds(1600,470,300,500);
		  t12.setFont(new Font("Times New Roman",Font.BOLD,30));
		  
		  
		  JTextField t13 = new JTextField();
			t13.setBounds(980,180,250,40);
			
			
		  JButton b2 = new JButton("search");
		  b2.setBounds(1300,170,150,50);
		  b2.setFont(new Font("Times New Roman",Font.BOLD,20));
		  b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						 Class.forName("com.mysql.jdbc.Driver");
					      String port_no="3306";
					      String jdbcServer="jdbc:mysql://localhost:"+port_no+"/marks?autoReconnect=true&useSSL=false";
					      Connection con =DriverManager.getConnection(jdbcServer,"root","");
					      Statement st = con.createStatement();
					      String s=" ";
						if(m2.isSelected())
					      {
					    	  s = "name";
					      }
					      else if(m3.isSelected())
					      {
					    	  s = "adno";
					      }
					      else if(m4.isSelected())
					      {
					    	  s = "rollno";
					      }
					      ResultSet rs=st.executeQuery("select * from student where "+s+" = '"+t13.getText()+"';");
					      while(rs.next())
					      {
					    	  String rollno = rs.getString("rollno");
					      	  String name = rs.getString("name");
					    	  String fname = rs.getString("fname");
					    	  String mname =  rs.getString("mname");
					    	  String addate =  rs.getString("addate");
					    	  String section =  rs.getString("Section");
					    	  
					    	  String tbData[] = {rollno,name,fname,mname,addate,section};
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
		  
			
			
		f.setVisible(true);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(l17);
		
		
		f.add(t);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		f.add(t10);
		f.add(t11);
		f.add(t12);
		f.add(t13);

		
		f.add(m);
		f.add(m1);
		f.add(m2);
		f.add(m3);
		f.add(m4);
		f.add(cb);
		f.add(cb1);
		f.add(cb2);
		f.add(sp);
		
		f.add(b);
		f.add(b1);
		f.add(b2);
		
		f.setSize(2000,2000);
		f.getContentPane().setBackground(Color.YELLOW);
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

