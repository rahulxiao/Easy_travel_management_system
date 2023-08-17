package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Train_Ticket extends JFrame implements ActionListener,MouseListener {
    JPanel p1,p2,p3,p4,p5;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13,l14,l15,l16,l17,l18,l19,l21,l22,l23,l24,l25;
    JLabel l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46;
    JLabel l47,l48,l49,l50,l51,l52,l53;
    ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
    ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon train=new ImageIcon(".\\Images\\train.gif");
    public Train_Ticket() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(220,230,182));
        this.setResizable(false);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        p1=new JPanel();
        p1.setBounds(0,0,1920,65);
        p1.setLayout(null);
        p1.setBackground(new Color(121,134,163));
        this.add(p1);

        l4=new JLabel();
        l4.setText("Log out");
        l4.setFont(new Font("Arial",Font.BOLD,17));
        l4.setForeground(Color.WHITE);
        l4.setFocusable(false);
        l4.setBounds(1190,23,70,20);
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l4);

        l5=new JLabel();
        l5.setText("Emerngency");
        l5.setFont(new Font("Arial",Font.BOLD,17));
        l5.setForeground(Color.WHITE);
        l5.setFocusable(false);
        l5.setBounds(320,23,110,20);
        p1.add(l5);

        l6=new JLabel();
        l6.setText("Booking");
        l6.setFont(new Font("Arial",Font.BOLD,17));
        l6.setForeground(Color.WHITE);
        l6.setFocusable(false);
        l6.setBounds(220,23,80,20);
        p1.add(l6);

        l8=new JLabel();
        l8.setText("Parcel");
        l8.setFont(new Font("Arial",Font.BOLD,17));
        l8.setForeground(Color.WHITE);
        l8.setFocusable(false);
        l8.setBounds(130,23,65,20);
        p1.add(l8);

        l9=new JLabel();
        l9.setText("Hire");
        l9.setFont(new Font("Arial",Font.BOLD,17));
        l9.setForeground(Color.WHITE);
        l9.setFocusable(false);
        l9.setBounds(70,23,50,20);
        p1.add(l9);

        p2=new JPanel();
        p2.setBounds(0,60,415,1920);
        p2.setBackground(new Color(220,230,182));
        p2.setLayout(null);
        this.add(p2);
        
        l53=new JLabel();
        l53.setIcon(train);
        l53.setBounds(-150,80,600,500);
        p2.add(l53);
        //first
        p3=new JPanel();
        p3.setBounds(420,180,930,120);
        p3.setBackground(new Color(0,0,0,60));
        p3.setLayout(null);
        this.add(p3);
        //second
        p4=new JPanel();
        p4.setBounds(420,350,930,120);
        p4.setBackground(new Color(0,0,0,60));
        p4.setLayout(null);
        this.add(p4);
        //third
        p5=new JPanel();
        p5.setBounds(420,520,930,120);
        p5.setBackground(new Color(0,0,0,60));
        p5.setLayout(null);
        this.add(p5);
        
        //first panel
        l1=new JLabel();
        l1.setText("Karnofuli Express");
        l1.setFont(new Font("Arial",Font.BOLD,20));
        l1.setForeground(Color.black);
        l1.setFocusable(false);
        l1.setBounds(20,10,300,38);
        p3.add(l1);

        l2=new JLabel();
        l2.setText("A/C Cabin");
        l2.setFont(new Font("Arial",Font.BOLD,19));
        l2.setForeground(Color.black);
        l2.setFocusable(false);
        l2.setBounds(20,30,100,60);
        p3.add(l2);

        l3=new JLabel();
        l3.setText("20 Seats Left");
        l3.setFont(new Font("Arial",Font.BOLD,19));
        l3.setForeground(Color.black);
        l3.setFocusable(false);
        l3.setBounds(150,30,200,60);
        p3.add(l3);

        l11=new JLabel();
        l11.setText("10 Window Seats Left");
        l11.setFont(new Font("Arial",Font.BOLD,19));
        l11.setForeground(Color.black);
        l11.setFocusable(false);
        l11.setBounds(300,30,200,60);
        p3.add(l11);

        l12=new JLabel();
        l12.setText("20:30");
        l12.setFont(new Font("Arial",Font.BOLD,30));
        l12.setForeground(Color.black);
        l12.setFocusable(false);
        l12.setBounds(20,62,200,60);
        p3.add(l12);

        l13=new JLabel();
        l13.setText(", 20 APRIL");
        l13.setFont(new Font("Arial",Font.BOLD,30));
        l13.setForeground(Color.red);
        l13.setFocusable(false);
        l13.setBounds(90,62,200,60);
        p3.add(l13);

        l14=new JLabel();
        l14.setText("1");
        l14.setFont(new Font("Arial",Font.BOLD,30));
        l14.setForeground(Color.black);
        l14.setFocusable(false);
        l14.setBounds(280,62,200,60);
        p3.add(l14);

        l15=new JLabel();
        l15.setText("hrs");
        l15.setFont(new Font("Arial",Font.BOLD,30));
        l15.setForeground(Color.red);
        l15.setFocusable(false);
        l15.setBounds(300,62,200,60);
        p3.add(l15);

        l16=new JLabel();
        l16.setText("20");
        l16.setFont(new Font("Arial",Font.BOLD,30));
        l16.setForeground(Color.black);
        l16.setFocusable(false);
        l16.setBounds(360,62,200,60);
        p3.add(l16);

        l17=new JLabel();
        l17.setText("min");
        l17.setFont(new Font("Arial",Font.BOLD,30));
        l17.setForeground(Color.red);
        l17.setFocusable(false);
        l17.setBounds(405,62,200,60);
        p3.add(l17);

        l18=new JLabel();
        l18.setText("21:50");
        l18.setFont(new Font("Arial",Font.BOLD,30));
        l18.setForeground(Color.black);
        l18.setFocusable(false);
        l18.setBounds(500,62,200,60);
        p3.add(l18);

        l19=new JLabel();
        l19.setText(", 20 APRIL");
        l19.setFont(new Font("Arial",Font.BOLD,30));
        l19.setForeground(Color.red);
        l19.setFocusable(false);
        l19.setBounds(570,62,200,60);
        p3.add(l19);

        l21=new JLabel();
        l21.setText("Starting From");
        l21.setFont(new Font("Arial",Font.BOLD,20));
        l21.setForeground(Color.black);
        l21.setFocusable(false);
        l21.setBounds(765,0,200,60);
        p3.add(l21);

        l22=new JLabel();
        l22.setText("800tk");
        l22.setFont(new Font("Arial",Font.BOLD,20));
        l22.setForeground(Color.black);
        l22.setFocusable(false);
        l22.setBounds(800,30,200,60);
        p3.add(l22);

        b1=new JButton();
        b1.setText("SELECT SEAT");
        b1.setFont(new Font("Arial",Font.BOLD,10));
        b1.setBounds(750,75,150,30);
        b1.setBackground(new Color(74,120,169));
        b1.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        p3.add(b1);
        
        //second
        l23=new JLabel();
        l23.setText("Padma Express");
        l23.setFont(new Font("Arial",Font.BOLD,20));
        l23.setForeground(Color.black);
        l23.setFocusable(false);
        l23.setBounds(20,10,300,38);
        p4.add(l23);

        l24=new JLabel();
        l24.setText("A/C Cabin");
        l24.setFont(new Font("Arial",Font.BOLD,19));
        l24.setForeground(Color.black);
        l24.setFocusable(false);
        l24.setBounds(20,30,100,60);
        p4.add(l24);

        l25=new JLabel();
        l25.setText("20 Seats Left");
        l25.setFont(new Font("Arial",Font.BOLD,19));
        l25.setForeground(Color.black);
        l25.setFocusable(false);
        l25.setBounds(150,30,200,60);
        p4.add(l25);

        l26=new JLabel();
        l26.setText("20 Window Seats Left");
        l26.setFont(new Font("Arial",Font.BOLD,19));
        l26.setForeground(Color.black);
        l26.setFocusable(false);
        l26.setBounds(300,30,200,60);
        p4.add(l26);

        l27=new JLabel();
        l27.setText("20:30");
        l27.setFont(new Font("Arial",Font.BOLD,30));
        l27.setForeground(Color.black);
        l27.setFocusable(false);
        l27.setBounds(20,62,200,60);
        p4.add(l27);

        l28=new JLabel();
        l28.setText(", 20 APRIL");
        l28.setFont(new Font("Arial",Font.BOLD,30));
        l28.setForeground(Color.red);
        l28.setFocusable(false);
        l28.setBounds(90,62,200,60);
        p4.add(l28);

        l29=new JLabel();
        l29.setText("1");
        l29.setFont(new Font("Arial",Font.BOLD,30));
        l29.setForeground(Color.black);
        l29.setFocusable(false);
        l29.setBounds(280,62,200,60);
        p4.add(l29);

        l30=new JLabel();
        l30.setText("hrs");
        l30.setFont(new Font("Arial",Font.BOLD,30));
        l30.setForeground(Color.red);
        l30.setFocusable(false);
        l30.setBounds(300,62,200,60);
        p4.add(l30);

        l31=new JLabel();
        l31.setText("20");
        l31.setFont(new Font("Arial",Font.BOLD,30));
        l31.setForeground(Color.black);
        l31.setFocusable(false);
        l31.setBounds(360,62,200,60);
        p4.add(l31);

        l32=new JLabel();
        l32.setText("min");
        l32.setFont(new Font("Arial",Font.BOLD,30));
        l32.setForeground(Color.red);
        l32.setFocusable(false);
        l32.setBounds(405,62,200,60);
        p4.add(l32);

        l33=new JLabel();
        l33.setText("21:50");
        l33.setFont(new Font("Arial",Font.BOLD,30));
        l33.setForeground(Color.black);
        l33.setFocusable(false);
        l33.setBounds(500,62,200,60);
        p4.add(l33);

        l34=new JLabel();
        l34.setText(", 20 APRIL");
        l34.setFont(new Font("Arial",Font.BOLD,30));
        l34.setForeground(Color.red);
        l34.setFocusable(false);
        l34.setBounds(570,62,200,60);
        p4.add(l34);

        l35=new JLabel();
        l35.setText("Starting From");
        l35.setFont(new Font("Arial",Font.BOLD,20));
        l35.setForeground(Color.black);
        l35.setFocusable(false);
        l35.setBounds(765,0,200,60);
        p4.add(l35);

        l36=new JLabel();
        l36.setText("800tk");
        l36.setFont(new Font("Arial",Font.BOLD,20));
        l36.setForeground(Color.black);
        l36.setFocusable(false);
        l36.setBounds(800,30,200,60);
        p4.add(l36);

        b2=new JButton();
        b2.setText("SELECT SEAT");
        b2.setFont(new Font("Arial",Font.BOLD,10));
        b2.setBounds(750,75,150,30);
        b2.setBackground(new Color(74,120,169));
        b2.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        p4.add(b2);

        //third
        l37=new JLabel();
        l37.setText("Jamuna Express");
        l37.setFont(new Font("Arial",Font.BOLD,20));
        l37.setForeground(Color.black);
        l37.setFocusable(false);
        l37.setBounds(20,10,300,38);
        p5.add(l37);

        l38=new JLabel();
        l38.setText("A/C Cabin");
        l38.setFont(new Font("Arial",Font.BOLD,19));
        l38.setForeground(Color.black);
        l38.setFocusable(false);
        l38.setBounds(20,30,100,60);
        p5.add(l38);

        l39=new JLabel();
        l39.setText("20 Seats Left");
        l39.setFont(new Font("Arial",Font.BOLD,19));
        l39.setForeground(Color.black);
        l39.setFocusable(false);
        l39.setBounds(150,30,200,60);
        p5.add(l39);

        l40=new JLabel();
        l40.setText("20 Window Seats Left");
        l40.setFont(new Font("Arial",Font.BOLD,19));
        l40.setForeground(Color.black);
        l40.setFocusable(false);
        l40.setBounds(300,30,200,60);
        p5.add(l40);

        l41=new JLabel();
        l41.setText("20:30");
        l41.setFont(new Font("Arial",Font.BOLD,30));
        l41.setForeground(Color.black);
        l41.setFocusable(false);
        l41.setBounds(20,62,200,60);
        p5.add(l41);

        l42=new JLabel();
        l42.setText(", 20 APRIL");
        l42.setFont(new Font("Arial",Font.BOLD,30));
        l42.setForeground(Color.red);
        l42.setFocusable(false);
        l42.setBounds(90,62,200,60);
        p5.add(l42);

        l43=new JLabel();
        l43.setText("1");
        l43.setFont(new Font("Arial",Font.BOLD,30));
        l43.setForeground(Color.black);
        l43.setFocusable(false);
        l43.setBounds(280,62,200,60);
        p5.add(l43);

        l44=new JLabel();
        l44.setText("hrs");
        l44.setFont(new Font("Arial",Font.BOLD,30));
        l44.setForeground(Color.red);
        l44.setFocusable(false);
        l44.setBounds(300,62,200,60);
        p5.add(l44);

        l45=new JLabel();
        l45.setText("20");
        l45.setFont(new Font("Arial",Font.BOLD,30));
        l45.setForeground(Color.black);
        l45.setFocusable(false);
        l45.setBounds(360,62,200,60);
        p5.add(l45);

        l46=new JLabel();
        l46.setText("min");
        l46.setFont(new Font("Arial",Font.BOLD,30));
        l46.setForeground(Color.red);
        l46.setFocusable(false);
        l46.setBounds(405,62,200,60);
        p5.add(l46);

        l47=new JLabel();
        l47.setText("21:50");
        l47.setFont(new Font("Arial",Font.BOLD,30));
        l47.setForeground(Color.black);
        l47.setFocusable(false);
        l47.setBounds(500,62,200,60);
        p5.add(l47);

        l48=new JLabel();
        l48.setText(", 20 APRIL");
        l48.setFont(new Font("Arial",Font.BOLD,30));
        l48.setForeground(Color.red);
        l48.setFocusable(false);
        l48.setBounds(570,62,200,60);
        p5.add(l48);

        l49=new JLabel();
        l49.setText("Starting From");
        l49.setFont(new Font("Arial",Font.BOLD,20));
        l49.setForeground(Color.black);
        l49.setFocusable(false);
        l49.setBounds(765,0,200,60);
        p5.add(l49);

        l50=new JLabel();
        l50.setText("800tk");
        l50.setFont(new Font("Arial",Font.BOLD,20));
        l50.setForeground(Color.black);
        l50.setFocusable(false);
        l50.setBounds(800,30,200,60);
        p5.add(l50);
        
        l52=new JLabel();
		l52.setIcon(back);
		l52.setBounds(10, 20, 33, 30);
		l52.addMouseListener(this);
		l52.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l52);

        b3=new JButton();
        b3.setText("SELECT SEAT");
        b3.setFont(new Font("Arial",Font.BOLD,10));
        b3.setBounds(750,75,150,30);
        b3.setBackground(new Color(74,120,169));
        b3.setBorder(BorderFactory.createLineBorder(new Color(74,120,169)));
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        b3.addActionListener(this);
        p5.add(b3);
        
        l51=new JLabel();
		l51.setIcon(profile);
		l51.setBounds(1280,-120,200,300);
		p1.add(l51);
		
        this.setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
    	if(e.getSource()==b1) {
    		this.setVisible(false);
    		karnofuli_train_seat obj=new karnofuli_train_seat();
    		obj.show();
    	}
    	if(e.getSource()==b2) {
    		this.setVisible(false);
    		padma_train_seat obj=new padma_train_seat();
    		obj.show();
    	}
    	if(e.getSource()==b3) {
    		this.setVisible(false);
    		jamuna_train_seat obj=new jamuna_train_seat();
    		obj.show();
    	}
    }
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l52) {
			this.setVisible(false);
			booking_train obj=new booking_train();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l52) {
			l52.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l52) {
			l52.setIcon(back);
		}
	}
	public static void main(String[] args) {
        Train_Ticket bt=new Train_Ticket();
        bt.show();
    }
}

