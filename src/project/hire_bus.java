package  project;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Interfaces.busCost;


public class hire_bus extends JFrame implements ActionListener,MouseListener, busCost {
	JPanel p1,p2,p3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JButton b9,b10,b11,b12,b13,b14;
	JComboBox cb1,cb2;
	JTextField t1;
	int costPerHour=1000;
	int hour=0;
	double cost=0;
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon vehicle=new ImageIcon(".\\Images\\big_bus.gif");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	String[] day= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String[] month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	public hire_bus(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		//Panel
		p1=new JPanel();
		p1.setBounds(0,60,1920,1080);
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		this.add(p1);
		
		p2=new JPanel();
		p2.setBounds(0,0,1920,60);
		p2.setLayout(null);
		p2.setBackground(new Color(121,134,163));
		this.add(p2);
		//Label
		l1=new JLabel();
		l1.setText("Log out");
		l1.setFont(new Font("Elephant",Font.PLAIN,17));
		l1.setForeground(Color.WHITE);
		l1.setFocusable(false);
		l1.addMouseListener(this);
		l1.setBounds(1190,23,70,20);
		l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p2.add(l1);
		
		l2=new JLabel();
		l2.setText("Emerngency");
		l2.setFont(new Font("Elephant",Font.PLAIN,17));
		l2.setForeground(Color.WHITE);
		l2.setFocusable(false);
		l2.setBounds(400,23,110,20);
		l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l2.addMouseListener(this);
		p2.add(l2);
		
		l3=new JLabel();
		l3.setText("Booking");
		l3.setFont(new Font("Elephant",Font.PLAIN,17));
		l3.setForeground(Color.WHITE);
		l3.setFocusable(false);
		l3.setBounds(310,23,80,20);
		l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l3.addMouseListener(this);
		p2.add(l3);
		
		l4=new JLabel();
		l4.setText("Recharge");
		l4.setFont(new Font("Elephant",Font.PLAIN,17));
		l4.setForeground(Color.WHITE);
		l4.setFocusable(false);
		l4.setBounds(210,23,85,20);
		l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l4.addMouseListener(this);
		p2.add(l4);
		
		l5=new JLabel();
		l5.setText("Parcel");
		l5.setFont(new Font("Elephant",Font.PLAIN,17));
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setBounds(130,23,65,20);
		l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l5.addMouseListener(this);
		p2.add(l5);
		
		l6=new JLabel();
		l6.setText("Hire");
		l6.setFont(new Font("Elephant",Font.PLAIN,17));
		l6.setForeground(Color.MAGENTA);
		l6.setFocusable(false);
		l6.setBounds(70,23,50,20);
		l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l6.addMouseListener(this);
		p2.add(l6);
		
		l7=new JLabel();
		l7.setIcon(profile);
		l7.setBounds(1280,-120,200,300);
		p2.add(l7);
		
		l7=new JLabel();
        l7.setIcon(back);
        l7.setBounds(13, 19, 33, 30);
        l7.addMouseListener(this);
        l7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(l7);
		
		l8=new JLabel();
		l8.setIcon(vehicle);
		l8.setBounds(30,200,600,300);
		p1.add(l8);
		
		p3=new JPanel();
		p3.setBounds(850,100,350,500);
		p3.setLayout(null);
		p3.setBackground(Color.LIGHT_GRAY);
		p1.add(p3);
		
		l9=new JLabel();
		l9.setText("For how many hours you want");
		l9.setFont(new Font("Consolas",Font.BOLD,20));
		l9.setBounds(10,30,350,50);
		p3.add(l9);
		
		l9=new JLabel();
		l9.setText("to rent?");
		l9.setFont(new Font("Consolas",Font.BOLD,20));
		l9.setBounds(10,60,350,50);
		p3.add(l9);
		
		b9=new JButton();
		b9.setText("1");
		b9.setFont(new Font("Arial",Font.BOLD,11));
		b9.setFocusable(false);
		b9.setBounds(10,120,50,50);
		b9.setBackground(Color.DARK_GRAY);
		b9.setBorder(BorderFactory.createEtchedBorder());
		b9.setForeground(Color.WHITE);
		b9.addActionListener(this);
		b9.addMouseListener(this);
		b9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(b9);
		
		b10=new JButton();
		b10.setText("2");
		b10.setFont(new Font("Arial",Font.BOLD,11));
		b10.setFocusable(false);
		b10.setBounds(80,120,50,50);
		b10.setBackground(Color.DARK_GRAY);
		b10.setBorder(BorderFactory.createEtchedBorder());
		b10.setForeground(Color.WHITE);
		b10.addActionListener(this);
		b10.addMouseListener(this);
		b10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(b10);
		
		b11=new JButton();
		b11.setText("4");
		b11.setFont(new Font("Arial",Font.BOLD,11));
		b11.setFocusable(false);
		b11.setBounds(150,120,50,50);
		b11.setBackground(Color.DARK_GRAY);
		b11.setBorder(BorderFactory.createEtchedBorder());
		b11.setForeground(Color.WHITE);
		b11.addActionListener(this);
		b11.addMouseListener(this);
		b11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(b11);
		
		b12=new JButton();
		b12.setText("8");
		b12.setFont(new Font("Arial",Font.BOLD,11));
		b12.setFocusable(false);
		b12.setBounds(220,120,50,50);
		b12.setBackground(Color.DARK_GRAY);
		b12.setBorder(BorderFactory.createEtchedBorder());
		b12.setForeground(Color.WHITE);
		b12.addActionListener(this);
		b12.addMouseListener(this);
		b12.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(b12);
		
		b13=new JButton();
		b13.setText("16");
		b13.setFont(new Font("Arial",Font.BOLD,11));
		b13.setFocusable(false);
		b13.setBounds(290,120,50,50);
		b13.setBackground(Color.DARK_GRAY);
		b13.setBorder(BorderFactory.createEtchedBorder());
		b13.setForeground(Color.WHITE);
		b13.addActionListener(this);
		b13.addMouseListener(this);
		b13.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(b13);
		
		l9=new JLabel();
		l9.setText("Date:");
		l9.setFont(new Font("Consolas",Font.BOLD,20));
		l9.setBounds(10,200,60,50);
		p3.add(l9);
		
		cb1=new JComboBox(day);
		cb1.setBounds(80,213,60,20);
		cb1.setEditable(false);
		cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(cb1);
		
		cb2=new JComboBox(month);
		cb2.setBounds(150,213,80,20);
		cb2.setEditable(false);
		cb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p3.add(cb2);
		
		l9=new JLabel();
		l9.setText("Total Cost:");
		l9.setFont(new Font("Consolas",Font.BOLD,20));
		l9.setBounds(10,270,130,50);
		p3.add(l9);
		
		t1=new JTextField();
		t1.setBounds(25,320,300,35);
		t1.setBorder(BorderFactory.createEmptyBorder());
		t1.setFont(new Font("Consolas",Font.BOLD,20));
		p3.add(t1);
		
		b14=new JButton();
		b14.setText("PAY NOW");
		b14.setFont(new Font("Consolas",Font.BOLD,15));
		b14.setFocusable(false);
		b14.setBounds(120,380,100,40);
		b14.setBackground(Color.DARK_GRAY);
		b14.setBorder(BorderFactory.createEtchedBorder());
		b14.setForeground(Color.WHITE);
		b14.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b14.addActionListener(this);
		p3.add(b14);
		
}
	public double total_cost_bus(double x) {
		cost= x*costPerHour;
		return cost;
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l7) {
			this.setVisible(false);
			hire obj=new hire();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l7) {
			l7.setIcon(back1);
		}
		if(e.getSource()==b9) {
			b9.setBackground(Color.LIGHT_GRAY);;
		}
		if(e.getSource()==b10) {
			b10.setBackground(Color.LIGHT_GRAY);;
		}
		if(e.getSource()==b11) {
			b11.setBackground(Color.LIGHT_GRAY);;
		}
		if(e.getSource()==b12) {
			b12.setBackground(Color.LIGHT_GRAY);;
		}
		if(e.getSource()==b13) {
			b13.setBackground(Color.LIGHT_GRAY);;
		}
		if(e.getSource()==l1) {
			l1.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l2) {
			l2.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l3) {
			l3.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l4) {
			l4.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.MAGENTA);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l7) {
			l7.setIcon(back);
		}
		if(e.getSource()==b9) {
			b9.setBackground(Color.DARK_GRAY);;
		}
		if(e.getSource()==b10) {
			b10.setBackground(Color.DARK_GRAY);;
		}
		if(e.getSource()==b11) {
			b11.setBackground(Color.DARK_GRAY);;
		}
		if(e.getSource()==b12) {
			b12.setBackground(Color.DARK_GRAY);;
		}
		if(e.getSource()==b13) {
			b13.setBackground(Color.DARK_GRAY);;
		}
		if(e.getSource()==l1) {
			l1.setForeground(Color.WHITE);
		}
		if(e.getSource()==l2) {
			l2.setForeground(Color.WHITE);
		}
		if(e.getSource()==l3) {
			l3.setForeground(Color.WHITE);
		}
		if(e.getSource()==l4) {
			l4.setForeground(Color.WHITE);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.WHITE);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b9) {
			hour=1;
			total_cost_bus(hour);
			t1.setText("           "+cost);
		}
		if(e.getSource()==b10) {
			hour=2;
			total_cost_bus(hour);
			t1.setText("           "+cost);
		}
		if(e.getSource()==b11) {
			hour=4;
			total_cost_bus(hour);
			t1.setText("           "+cost);
		}
		if(e.getSource()==b12) {
			hour=8;
			total_cost_bus(hour);
			t1.setText("           "+cost);
		}
		if(e.getSource()==b13) {
			hour=16;
			total_cost_bus(hour);
			t1.setText("           "+cost);
		}
		if(e.getSource()==b14) {
			if(!t1.getText().isEmpty()) {
				this.setVisible(false);
				recharge obj=new recharge();
				obj.show();
			}
			else {
				JOptionPane.showMessageDialog(null,"Please provide full informtion.");
			}
		}	
	}
	public static void main(String[]args) {
		hire_bus obj=new hire_bus();
		obj.show();
	}
}