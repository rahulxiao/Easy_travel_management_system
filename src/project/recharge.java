package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class recharge extends JFrame implements ActionListener,MouseListener {
    JPanel p1,p2,p3,p4;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    ImageIcon pay=new ImageIcon(".\\Images\\payment.png");
    ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
    ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
    public recharge(){
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
        
        l14=new JLabel();
        l14.setIcon(back);

        l11=new JLabel();
		l11.setIcon(profile);
		l11.setBounds(1280,-120,200,300);
		p1.add(l11);
		
        l4=new JLabel();
        l4.setText("Log out");
        l4.setFont(new Font("Elephant",Font.PLAIN,17));
        l4.setForeground(Color.WHITE);
        l4.setFocusable(false);
        l4.setBounds(1190,23,70,20);
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
        
        l13=new JLabel();
		l13.setIcon(back);
		l13.setBounds(10, 20, 33, 30);
		l13.addMouseListener(this);
		l13.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l13);
        
        l10=new JLabel();
        l10.setIcon(pay);
        l10.setBounds(750,80,450,600);
        this.add(l10);
        //recharge panel
        p2=new JPanel();
        p2.setBounds(80,150,550,80);
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,0,80));
        this.add(p2);
       
        l1=new JLabel();
        l1.setText("Easy Travel :- Recharge");
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        l1.setForeground(Color.WHITE);
        l1.setFocusable(false);
        l1.setBounds(80,10,450,50);
        p2.add(l1);
        //main panel
        p3=new JPanel();
        p3.setBounds(80,150,550,550);
        p3.setLayout(null);
        p3.setBackground(new Color(201,179,235));
        this.add(p3);



        b1=new JButton();
        b1.setText("Card");
        b1.setFont(new Font("Times new roman",Font.BOLD,20));
        b1.setBounds(20,220,250,80);
        b1.setBackground(new Color(74,120,169));
        b1.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        p3.add(b1);

        b2=new JButton();
        b2.setText("Mobile Banking");
        b2.setFont(new Font("Times new roman",Font.BOLD,20));
        b2.setBounds(280,220,250,80);
        b2.setBackground(new Color(74,120,169));
        b2.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        p3.add(b2);

        this.setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
    	if(e.getSource()==b1) {
    		this.setVisible(false);
    		recharge_card obj=new recharge_card();
    		obj.show();
    	}
    	if(e.getSource()==b2) {
    		this.setVisible(false);
    		transaction obj=new transaction();
    		obj.show();
    	}
    }
    public static void main(String[] args) {
    	recharge obj=new recharge();
        obj.show();
    }

	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l13) {
			website obj=new website();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l13) {
			l13.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l13) {
			l13.setIcon(back);
		}
	}
}
