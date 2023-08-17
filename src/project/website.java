package  project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class website extends JFrame implements ActionListener,MouseListener {
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JComboBox c1,c2;
	JButton search;
	String[] location= {"Mirpur 10","Mirpur 11","Mirpur 12","Radisson","Sewra Bazar","Kuril","Zamuna Future Park","Notun Bazar"};
	String[] location1= {"Mirpur 10","Mirpur 11","Mirpur 12","Radisson","Sewra Bazar","Kuril","Zamuna Future Park","Notun Bazar"};
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon background=new ImageIcon(".\\Images\\background.png");
	public website(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Logged In");
		this.setLayout(null);
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		//Panel
		p1=new JPanel();
		p1.setBounds(0,60,1920,1080);
		p1.setLayout(null);
		p1.setBackground(new Color(163,142,197));
		this.add(p1);
		
		p2=new JPanel();
		p2.setBounds(0,0,1920,1080);
		p2.setLayout(null);
		p2.setBackground(new Color(121,134,163));
		this.add(p2);
		//Label
		l1=new JLabel();
		l1.setIcon(profile);
		l1.setBounds(1280,-120,200,300);
		p2.add(l1);
		
		l2=new JLabel();
		l2.setIcon(background);
		l2.setBounds(550,-150,1000,1000);
		p1.add(l2);
		
		l3=new JLabel();
		l3.setText("Where  are  you  going?");
		l3.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		l3.setBounds(80,70,300,23);
		p1.add(l3);
		
		l4=new JLabel();
		l4.setText("Log out");
		l4.setFont(new Font("Arial",Font.BOLD,17));
		l4.setForeground(Color.WHITE);
		l4.setFocusable(false);
		l4.addMouseListener(this);
		l4.setBounds(1190,23,70,20);
		l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p2.add(l4);
		
		l5=new JLabel();
		l5.setText("Emerngency");
		l5.setFont(new Font("Arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setBounds(300,23,110,20);
		l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l5.addMouseListener(this);
		p2.add(l5);
		
		l6=new JLabel();
		l6.setText("Booking");
		l6.setFont(new Font("Arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		l6.setFocusable(false);
		l6.setBounds(200,23,80,20);
		l6.addMouseListener(this);
		l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p2.add(l6);
		
		l8=new JLabel();
		l8.setText("Parcel");
		l8.setFont(new Font("Arial",Font.BOLD,17));
		l8.setForeground(Color.WHITE);
		l8.setFocusable(false);
		l8.setBounds(130,23,65,20);
		l8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l8.addMouseListener(this);
		p2.add(l8);
		
		l9=new JLabel();
		l9.setText("Hire");
		l9.setFont(new Font("Arial",Font.BOLD,17));
		l9.setForeground(Color.WHITE);
		l9.setFocusable(false);
		l9.setBounds(70,23,50,20);
		l9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l9.addMouseListener(this);
		p2.add(l9);
		
		//Combo Box
		c1=new JComboBox(location);
		p1.add(c1);
		c1.setFont(new Font("Arial",Font.BOLD,20));
		c1.setBounds(75,100,350,50);
		c1.setEditable(true);
		c1.setSelectedItem("From");
		c1.getEditor().getEditorComponent().setBackground(new Color(188,166,222));
		c1.setBackground(new Color(188,166,222));
		p1.add(c1);
		
		c2=new JComboBox(location1);
		p1.add(c2);
		c2.setFont(new Font("Arial",Font.BOLD,20));
		c2.getEditor().getEditorComponent().setBackground(new Color(188,166,222));
		c2.setBackground(new Color(188,166,222));
		c2.setEditable(true);
		c2.setSelectedItem("To");
		c2.setBounds(75,160,350,50);
		p1.add(c2);
		//Search
		search=new JButton();
		search.setText("Search");
		search.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		search.setForeground(Color.WHITE);
		search.setBackground(new Color(188,166,222));
		search.setFocusable(false);
		search.setBorder(BorderFactory.createLineBorder(new Color(188,166,222)));
		search.setBounds(170,230,150,30);
		p1.add(search);
		
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l4) {
			this.setVisible(false);
			home obj=new home();
			obj.show();
		}
		if(e.getSource()==l6) {
			this.setVisible(false);
			Booking obj=new Booking();
			obj.show();
		}
		if(e.getSource()==l7) {
			this.setVisible(false);
			recharge obj=new recharge();
			obj.show();
		}
		if(e.getSource()==l9) {
			this.setVisible(false);
			hire obj=new hire();
			obj.show();
		}
		if(e.getSource()==l8) {
			this.setVisible(false);
			hire_delivery_man obj=new hire_delivery_man();
			obj.show();
		}
		if(e.getSource()==l5) {
			this.setVisible(false);
			Emergency obj=new Emergency();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l4) {
			l4.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l6) {
			l6.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l8) {
			l8.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l9) {
			l9.setForeground(Color.MAGENTA);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l4) {
			l4.setForeground(Color.WHITE);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.WHITE);
		}
		if(e.getSource()==l6) {
			l6.setForeground(Color.WHITE);
		}
		if(e.getSource()==l8) {
			l8.setForeground(Color.WHITE);
		}
		if(e.getSource()==l9) {
			l9.setForeground(Color.WHITE);
		}
	}
}
