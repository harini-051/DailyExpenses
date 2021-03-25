import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.awt.event.*;

public class forms
{

public static void main(String[] args)
{
	JFrame f = new JFrame("Registration Form");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();
	JTabbedPane tp = new JTabbedPane(JTabbedPane.RIGHT);
	
	JLabel l = new JLabel("Registration");
	l.setBounds(610,110,480,90);
	l.setFont(new Font("Times New Roman",Font.BOLD,50));
	l.setForeground(Color.BLACK);
	
	JLabel l1 = new JLabel("Name");
	l1.setFont(new Font("Times New Roman",Font.BOLD,30));
	l1.setBounds(400,300,420,30);
	JTextField t = new JTextField();
	t.setFont(new Font("Verdana",Font.BOLD,20));
	t.setBounds(930,300,300,40);
	
	JLabel l4 = new JLabel("City");
	l4.setFont(new Font("Times New Roman",Font.BOLD,30));
	l4.setBounds(400,450,420,40);
	String[] group = {"Namakkal","Trichy","Tirunelveli","Salem","Madurai","Chennai","Coimbatore"};
	JComboBox cb  = new JComboBox(group); 
	cb.setBounds(930,450,300,40);
	cb.setFont(new Font("Verdana",Font.BOLD,20));
	cb.setBackground(Color.WHITE);
	

	//JLabel l2 = new JLabel("ffff");
//	l2.setFont(new Font("Times New Roman",Font.BOLD,30));
//	l2.setBounds(400,350,420,30);
//	JTextField t1 = new JTextField();
//	t1.setFont(new Font("Verdana",Font.BOLD,20));
//	t1.setBounds(930,350,300,40);
	
	
	JLabel l3 = new JLabel("Mobile No");
	l3.setFont(new Font("Times New Roman",Font.BOLD,30));
	l3.setBounds(400,400,420,30);
	JTextField t2 = new JTextField();
	t2.setFont(new Font("Verdana",Font.BOLD,20));
	t2.setBounds(930,400,300,40);
	
	
//	JLabel l5 = new JLabel("Weigth");
//	l5.setFont(new Font("Times New Roman",Font.BOLD,30));
//	l5.setBounds(400,500,420,40);
//	JTextField t3 = new JTextField();
//	t3.setFont(new Font("Verdana",Font.BOLD,20));
//	t3.setBounds(930,500,300,40);
	
//	JLabel l6 = new JLabel("Kg");
///	l6.setFont(new Font("Times New Roman",Font.BOLD,30));
//	l6.setBounds(1230,500,420,40);
	
//	JLabel l7 = new JLabel("Date");
//	l7.setFont(new Font("Times New Roman",Font.BOLD,30));
//	l7.setBounds(400,550,420,40);
//	JTextField t4 = new JTextField();
//	t4.setFont(new Font("Verdana",Font.BOLD,20));
//	t4.setBounds(930,550,300,40);
	

	jp1.setLayout(null);
	jp1.setBackground(Color.WHITE);
	jp1.add(l);
	jp1.add(l1);
//	jp1.add(l2);
	jp1.add(l3);
	jp1.add(l4);
//	jp1.add(l5);
//	jp1.add(l6);
//	jp1.add(l7);
	jp1.add(t);
//	jp1.add(t1);
	jp1.add(t2);
	jp1.add(cb);
//	jp1.add(t3);
	jp1.add(cb);
//	jp1.add(t4);
	

	
	
	JLabel l12 = new JLabel("Inserting the items");
	l12.setBounds(610,100,420,50);
	l12.setFont(new Font("Times New Roman",Font.BOLD,50));
	
	
	JLabel l9 = new JLabel("Department");
	JTextField t1 = new JTextField();
	t1.setFont(new Font("Verdana",Font.BOLD,20));
	t1.setBounds(850,250,200,40);
	l9.setBounds(550,250,420,30);
	l9.setFont(new Font("Times New Roman",Font.BOLD,30));
	
	JLabel l11 = new JLabel("Flavour");
	JTextField t6 = new JTextField();
	t6.setBounds(850,350,200,40);
	t6.setFont(new Font("Verdana",Font.BOLD,20));
	l11.setBounds(550,350,420,30);
	l11.setFont(new Font("Times New Roman",Font.BOLD,30));
	
	JLabel l10 = new JLabel("Cost");
	JTextField t3 = new JTextField();
	l10.setBounds(550,450,420,30);
	t3.setBounds(850,450,200,40);
	t3.setFont(new Font("Verdana",Font.BOLD,20));
	l10.setFont(new Font("Times New Roman",Font.BOLD,30));
	
	JPopupMenu pm = new JPopupMenu();
	JMenuItem bo = new JMenuItem("BOLD");
	JMenuItem it = new JMenuItem("ITALICS");
	pm.add(bo);
	pm.add(it);
	pm.setPopupSize(100,100);
    jp2.addMouseListener(new MouseAdapter() {
    	public void mouseClicked(MouseEvent e)
    	{
    		pm.show(jp2,e.getX(),e.getY());
    	}
    });
    ActionListener li = new ActionListener(){
    			public void actionPerformed(ActionEvent e){
    				if(e.getSource() == bo)
    				{
    				
    					t1.setFont(new Font("Monaco", Font.BOLD, 20));
    					t3.setFont(new Font("Monaco", Font.BOLD, 20));
    					t6.setFont(new Font("Monaco", Font.BOLD, 20));
    					
    				}
    				else if(e.getSource() == it)
    				{
    					
    					t1.setFont(new Font("Monaco", Font.ITALIC, 20));
    					t3.setFont(new Font("Monaco", Font.ITALIC, 20));
    					t6.setFont(new Font("Monaco", Font.ITALIC, 20));
    				}
    			}
    		};
    bo.addActionListener(li);				
    it.addActionListener(li);

	jp2.setLayout(null);
	jp2.setBackground(Color.WHITE);
	jp2.add(l9);
	jp2.add(l10);
	jp2.add(l11);
	jp2.add(l12);
	jp2.add(t1);
	jp2.add(t6);
	jp2.add(t3);
	
	
	
	JTextArea t15 = new JTextArea();
	t15.setBounds(540,100,1000,620);
	t15.setFont(new Font("Times New Roman",Font.BOLD,30));
	Border b8 = BorderFactory.createLineBorder(Color.WHITE);
	t15.setBorder(new LineBorder(Color.WHITE));
	t15.setBorder(b8);
	t15.setComponentOrientation(ComponentOrientation.UNKNOWN);
	JButton b7 = new JButton("Print");
	b7.setBounds(700,800,160,60);
	b7.setFont(new Font("Verdana",Font.BOLD,20));
	b7.setBackground(Color.CYAN);
	b7.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
     		t15.setText("***********************************************************"+"\n\t\tRECIPT "
		                +"\n***********************************************************"+"\n\t\tIBACO"+"\nCustomer Name"
				    +"\t\t"+t.getText()+"\n\nContact No"+"\t\t\t"+t2.getText()
					    +"\n*********************************************************"+"\nDepartment"+"\t\t\t"+ t1.getText()+"\nFlavour"+"\t\t\t"+t6.getText()+"\nCost"+"\t\t\t"+t3.getText()
					    +"\n*********************************************************"+"\n\t\tThank You"+"\n******************************************************");
		}	
	});
	
	jp3.add(t15);
	jp3.add(b7);
    jp3.setLayout(null);
	jp3.setBackground(Color.WHITE);
	
	

	DefaultMutableTreeNode  shm = new DefaultMutableTreeNode("ICECREAMS");
	DefaultMutableTreeNode  ff = new DefaultMutableTreeNode("Cup Icecream");
	DefaultMutableTreeNode  sf = new DefaultMutableTreeNode("Cone Icecream");
	DefaultMutableTreeNode  tf = new DefaultMutableTreeNode("Family Pack");
	DefaultMutableTreeNode  cs = new DefaultMutableTreeNode("Veniila");
	DefaultMutableTreeNode  fj = new DefaultMutableTreeNode("Chocklate");
	DefaultMutableTreeNode  ho = new DefaultMutableTreeNode("Straw Berry");
	DefaultMutableTreeNode  gs = new DefaultMutableTreeNode("Butter Scotch");
	DefaultMutableTreeNode  fd = new DefaultMutableTreeNode("Blue Berry");
	DefaultMutableTreeNode  to = new DefaultMutableTreeNode("Butter Milk");
	DefaultMutableTreeNode  ft = new DefaultMutableTreeNode("Choke Cherry");
	DefaultMutableTreeNode  th = new DefaultMutableTreeNode("Mango");
	DefaultMutableTreeNode  fs = new DefaultMutableTreeNode("Rasp Berry");
	
	JTree tree = new JTree(shm);
	tree.setFont(new Font("Times New Roman",Font.BOLD,20));
	tree.setBounds(770,210,420,1000);
	
	shm.add(ff);
	shm.add(sf);
	shm.add(tf);
	ff.add(cs);
	ff.add(fj);
	ff.add(ho);
	sf.add(gs);
	sf.add(fd);
	sf.add(to);
	tf.add(ft);
	tf.add(th);
	tf.add(fs);
	tree.setRowHeight(50);
	tree.setRootVisible(true);
	
	JLabel l22 = new JLabel("Tree");
	l22.setBounds(1000,50,420,90);
	l22.setFont(new Font("Times New Roman",Font.BOLD,50));
	
	jp4.setLayout(null);
	jp4.setBackground(Color.WHITE);
	jp4.add(tree);
	jp4.add(l22);
	
	tp.addTab("Registration",jp1);
	tp.addTab("Insert",jp2);
	tp.addTab("Bill Pay",jp3);
	tp.addTab("Tree",jp4);
	tp.setBounds(1,1,1920,1000); 
	tp.setFont(new Font("Times New Roman",Font.PLAIN,30));
	tp.setBackground(Color.YELLOW);
	tp.setForeground(Color.BLACK);
	
	f.setVisible(true);
	f.add(tp);
	f.getContentPane().setBackground(Color.WHITE);
	f.setLayout(null);
	f.setSize(1000,1000);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}



