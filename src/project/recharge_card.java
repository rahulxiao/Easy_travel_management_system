package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class recharge_card extends JFrame implements ActionListener,MouseListener {
    JPanel p1,p2,p3,p4;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13,l14,l15,l16;
    JPasswordField pa1;
    JTextField t1,t2,t3,t4;
    public String balance="0";
    ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
    ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon card=new ImageIcon(".\\Images\\card.gif");
    public recharge_card(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(163,141,197));
        this.setResizable(false);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);


        p1=new JPanel();
        p1.setBounds(0,0,1920,65);
        p1.setLayout(null);
        p1.setBackground(new Color(121,134,163));
        this.add(p1);
        
        l16=new JLabel();
		l16.setIcon(back);
		l16.setBounds(20, 20, 33, 33);
		l16.addMouseListener(this);
		p1.add(l16);
        
        l15=new JLabel();
		l15.setIcon(profile);
		l15.setBounds(1280,-120,200,300);
		p1.add(l15);

        l4=new JLabel();
        l4.setText("Log out");
        l4.setFont(new Font("Elephant",Font.PLAIN,17));
        l4.setForeground(Color.WHITE);
        l4.setFocusable(false);
        l4.setBounds(1190,23,70,20);
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l4.addMouseListener(this);
        p1.add(l4);

        l5=new JLabel();
        l5.setText("Emerngency");
        l5.setFont(new Font("Elephant",Font.PLAIN,17));
        l5.setForeground(Color.WHITE);
        l5.setFocusable(false);
        l5.setBounds(400,23,110,20);
        p1.add(l5);

        l6=new JLabel();
        l6.setText("Booking");
        l6.setFont(new Font("Elephant",Font.PLAIN,17));
        l6.setForeground(Color.WHITE);
        l6.setFocusable(false);
        l6.setBounds(310,23,80,20);
        p1.add(l6);

        l7=new JLabel();
        l7.setText("Recharge");
        l7.setFont(new Font("Elephant",Font.PLAIN,17));
        l7.setForeground(Color.magenta);
        l7.setFocusable(false);
        l7.setBounds(210,23,85,20);
        p1.add(l7);

        l8=new JLabel();
        l8.setText("Parcel");
        l8.setFont(new Font("Elephant",Font.PLAIN,17));
        l8.setForeground(Color.WHITE);
        l8.setFocusable(false);
        l8.setBounds(130,23,65,20);
        p1.add(l8);

        l9=new JLabel();
        l9.setText("Hire");
        l9.setFont(new Font("Elephant",Font.PLAIN,17));
        l9.setForeground(Color.WHITE);
        l9.setFocusable(false);
        l9.setBounds(70,23,50,20);
        p1.add(l9);
        //recharge panel
        p2=new JPanel();
        p2.setBounds(80,110,500,80);
        p2.setLayout(null);
        p2.setBackground(new Color(219,219,219));
        this.add(p2);
        
        l1=new JLabel();
        l1.setText("Card");
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        l1.setForeground(Color.BLACK);
        l1.setFocusable(false);
        l1.setBounds(200,10,450,50);
        p2.add(l1);
        //main panel
        p3=new JPanel();
        p3.setBounds(80,180,500,550);
        p3.setLayout(null);
        p3.setBackground(new Color(201,179,235));
        this.add(p3);

        l2=new JLabel();
        l2.setText("Card Number");
        l2.setFont(new Font("Times New Roman",Font.PLAIN,25));
        l2.setForeground(Color.BLACK);
        l2.setFocusable(false);
        l2.setBounds(30,50,500,20);
        p3.add(l2);

        t1=new JTextField();
        t1.setBounds(30,90,440,50);
        t1.setBackground(new Color(219,219,219));
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setFont(new Font("Times new roman",Font.BOLD,19));
        p3.add(t1);

        l3=new JLabel();
        l3.setText("Expiration Date");
        l3.setFont(new Font("Times New Roman",Font.PLAIN,25));
        l3.setForeground(Color.BLACK);
        l3.setFocusable(false);
        l3.setBounds(30,160,500,20);
        p3.add(l3);

        t2=new JTextField();
        t2.setBounds(30,200,200,50);
        t2.setBackground(new Color(219,219,219));
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setFont(new Font("Times new roman",Font.BOLD,19));
        p3.add(t2);

        l3=new JLabel();
        l3.setText("CVC(Security Code)");
        l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        l3.setForeground(Color.BLACK);
        l3.setFocusable(false);
        l3.setBounds(270,160,500,20);
        p3.add(l3);

        pa1=new JPasswordField();
        pa1.setBounds(270,200,200,50);
        pa1.setBackground(new Color(219,219,219));
        pa1.setBorder(BorderFactory.createEmptyBorder());
        pa1.setFont(new Font("Times new roman",Font.BOLD,19));
        p3.add(pa1);

        l11=new JLabel();
        l11.setText("Name Of The Card");
        l11.setFont(new Font("Times New Roman",Font.PLAIN,25));
        l11.setForeground(Color.BLACK);
        l11.setFocusable(false);
        l11.setBounds(30,270,500,20);
        p3.add(l11);

        t4=new JTextField();
        t4.setBounds(30,310,440,50);
        t4.setBackground(new Color(219,219,219));
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.setFont(new Font("Times new roman",Font.BOLD,19));
        p3.add(t4);

        l12=new JLabel();
        l12.setText("Amount");
        l12.setFont(new Font("Times New Roman",Font.PLAIN,25));
        l12.setForeground(Color.BLACK);
        l12.setFocusable(false);
        l12.setBounds(30,370,500,20);
        p3.add(l12);

        t3=new JTextField();
        t3.setBounds(30,400,440,50);
        t3.setBackground(new Color(219,219,219));
        t3.setBorder(BorderFactory.createEmptyBorder());
        t3.setFont(new Font("Times new roman",Font.BOLD,19));
        p3.add(t3);

        b3=new JButton();
        b3.setText("Confirm");
        b3.setFont(new Font("Times new roman",Font.BOLD,20));
        b3.setBounds(150,480,200,60);
        b3.setBackground(new Color(161,225,216));
        b3.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b3.setForeground(Color.BLACK);
        b3.setFocusable(false);
        b3.addActionListener(this);
        p3.add(b3);
        
        l15=new JLabel();
        l15.setIcon(card);
        l15.setBounds(700,200,500,350);
        this.add(l15);
        

        this.setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
    	if(e.getSource()==b3 && !t1.getText().isEmpty() && !t2.getText().isEmpty() && !t3.getText().isEmpty() && !t4.getText().isEmpty() && !pa1.getText().isEmpty()) {
    		this.setVisible(false);
    		new recharge_card();
    		JOptionPane.showMessageDialog(null, "Payment Successful");
    		balance=t4.getText();
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Provide your all information please!");
    	}
    }

    public static void main(String[] args) {
        recharge_card rc1=new recharge_card();
        rc1.show();
    }
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l16) {
			this.setVisible(false);
			recharge obj=new recharge();
			obj.show();
		}
		if(e.getSource()==l4) {
			this.setVisible(false);
			home obj=new home();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l16) {
			l16.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l16) {
			l16.setIcon(back);
		}
	}
}