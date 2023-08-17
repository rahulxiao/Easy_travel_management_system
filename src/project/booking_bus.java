package  project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class booking_bus extends JFrame implements ActionListener,MouseListener {
	JPanel p1,p2,p3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
	JRadioButton r1,r2;
	ButtonGroup choice=new ButtonGroup();
	String[] location= {"Barisal","Chittagong","Dhaka","Khulna","Mymensingh","Rajshahi","Sylhet","Rangpur"};
	String[] day= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String[] month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	ImageIcon icon1=new ImageIcon(".\\Images\\Path 12.png");
	ImageIcon icon2=new ImageIcon(".\\Images\\Path 11.png");
	ImageIcon icon3=new ImageIcon(".\\Images\\Path 13.png");
	ImageIcon icon4=new ImageIcon(".\\Images\\Path 14.png");
	ImageIcon bg=new ImageIcon(".\\Images\\pixabay.png");
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon bus=new ImageIcon(".\\Images\\bus.gif");
	ImageIcon backg1=new ImageIcon(".\\Images\\backg.jpg");
	booking_bus(){
		
		//Frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0,0,0,80));
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		
		//Panel
		p1=new JPanel();
		p1.setBounds(0,0,1920,60);
		p1.setLayout(null);
		p1.setBackground(new Color(91, 154, 181));
		this.add(p1);

		p2=new JPanel();
		p2.setBounds(410,200,700,550);
		p2.setBackground(new Color(163,141,197));
		p2.setLayout(null);
		this.add(p2);
		
		p3=new JPanel();
		p3.setBounds(20,230,660,100);
		p3.setBackground(new Color(229, 190, 236));
		p3.setLayout(null);
		p2.add(p3);
		
		//Label
		l1=new JLabel();
		l1.setIcon(backg1);
		l1.setBounds(110,0,1900,900);
		this.add(l1);
		
		l2=new JLabel();
		l2.setText("Emerngency");
		l2.setFont(new Font("Arial",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		l2.setFocusable(false);
		l2.setBounds(320,23,110,20);
		p1.add(l2);
		
		l3=new JLabel();
		l3.setText("Booking");
		l3.setFont(new Font("Arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		l3.setFocusable(false);
		l3.setBounds(220,23,80,20);
		p1.add(l3);
		
		l5=new JLabel();
		l5.setText("Parcel");
		l5.setFont(new Font("Arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setBounds(130,23,65,20);
		p1.add(l5);
		
		l6=new JLabel();
		l6.setText("Hire");
		l6.setFont(new Font("Arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		l6.setFocusable(false);
		l6.setBounds(70,23,50,20);
		p1.add(l6);
		
		l7=new JLabel();
		l7.setText("Date:");
		l7.setFont(new Font("Times new roman",Font.BOLD,17));
		l7.setBounds(350,35,150,30);
		l7.setForeground(Color.BLACK);
		p3.add(l7);
		
		l8=new JLabel();
		l8.setFont(new Font("Times new roman",Font.BOLD,17));
		l8.setBounds(330,60,150,30);
		l8.setForeground(Color.BLACK);
		p3.add(l8);
		
		l9=new JLabel();
		l9.setIcon(profile);
		l9.setBounds(1280,-120,200,300);
		p1.add(l9);
		
		l10=new JLabel();
		l10.setText("Log out");
		l10.setFont(new Font("Arial",Font.BOLD,17));
		l10.setForeground(Color.WHITE);
		l10.setFocusable(false);
		l10.addMouseListener(this);
		l10.setBounds(1190,23,70,20);
		l10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p1.add(l10);
		
		l11=new JLabel();
		l11.setIcon(back);
		l11.setBounds(10, 20, 33, 30);
		l11.addMouseListener(this);
		l11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l11);

		//Button
		b1=new JButton();
		b1.setIcon(icon2);
		b1.setText("BUS");
		b1.setBounds(0,0,175,50);
		b1.setFocusable(false);
		b1.setBackground(Color.WHITE);
		b1.setBorder(BorderFactory.createEtchedBorder());
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(this);
		p2.add(b1);
		
		b2=new JButton();
		b2.setIcon(icon1);
		b2.setText("TRAIN");
		b2.setBounds(175,0,175,50);
		b2.setFocusable(false);
		b2.setBackground(new Color(90, 153, 181));
		b2.setBorder(BorderFactory.createEtchedBorder());
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
		p2.add(b2);
		
		b3=new JButton();
		b3.setIcon(icon3);
		b3.setText("FLIGHT");
		b3.setBounds(350,0,175,50);
		b3.setFocusable(false);
		b3.setBackground(new Color(90, 153, 181));
		b3.setBorder(BorderFactory.createEtchedBorder());
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.addActionListener(this);
		p2.add(b3);
		
		b4=new JButton();
		b4.setIcon(icon4);
		b4.setText("LAUNCH");
		b4.setBounds(525,0,175,50);
		b4.setFocusable(false);
		b4.setBackground(new Color(90, 153, 181));
		b4.setBorder(BorderFactory.createEtchedBorder());
		b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4.addActionListener(this);
		p2.add(b4);
		
		b7=new JButton();
		b7.setText("Search");
		b7.setBounds(255,350,175,40);
		b7.setFocusable(false);
		b7.setBackground(new Color(90, 153, 181));
		b7.setBorder(BorderFactory.createEtchedBorder());
		b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b7.setFont(new Font("Arial",Font.BOLD,20));
		b7.addActionListener(this);
		p2.add(b7);
		//Combo Box
		cb1=new JComboBox(location);
		cb1.setFont(new Font("Times new roman",Font.BOLD,17));
		cb1.setBounds(10,35,150,30);
		cb1.setEditable(true);
		cb1.setSelectedItem("From");
		cb1.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
		cb1.setBackground(new Color(90, 153, 181));
		p3.add(cb1);
		
		cb2=new JComboBox(location);
		cb2.setFont(new Font("Times new roman",Font.BOLD,17));
		cb2.setBounds(170,35,150,30);
		cb2.setEditable(true);
		cb2.setSelectedItem("To");
		cb2.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
		cb2.setBackground(new Color(90, 153, 181));
		p3.add(cb2);
		
		cb3=new JComboBox(day);
		cb3.setFont(new Font("Times new roman",Font.BOLD,17));
		cb3.setBounds(425,35,100,30);
		cb3.setEditable(true);
		cb3.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
		cb3.setBackground(new Color(90, 153, 181));
		p3.add(cb3);
		
		cb4=new JComboBox(month);
		cb4.setFont(new Font("Times new roman",Font.BOLD,17));
		cb4.setBounds(550,35,100,30);
		cb4.setEditable(true);
		cb4.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
		cb4.setBackground(new Color(90, 153, 181));
		p3.add(cb4);
		
		r1=new JRadioButton();
		r1.setText("On Going");
		r1.setBounds(200,100,120,50);
		r1.setFocusable(false);
		r1.setBackground(new Color(163,141,197));
		r1.setBorder(BorderFactory.createEtchedBorder());
		r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		r1.setFont(new Font("Arial",Font.BOLD,20));
		choice.add(r1);
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r1.setForeground(Color.BLACK);
				r2.setForeground(new Color(90, 153, 181));
				cb3.setBounds(425,35,100,30);
				cb4.setBounds(550,35,100,30);
				l7.setText("Date:");
				l7.setBounds(350,35,150,30);
				l8.setText("");
				try{
					p3.remove(cb5);
					p3.remove(cb6);
				}catch(Exception me){
					
				}
			}
		});
		p2.add(r1);
		
		r2=new JRadioButton();
		r2.setText("Round Trip");
		r2.setBounds(375,100,140,50);
		r2.setFocusable(false);
		r2.setBackground(new Color(163,141,197));
		r2.setBorder(BorderFactory.createEtchedBorder());
		r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		r2.setFont(new Font("Arial",Font.BOLD,20));
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r2.setForeground(Color.BLACK);
				r1.setForeground(new Color(90, 153, 181));
				l8.setText("Return Date:");
				l8.setFont(new Font("Times new roman",Font.BOLD,15));
				l7.setFont(new Font("Times new roman",Font.BOLD,15));
				l7.setBounds(330,0,150,30);
				
				cb5=new JComboBox(day);
				cb5.setFont(new Font("Times new roman",Font.BOLD,17));
				cb5.setBounds(430,60,100,30);
				cb5.setEditable(true);
				cb5.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
				cb5.setBackground(new Color(90, 153, 181));
				p3.add(cb5);
				
				cb6=new JComboBox(month);
				cb6.setFont(new Font("Times new roman",Font.BOLD,17));
				cb6.setBounds(550,60,100,30);
				cb6.setEditable(true);
				cb6.getEditor().getEditorComponent().setBackground(new Color(90, 153, 181));
				cb6.setBackground(new Color(90, 153, 181));
				p3.add(cb6);
				cb3.setBounds(430,0,100,30);
				cb4.setBounds(550,0,100,30);
			}
		});
		p2.add(r2);
		
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l10) {
			this.setVisible(false);
			home obj=new home();
			obj.show();
		}
		if(e.getSource()==l11) {
			this.setVisible(false);
			Booking obj=new Booking();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l11) {
			l11.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l11) {
			l11.setIcon(back);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			booking_bus obj=new booking_bus();
			obj.show();
		}
		else if(e.getSource()==b2) {
			this.setVisible(false);
			booking_train obj=new booking_train();
			obj.show();
		}
		else if(e.getSource()==b3) {
			this.setVisible(false);
			booking_flight obj=new booking_flight();
			obj.show();
		}
		else if(e.getSource()==b4) {
			this.setVisible(false);
			booking_launch obj=new booking_launch();
			obj.show();
		}
		if(e.getSource()==b7) {
			this.setVisible(false);
			bus_ticket obj=new bus_ticket();
			obj.show();
		}
	}
	public static void main(String[]args) {
		booking_bus obj=new booking_bus();
		obj.show();
	}
}
