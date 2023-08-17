package  project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class transaction extends JFrame implements MouseListener {
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l10,l9,l11,l12,l13,l14,l15;

	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon bkash=new ImageIcon(".\\Images\\bkash.png");
	ImageIcon nagot=new ImageIcon(".\\Images\\nagot.png");
	ImageIcon rocket=new ImageIcon(".\\Images\\rocket.png");
	ImageIcon upay=new ImageIcon(".\\Images\\upay.png");
	
	transaction(){
		
		//Frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(163,141,197));
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
		p2.setBounds(460,100,620,600);
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,0,80));
		this.add(p2);
		
		//Label
		l1=new JLabel();
		l1.setText("Emerngency");
		l1.setFont(new Font("Arial",Font.BOLD,17));
		l1.setForeground(Color.WHITE);
		l1.setFocusable(false);
		l1.setBounds(320,23,110,20);
		p1.add(l1);
		
		l2=new JLabel();
		l2.setText("Booking");
		l2.setFont(new Font("Arial",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		l2.setFocusable(false);
		l2.setBounds(220,23,80,20);
		p1.add(l2);
		
		l4=new JLabel();
		l4.setText("Parcel");
		l4.setFont(new Font("Arial",Font.BOLD,17));
		l4.setForeground(Color.WHITE);
		l4.setFocusable(false);
		l4.setBounds(130,23,65,20);
		p1.add(l4);
		
		l5=new JLabel();
		l5.setText("Hire");
		l5.setFont(new Font("Arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setBounds(70,23,50,20);
		p1.add(l5);
		
		l6=new JLabel();
		l6.setText("Log out");
		l6.setFont(new Font("Arial",Font.BOLD,17));
		l6.setForeground(Color.WHITE);
		l6.setFocusable(false);
		l6.setBounds(1190,23,70,20);
		p1.add(l6);
	
		l7=new JLabel();
		l7.setIcon(profile);
		l7.setBounds(1280,-120,200,300);
		p1.add(l7);

        
        l8=new JLabel();
		l8.setIcon(bkash);
		l8.setBounds(40,20,100,100);
		l8.addMouseListener(this);
		p2.add(l8);
	   
	   l9=new JLabel();
		l9.setText("Bkash");
		l9.setFont(new Font("Times new roman",Font.BOLD,25));
		l9.setBounds(50,100,110,100);
		l9.setForeground(Color.black);
		l9.setFocusable(false);
		p2.add(l9);
	   
	   l10=new JLabel();
		l10.setIcon(nagot);
		l10.setBounds(220,20,150,100);
		l10.addMouseListener(this);
		p2.add(l10);
	   
	   l11=new JLabel();
		l11.setText("Nagad");
		l11.setFont(new Font("Times new roman",Font.BOLD,25));
		l11.setBounds(250,100,110,100);
		l11.setForeground(Color.black);
		l11.setFocusable(false);
		p2.add(l11);
	   
        l12=new JLabel();
		l12.setIcon(rocket);
		l12.setBounds(450,20,150,100);
		l12.addMouseListener(this);
		p2.add(l12);
	   
	    l13=new JLabel();
		l13.setText("Rocket");
		l13.setFont(new Font("Times new roman",Font.BOLD,25));
		l13.setBounds(480,100,110,100);
		l13.setForeground(Color.black);
		l13.setFocusable(false);
		p2.add(l13);
		
		l14=new JLabel();
		l14.setIcon(upay);
		l14.setBounds(220,240,200,130);
		l14.addMouseListener(this);
		p2.add(l14);
		
		l15=new JLabel();
		l15.setText("Upay");
		l15.setFont(new Font("Times new roman",Font.BOLD,25));
		l15.setBounds(260,340,110,100);
		l15.setForeground(Color.black);
		l15.setFocusable(false);
		p2.add(l15);
	   
		}
	
	public static void main(String[]args) {
		transaction obj=new transaction ();
		obj.show();
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l8) {
			this.setVisible(false);
			confirm obj=new confirm();
			obj.show();
		}
		if(e.getSource()==l10) {
			this.setVisible(false);
			confirm obj=new confirm();
			obj.show();
		}
		if(e.getSource()==l12) {
			this.setVisible(false);
			confirm obj=new confirm();
			obj.show();
		}
		if(e.getSource()==l14) {
			this.setVisible(false);
			confirm obj=new confirm();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}

}
