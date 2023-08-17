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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hire extends JFrame implements ActionListener,MouseListener {
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon bus=new ImageIcon(".\\Images\\bus-transport.gif");
	ImageIcon mini_bus=new ImageIcon(".\\Images\\mini_bus.gif");
	ImageIcon motor_cycle=new ImageIcon(".\\Images\\motor_cycle.gif");
	ImageIcon car=new ImageIcon(".\\Images\\car.gif");
	ImageIcon delivery_man=new ImageIcon(".\\Images\\delivery_man.gif");
	ImageIcon cycle=new ImageIcon(".\\Images\\cycle.gif");
	ImageIcon cng=new ImageIcon(".\\Images\\rickshaw.gif");
	ImageIcon vip_car=new ImageIcon(".\\Images\\vip_car.gif");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	public hire(){
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
		p2.setBounds(0,0,1920,1080);
		p2.setLayout(null);
		p2.setBackground(new Color(121,134,163));
		this.add(p2);
		//Label
		l1=new JLabel();
		l1.setText("Log out");
		l1.setFont(new Font("Arial",Font.BOLD,17));
		l1.setForeground(Color.WHITE);
		l1.setFocusable(false);
		l1.addMouseListener(this);
		l1.setBounds(1190,23,70,20);
		l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p2.add(l1);
		
		l2=new JLabel();
		l2.setText("Emerngency");
		l2.setFont(new Font("Arial",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		l2.setFocusable(false);
		l2.setBounds(350,23,110,20);
		l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l2.addMouseListener(this);
		p2.add(l2);
		
		l3=new JLabel();
		l3.setText("Booking");
		l3.setFont(new Font("Arial",Font.BOLD,17));
		l3.setForeground(Color.WHITE);
		l3.setFocusable(false);
		l3.setBounds(250,23,80,20);
		l3.addMouseListener(this);
		l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l3.addMouseListener(this);
		p2.add(l3);
		
		l5=new JLabel();
		l5.setText("Parcel");
		l5.setFont(new Font("Arial",Font.BOLD,17));
		l5.setForeground(Color.WHITE);
		l5.setFocusable(false);
		l5.setBounds(150,23,65,20);
		l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l5.addMouseListener(this);
		p2.add(l5);
		
		l7=new JLabel();
        l7.setIcon(back);
        l7.setBounds(13, 19, 33, 30);
        l7.addMouseListener(this);
        l7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(l7);
		
		l6=new JLabel();
		l6.setText("Hire");
		l6.setFont(new Font("Arial",Font.BOLD,17));
		l6.setForeground(Color.MAGENTA);
		l6.setFocusable(false);
		l6.setBounds(70,23,50,20);
		l6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p2.add(l6);
		
		l4=new JLabel();
		l4.setIcon(profile);
		l4.setBounds(1280,-120,200,300);
		p2.add(l4);
		
		l8=new JLabel();
		l8.setIcon(bus);
		l8.setBounds(80,60,200,100);
		p1.add(l8);
		
		b1=new JButton();
		b1.setText("Bus");
		b1.setBounds(80,190,200,30);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setFocusable(false);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b1.addMouseListener(this);
		b1.addActionListener(this);
		p1.add(b1);
		
		l8=new JLabel();
		l8.setIcon(mini_bus);
		l8.setBounds(425,70,200,100);
		p1.add(l8);
		
		b2=new JButton();
		b2.setText("Mini Bus");
		b2.setBounds(425,190,200,30);
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setFocusable(false);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b2.addMouseListener(this);
		b2.addActionListener(this);
		p1.add(b2);
		
		l8=new JLabel();
		l8.setIcon(motor_cycle);
		l8.setBounds(750,50,200,140);
		p1.add(l8);
		
		b3=new JButton();
		b3.setText("Motor Cycle");
		b3.setBounds(750,190,200,30);
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setFocusable(false);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b3.addMouseListener(this);
		b3.addActionListener(this);
		p1.add(b3);
		
		l8=new JLabel();
		l8.setIcon(car);
		l8.setBounds(1050,80,200,100);
		p1.add(l8);
		
		b4=new JButton();
		b4.setText("Car");
		b4.setBounds(1050,190,200,30);
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setFocusable(false);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b4.addMouseListener(this);
		b4.addActionListener(this);
		p1.add(b4);
		
		l8=new JLabel();
		l8.setIcon(delivery_man);
		l8.setBounds(80,350,200,170);
		p1.add(l8);
		
		b5=new JButton();
		b5.setText("Delivery Man");
		b5.setBounds(80,550,200,30);
		b5.setFont(new Font("Arial",Font.BOLD,20));
		b5.setFocusable(false);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b5.addMouseListener(this);
		b5.addActionListener(this);
		p1.add(b5);
		
		l8=new JLabel();
		l8.setIcon(cycle);
		l8.setBounds(425,350,200,170);
		p1.add(l8);
		
		b6=new JButton();
		b6.setText("Cycle");
		b6.setBounds(425,550,200,30);
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setFocusable(false);
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b6.addMouseListener(this);
		b6.addActionListener(this);
		p1.add(b6);
		
		l8=new JLabel();
		l8.setIcon(cng);
		l8.setBounds(750,350,200,170);
		p1.add(l8);
		
		b7=new JButton();
		b7.setText("CNG");
		b7.setBounds(750,550,200,30);
		b7.setFont(new Font("Arial",Font.BOLD,20));
		b7.setFocusable(false);
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b7.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b7.addMouseListener(this);
		b7.addActionListener(this);
		p1.add(b7);
		
		l8=new JLabel();
		l8.setIcon(vip_car);
		l8.setBounds(1050,350,200,170);
		p1.add(l8);
		
		b8=new JButton();
		b8.setText("VIP Car");
		b8.setBounds(1050,550,200,30);
		b8.setFont(new Font("Arial",Font.BOLD,20));
		b8.setFocusable(false);
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		b8.addMouseListener(this);
		b8.addActionListener(this);
		p1.add(b8);
		
		this.setVisible(true);
}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l1) {
			this.setVisible(false);
			home obj=new home();
			obj.show();
		}
		if(e.getSource()==l7) {
			this.setVisible(false);
			website obj=new website();
			obj.show();
		}
		if(e.getSource()==l5) {
			this.setVisible(false);
			hire_delivery_man obj=new hire_delivery_man();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l1) {
			l1.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l2) {
			l2.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l3) {
			l3.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.MAGENTA);
		}
		if(e.getSource()==b1) {
			b1.setBackground(Color.WHITE);
		}
		if(e.getSource()==b2) {
			b2.setBackground(Color.WHITE);
		}
		if(e.getSource()==b3) {
			b3.setBackground(Color.WHITE);
		}
		if(e.getSource()==b4) {
			b4.setBackground(Color.WHITE);
		}
		if(e.getSource()==b5) {
			b5.setBackground(Color.WHITE);
		}
		if(e.getSource()==b6) {
			b6.setBackground(Color.WHITE);
		}
		if(e.getSource()==b7) {
			b7.setBackground(Color.WHITE);
		}
		if(e.getSource()==b8) {
			b8.setBackground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l1) {
			l1.setForeground(Color.WHITE);
		}
		if(e.getSource()==l2) {
			l2.setForeground(Color.WHITE);
		}
		if(e.getSource()==l3) {
			l3.setForeground(Color.WHITE);
		}
		if(e.getSource()==l5) {
			l5.setForeground(Color.WHITE);
		}
		if(e.getSource()==b1) {
			b1.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b2) {
			b2.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b3) {
			b3.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b4) {
			b4.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b5) {
			b5.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b6) {
			b6.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b7) {
			b7.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource()==b8) {
			b8.setBackground(Color.LIGHT_GRAY);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			hire_bus obj=new hire_bus();
			obj.show();
		}
		if(e.getSource()==b2) {
			this.setVisible(false);
			hire_mini_bus obj=new hire_mini_bus();
			obj.show();
		}
		if(e.getSource()==b3) {
			this.setVisible(false);
			hire_motor_cycle obj=new hire_motor_cycle();
			obj.show();
		}
		if(e.getSource()==b4) {
			this.setVisible(false);
			hire_car obj=new hire_car();
			obj.show();
		}
		if(e.getSource()==b5) {
			this.setVisible(false);
			hire_delivery_man obj=new hire_delivery_man();
			obj.show();
		}
		if(e.getSource()==b6) {
			this.setVisible(false);
			hire_cycle obj=new hire_cycle();
			obj.show();
		}
		if(e.getSource()==b7) {
			this.setVisible(false);
			hire_cng obj=new hire_cng();
			obj.show();
		}
		if(e.getSource()==b8) {
			this.setVisible(false);
			hire_vip_car obj=new hire_vip_car();
			obj.show();
		}
	}
	public static void main(String[]args) {
		hire obj=new hire();
		obj.show();
	}
}