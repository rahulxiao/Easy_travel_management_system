package  project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Booking extends JFrame implements ActionListener,MouseListener {
	JPanel p1,p2,p3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JButton b1,b2,b3,b4,b5,b6;
	ImageIcon icon1=new ImageIcon(".\\Images\\Path 12.png");
	ImageIcon icon2=new ImageIcon(".\\Images\\Path 11.png");
	ImageIcon icon3=new ImageIcon(".\\Images\\Path 13.png");
	ImageIcon icon4=new ImageIcon(".\\Images\\Path 14.png");
	ImageIcon bg=new ImageIcon(".\\Images\\pixabay.png");
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon city=new ImageIcon(".\\Images\\city.gif");
	ImageIcon backg1=new ImageIcon(".\\Images\\backg.jpg");
	Booking(){
		
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
		b1.setBackground(new Color(90, 153, 181));
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
		
		l12=new JLabel();
        l12.setIcon(city);
        l12.setBounds(0,-55,700,600);
        p2.add(l12);
		
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
			website obj=new website();
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
	}
	public static void main(String[]args) {
		Booking obj=new Booking();
		obj.show();
	}
}
