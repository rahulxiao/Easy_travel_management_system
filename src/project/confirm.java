package  project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class confirm extends JFrame implements MouseListener,ActionListener {
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2;
	JButton b1;

	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon bkash=new ImageIcon(".\\Images\\bkash.png");
	ImageIcon nagot=new ImageIcon(".\\Images\\nagot.png");
	ImageIcon rocket=new ImageIcon(".\\Images\\rocket.png");
	ImageIcon upay=new ImageIcon(".\\Images\\upay.png");
	ImageIcon back1=new ImageIcon(".\\Images\\backbutton.png");
	confirm(){
		
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
		p2.setBounds(470,150,620,600);
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,0,80));
		this.add(p2);
		
		//Label
		l1=new JLabel();
		l1.setText("Emergency");
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
		l8.setText("Phone Number");
		l8.setFont(new Font("Arial",Font.BOLD,20));
		l8.setForeground(Color.BLACK);
		l8.setFocusable(false);
		l8.setBounds(50,100,200,30);
		p2.add(l8);

        t1=new JTextField();
        t1.setBounds(50, 150, 500, 40);
        t1.setBackground(new Color(91,154,181));
        p2.add(t1);
        
        l9=new JLabel();
		l9.setText("PIN");
		l9.setFont(new Font("Arial",Font.BOLD,20));
		l9.setForeground(Color.BLACK);
		l9.setFocusable(false);
		l9.setBounds(50,240,200,30);
		p2.add(l9);
		
		t2=new JTextField();
        t2.setBounds(50, 280, 100, 40);
        t2.setBackground(new Color(91,154,181));
        p2.add(t2);
        
        b1=new JButton();
        b1.setText("Confirm");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setBounds(220,400,200,30);
        b1.setBackground(new Color(91,154,181));
        b1.setBorder(BorderFactory.createEtchedBorder());
        p2.add(b1);
        
        l10=new JLabel();
        l10.setIcon(back1);
        l10.setBounds(13, 19, 33, 30);
        l10.addMouseListener(this);
        l10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l10);
        
	   
		}
	
	public static void main(String[]args) {
		confirm obj=new confirm ();
		obj.show();
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l10) {
			transaction obj=new transaction();
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1 && !t1.getText().isEmpty() && !t2.getText().isEmpty()) {
			this.setVisible(false);
			JOptionPane.showMessageDialog(null, "Payment Complete");
			website obj=new website();
			obj.show();
		}
		else {
			JOptionPane.showMessageDialog(null, "Provide correct information");
		}
	}
}
