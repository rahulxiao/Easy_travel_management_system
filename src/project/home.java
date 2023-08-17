package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class home extends JFrame implements ActionListener,MouseListener {
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JButton b1,b2;
	ImageIcon bg=new ImageIcon(".\\Images\\welcome.gif");
	ImageIcon logo=new ImageIcon(".\\Images\\logo.png");
	ImageIcon lamp=new ImageIcon(".\\Images\\lamp.png");
	ImageIcon line=new ImageIcon(".\\Images\\line1.png");
	ImageIcon contact=new ImageIcon(".\\Images\\telephone (1).png");
	ImageIcon contact1=new ImageIcon(".\\Images\\telephone.png");

	public home(){
		 //frame
		this.setTitle("Home Page");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(163,141,197));
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		
		//Label
		l1=new JLabel();
		l1.setIcon(bg);
		l1.setBounds(650,0,800,800);
		this.add(l1);
		
		l2=new JLabel();
		l2.setIcon(logo);
		l2.setBounds(5,20,300,135);
		this.add(l2);
		
		l4=new JLabel();
		l4.setText("Work With Us");
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setForeground(Color.WHITE);
		l4.setFocusable(false);
		l4.setBounds(930,23,150,20);
		l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l4.addMouseListener(this);
		this.add(l4);
		
		l5=new JLabel();
		l5.setText("About");
		l5.setFont(new Font("Arial",Font.BOLD,21));
		l5.setBounds(1100,7,80,50);
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l5.addMouseListener(this);
		this.add(l5);
		
		l6=new JLabel();
		l6.setText("Why buy ticktes from us?");
		l6.setFont(new Font("Arial",Font.BOLD,23));
		l6.setBounds(40,230,400,200);
		l6.setForeground(Color.ORANGE);
		this.add(l6);
		
		l7=new JLabel();
		l7.setText("Buy Bus homes From AnyWhere");
		l7.setFont(new Font("Arial",Font.BOLD,15));
		l7.setBounds(40,260,400,200);
		l7.setForeground(Color.white);
		l7.setFocusable(false);
		this.add(l7);
		
		l7=new JLabel();
		l7.setText("Pay By Bank Cards,Mobile Banking or cash");
		l7.setFont(new Font("Arial",Font.BOLD,15));
		l7.setBounds(40,290,400,200);
		l7.setForeground(Color.white);
		l7.setFocusable(false);
		this.add(l7);
		
		l8=new JLabel();
		l8.setText("Get homes Delivered To Your Doorstep.*TCA ");
		l8.setFont(new Font("Arial",Font.BOLD,15));
		l8.setBounds(40,320,450,200);
		l8.setForeground(Color.white);
		l8.setFocusable(false);
		this.add(l8);
		
		l9=new JLabel();
		l9.setText("Dependable Customer Service(7 AM To 12 AM)");
		l9.setFont(new Font("Arial",Font.BOLD,15));
		l9.setBounds(40,350,450,200);
		l9.setForeground(Color.white);
		l9.setFocusable(false);
		this.add(l9);
		
		l10=new JLabel();
		l10.setText("Contact us...");
		l10.setFont(new Font("Arial",Font.BOLD,20));
		l10.setBounds(90,630,130,30);
		l10.setForeground(Color.white);
		l10.setFocusable(false);
		l10.addMouseListener(this);
		l10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(l10);
		
		l13=new JLabel();
		l13.setIcon(contact);
		l13.setBounds(60,630,120,30);
		l13.addMouseListener(this);
		l13.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(l13);
		
		l11=new JLabel();
		l11.setIcon(lamp);
		l11.setBounds(30,200,150,129);
		this.add(l11);

        l12=new JLabel();
		l12.setIcon(line);
		l12.setBounds(100,200,300,129);
		this.add(l12);
		
		
		//Button
		b1=new JButton();
		b1.setText("LogIn");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setBounds(1200,23,70,25);
		b1.setBackground(new Color(74,120,169));
		b1.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
		b1.setForeground(Color.WHITE);
		b1.setFocusable(false);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(this);
		b1.addMouseListener(this);
		this.add(b1);
		
		b2=new JButton();
		b2.setText("Signup");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(140,500,80,30);
		b2.setBackground(new Color(74,120,169));
		b2.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
		b2.setForeground(Color.WHITE);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
		b2.addMouseListener(this);
		b2.setFocusable(false);
		this.add(b2);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			SignIn obj=new SignIn();
			obj.show();
		}
		if(e.getSource()==b2) {
			this.setVisible(false);
			SignUp obj=new SignUp();
			obj.show();
		}
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l10 || e.getSource()==l13) {
			this.setVisible(false);
			support obj=new support();
			obj.show();
		}
		if(e.getSource()==l5 ) {
			this.setVisible(false);
			about obj=new about();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
		
	}
	public void mouseReleased(MouseEvent e) {
		
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l10 || e.getSource()==l13) {
			l13.setIcon(contact1);
		}
		if(e.getSource()==b1) {
			b1.setBackground(new Color(163,141,197));
		}
		if(e.getSource()==b2) {
			b2.setBackground(new Color(163,141,197));
		}
		if(e.getSource()==l4) {
			l4.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.MAGENTA);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l10 || e.getSource()==l13) {
			l13.setIcon(contact);
		}
		if(e.getSource()==b1) {
			b1.setBackground(new Color(74,120,169));
		}
		if(e.getSource()==b2) {
			b2.setBackground(new Color(74,120,169));
		}
		if(e.getSource()==l4) {
			l4.setForeground(Color.WHITE);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.WHITE);
		}
	}
}