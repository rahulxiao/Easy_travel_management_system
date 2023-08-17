package  project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Emergency extends JFrame implements MouseListener  {
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;

	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	
	ImageIcon ambu=new ImageIcon(".\\Images\\ambu.gif");
	
	ImageIcon police=new ImageIcon(".\\Images\\police.gif");
	
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	
	Emergency(){
		
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
		p2.setBounds(700,100,620,600);
		p2.setLayout(null);
		p2.setBackground(new Color(91, 154, 181));
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
		
		l15=new JLabel();
        l15.setIcon(back);
        l15.setBounds(13, 19, 33, 30);
        l15.addMouseListener(this);
        l15.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l15);
        
        l8=new JLabel();
		l8.setText("<html>Ambulance<br>"+" Number :</html>");
		l8.setFont(new Font("Times new roman",Font.BOLD,25));
		l8.setBounds(40,10,450,200);
		l8.setBackground(Color.black);
		l8.setForeground(Color.black);
		l8.setFocusable(false);
		this.add(l8);
		
		l9=new JLabel();
		l9.setText("<html>1.Patient information management<br><br>"+"2. Real-time location tracking<br><br>" +"3.Emergency contact information storage<br><br>"+ "4.Automated patient monitoring<br><br>"+"5.GPS navigation<br><br>"+"6.Two-way communication with hospital dispatcher<br><br>"+"7.Medical equipment inventory Management<br><br>"+"8.Automated vehicle maintenance scheduling<br><br>"+"9.Emergency lighting and siren control<br><br>"+"10.Automated billing and reporting</html>");
		l9.setFont(new Font("Times new roman",Font.BOLD,20));
		l9.setBounds(20,40,600,500);
		l9.setForeground(Color.black);
		l9.setFocusable(false);
		p2.add(l9);
	
	    l10=new JLabel();
		l10.setIcon(ambu);
		l10.setBounds(200,20,500,300);
		this.add(l10);
		
		l11=new JLabel();
		l11.setText("<html>8117576<br>"+"9131688<br>"+" 9362929</html>");
		l11.setFont(new Font("Times new roman",Font.BOLD,25));
		l11.setBounds(40,100,450,200);
		l11.setForeground(Color.black);
		l11.setFocusable(false);
		this.add(l11);
		
		l12=new JLabel();
		l12.setText("<html>Police <br>"+" Number :</html>");
		l12.setFont(new Font("Times new roman",Font.BOLD,25));
		l12.setBounds(40,350,450,200);
		l12.setBackground(Color.black);
		l12.setForeground(Color.black);
		l12.setFocusable(false);
		this.add(l12);
		
		 l13=new JLabel();
		l13.setIcon(police);
		l13.setBounds(230,400,500,300);
		this.add(l13);
		
		l14=new JLabel();
		l14.setText("<html>+880-2-223383515<br>"+"+880-2-223381967<br>"+" +88-0561-62274</html>");
		l14.setFont(new Font("Times new roman",Font.BOLD,25));
		l14.setBounds(40,450,450,200);
		l14.setForeground(Color.black);
		l14.setFocusable(false);
		this.add(l14);
		}
	
	public static void main(String[]args) {
		Emergency obj=new Emergency ();
		obj.show();
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l15) {
			website obj=new website();
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
