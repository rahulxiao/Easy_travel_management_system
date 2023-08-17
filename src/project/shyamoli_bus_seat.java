package  project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class shyamoli_bus_seat extends JFrame implements ActionListener,MouseListener{
	JPanel p1,p2,p3,p4,p5;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
	//Seat Labels
	JButton l23, l24, l25, l26, l27, l28, l29, l30, l31, l32;
	JButton l33, l34, l35, l36, l37, l38, l39, l40, l41, l42;
	JButton l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53;
	JButton l54, l55, l56, l57, l58, l59, l60, l61, l62, l63,b1;
	JLabel l64,l65,l66;
	JTable tb;
	String[] coloums= {"Seat Number","Fare"};
	DefaultTableModel d;
	JScrollPane sc;
	String[] rows = new String [2];
	int count=0;
	ImageIcon profile=new ImageIcon(".\\Images\\profile.png");
	ImageIcon steer=new ImageIcon(".\\Images\\staring.png");
	ImageIcon seat=new ImageIcon(".\\Images\\seat_notSelected.png");
	ImageIcon seat1=new ImageIcon(".\\Images\\seat_selected.png");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon shyamoli_bus=new ImageIcon(".\\Images\\shyamoli_bus.jpg");
	public shyamoli_bus_seat(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(163,141,197));
        this.setResizable(false);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        //Panel
        p1=new JPanel();
        p1.setBounds(0,0,1920,65);
        p1.setLayout(null);
        p1.setBackground(new Color(121,134,163));
        this.add(p1);
        
        p2=new JPanel();
        p2.setBounds(0,60,400,1920);
        p2.setBackground(new Color(112,97,135));
        p2.setLayout(null);
        this.add(p2);
        
        p3=new JPanel();
        p3.setBounds(420,100,930,620);
        p3.setBackground(new Color(0,0,0,50));
        p3.setLayout(null);
        this.add(p3);
        
        p4=new JPanel();
        p4.setBounds(420,200,450,300);
        p4.setBackground(new Color(0,0,0,30));
        p4.setLayout(null);
        p3.add(p4);
        
        p5=new JPanel();
        p5.setBounds(20,200,380,400);
        p5.setBackground(new Color(0,0,0,30));
        p5.setLayout(null);
        p3.add(p5);
        
        //Label
        l1=new JLabel();
        l1.setText("Log out");
        l1.setFont(new Font("Elephant",Font.PLAIN,17));
        l1.setForeground(Color.WHITE);
        l1.setFocusable(false);
        l1.setBounds(1190,23,70,20);
        l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(l1);

        l2=new JLabel();
        l2.setText("Emerngency");
        l2.setFont(new Font("Elephant",Font.PLAIN,17));
        l2.setForeground(Color.WHITE);
        l2.setFocusable(false);
        l2.setBounds(400,23,110,20);
        p1.add(l2);

        l3=new JLabel();
        l3.setText("Booking");
        l3.setFont(new Font("Elephant",Font.PLAIN,17));
        l3.setForeground(Color.WHITE);
        l3.setFocusable(false);
        l3.setBounds(310,23,80,20);
        p1.add(l3);

        l4=new JLabel();
        l4.setText("Recharge");
        l4.setFont(new Font("Elephant",Font.PLAIN,17));
        l4.setForeground(Color.WHITE);
        l4.setFocusable(false);
        l4.setBounds(210,23,85,20);
        p1.add(l4);

        l5=new JLabel();
        l5.setText("Parcel");
        l5.setFont(new Font("Elephant",Font.PLAIN,17));
        l5.setForeground(Color.WHITE);
        l5.setFocusable(false);
        l5.setBounds(130,23,65,20);
        p1.add(l5);

        l6=new JLabel();
        l6.setText("Hire");
        l6.setFont(new Font("Elephant",Font.PLAIN,17));
        l6.setForeground(Color.WHITE);
        l6.setFocusable(false);
        l6.setBounds(70,23,50,20);
        p1.add(l6);
        
        l7=new JLabel();
		l7.setIcon(profile);
		l7.setBounds(1280,-120,200,300);
		p1.add(l7);
		
		b1=new JButton();
        b1.setText("PAY NOW");
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBounds(120,260,200,30);
        b1.setFocusable(false);
        b1.setBackground(Color.GRAY);
        b1.addActionListener(this);
        p4.add(b1);
		
		l8=new JLabel();
        l8.setText("Shyamoli Paribohon");
        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
        l8.setForeground(Color.black);
        l8.setFocusable(false);
        l8.setBounds(20,10,300,38);
        p3.add(l8);

        l9=new JLabel();
        l9.setText("A/C Bus");
        l9.setFont(new Font("Times New Roman",Font.PLAIN,19));
        l9.setForeground(Color.black);
        l9.setFocusable(false);
        l9.setBounds(20,30,100,60);
        p3.add(l9);

        l10=new JLabel();
        l10.setText("20 Seats Left");
        l10.setFont(new Font("Times New Roman",Font.PLAIN,19));
        l10.setForeground(Color.black);
        l10.setFocusable(false);
        l10.setBounds(150,30,200,60);
        p3.add(l10);

        l11=new JLabel();
        l11.setText("20 Window Seats Left");
        l11.setFont(new Font("Times New Roman",Font.PLAIN,19));
        l11.setForeground(Color.black);
        l11.setFocusable(false);
        l11.setBounds(300,30,200,60);
        p3.add(l11);

        l12=new JLabel();
        l12.setText("20:30");
        l12.setFont(new Font("Times New Roman",Font.BOLD,30));
        l12.setForeground(Color.black);
        l12.setFocusable(false);
        l12.setBounds(20,62,200,60);
        p3.add(l12);

        l13=new JLabel();
        l13.setText(", 20 APRIL");
        l13.setFont(new Font("Times New Roman",Font.BOLD,30));
        l13.setForeground(Color.red);
        l13.setFocusable(false);
        l13.setBounds(90,62,200,60);
        p3.add(l13);

        l14=new JLabel();
        l14.setText("1");
        l14.setFont(new Font("Times New Roman",Font.BOLD,30));
        l14.setForeground(Color.black);
        l14.setFocusable(false);
        l14.setBounds(280,62,200,60);
        p3.add(l14);

        l15=new JLabel();
        l15.setText("hrs");
        l15.setFont(new Font("Times New Roman",Font.BOLD,30));
        l15.setForeground(Color.red);
        l15.setFocusable(false);
        l15.setBounds(300,62,200,60);
        p3.add(l15);

        l16=new JLabel();
        l16.setText("20");
        l16.setFont(new Font("Times New Roman",Font.BOLD,30));
        l16.setForeground(Color.black);
        l16.setFocusable(false);
        l16.setBounds(360,62,200,60);
        p3.add(l16);

        l17=new JLabel();
        l17.setText("min");
        l17.setFont(new Font("Times New Roman",Font.BOLD,30));
        l17.setForeground(Color.red);
        l17.setFocusable(false);
        l17.setBounds(405,62,200,60);
        p3.add(l17);

        l18=new JLabel();
        l18.setText("21:50");
        l18.setFont(new Font("Times New Roman",Font.BOLD,30));
        l18.setForeground(Color.black);
        l18.setFocusable(false);
        l18.setBounds(500,62,200,60);
        p3.add(l18);

        l19=new JLabel();
        l19.setText(", 20 APRIL");
        l19.setFont(new Font("Times New Roman",Font.BOLD,30));
        l19.setForeground(Color.red);
        l19.setFocusable(false);
        l19.setBounds(570,62,200,60);
        p3.add(l19);

        l20=new JLabel();
        l20.setText("Starting From");
        l20.setFont(new Font("Times New Roman",Font.BOLD,20));
        l20.setForeground(Color.black);
        l20.setFocusable(false);
        l20.setBounds(765,0,200,60);
        p3.add(l20);

        l21=new JLabel();
        l21.setText("800tk");
        l21.setFont(new Font("Times New Roman",Font.BOLD,20));
        l21.setForeground(Color.black);
        l21.setFocusable(false);
        l21.setBounds(800,30,200,60);
        p3.add(l21);
        
        l22=new JLabel();
        l22.setIcon(steer);
        l22.setBounds(30,32,50,50);
        p4.add(l22);
        
      //Code of Seats
        l23=new JButton();
        l23.setIcon(seat);
        l23.setBounds(80,30,25,50);
        l23.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l23.setBackground(new Color(116,100,139));
        l23.setFocusable(false);
        l23.setBorder(BorderFactory.createEmptyBorder());
        l23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l23.setIcon(seat1);
				String seat_Num="A1";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}

        });
        p4.add(l23);
        
        l24=new JButton();
        l24.setIcon(seat);
        l24.setBounds(110,30,25,50);
        l24.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l24.setBackground(new Color(116,100,139));
        l24.setFocusable(false);
        l24.setBorder(BorderFactory.createEmptyBorder());
        l24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l24.setIcon(seat1);
				String seat_Num="A2";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}        	
        });
        p4.add(l24);
        
        l25=new JButton();
        l25.setIcon(seat);
        l25.setBounds(140,30,25,50);
        l25.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l25.setBackground(new Color(116,100,139));
        l25.setFocusable(false);
        l25.setBorder(BorderFactory.createEmptyBorder());
        l25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l25.setIcon(seat1);
				String seat_Num="A3";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l25);
        
        l26=new JButton();
        l26.setIcon(seat);
        l26.setBounds(170,30,25,50);
        l26.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l26.setBackground(new Color(116,100,139));
        l26.setFocusable(false);
        l26.setBorder(BorderFactory.createEmptyBorder());
        l26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l26.setIcon(seat1);
				String seat_Num="A4";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}        	
        });
        p4.add(l26);
        
        l27=new JButton();
        l27.setIcon(seat);
        l27.setBounds(200,30,25,50);
        l27.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l27.setBackground(new Color(116,100,139));
        l27.setFocusable(false);
        l27.setBorder(BorderFactory.createEmptyBorder());
        l27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l27.setIcon(seat1);
				String seat_Num="A5";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l27);
        
        l28=new JButton();
        l28.setIcon(seat);
        l28.setBounds(230,30,25,50);
        l28.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l28.setBackground(new Color(116,100,139));
        l28.setFocusable(false);
        l28.setBorder(BorderFactory.createEmptyBorder());
        l28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l28.setIcon(seat1);
				String seat_Num="A6";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l28);
        
        l29=new JButton();
        l29.setIcon(seat);
        l29.setBounds(260,30,25,50);
        l29.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l29.setBackground(new Color(116,100,139));
        l29.setFocusable(false);
        l29.setBorder(BorderFactory.createEmptyBorder());
        l29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l29.setIcon(seat1);
				String seat_Num="A7";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l29);
        
        l30=new JButton();
        l30.setIcon(seat);
        l30.setBounds(290,30,25,50);
        l30.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l30.setBackground(new Color(116,100,139));
        l30.setFocusable(false);
        l30.setBorder(BorderFactory.createEmptyBorder());
        l30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l30.setIcon(seat1);
				String seat_Num="A8";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l30);
        
        l31=new JButton();
        l31.setIcon(seat);
        l31.setBounds(320,30,25,50);
        l31.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l31.setBackground(new Color(116,100,139));
        l31.setFocusable(false);
        l31.setBorder(BorderFactory.createEmptyBorder());
        l31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l31.setIcon(seat1);
				String seat_Num="A9";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l31);
        
        l32=new JButton();
        l32.setIcon(seat);
        l32.setBounds(350,30,25,50);
        l32.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l32.setBackground(new Color(116,100,139));
        l32.setFocusable(false);
        l32.setBorder(BorderFactory.createEmptyBorder());
        l32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l32.setIcon(seat1);
				String seat_Num="A10";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l32);
        
        l33=new JButton();
        l33.setIcon(seat);
        l33.setBounds(80,70,25,50);
        l33.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l33.setBackground(new Color(116,100,139));
        l33.setFocusable(false);
        l33.setBorder(BorderFactory.createEmptyBorder());
        l33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l33.setIcon(seat1);
				String seat_Num="A11";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l33);
        
        l34=new JButton();
        l34.setIcon(seat);
        l34.setBounds(110,70,25,50);
        l34.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l34.setBackground(new Color(116,100,139));
        l34.setFocusable(false);
        l34.setBorder(BorderFactory.createEmptyBorder());
        l34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l34.setIcon(seat1);
				String seat_Num="A12";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l34);
        
        l35=new JButton();
        l35.setIcon(seat);
        l35.setBounds(140,70,25,50);
        l35.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l35.setBackground(new Color(116,100,139));
        l35.setFocusable(false);
        l35.setBorder(BorderFactory.createEmptyBorder());
        l35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l35.setIcon(seat1);
				String seat_Num="A13";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l35);
        
        l36=new JButton();
        l36.setIcon(seat);
        l36.setBounds(170,70,25,50);
        l36.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l36.setBackground(new Color(116,100,139));
        l36.setFocusable(false);
        l36.setBorder(BorderFactory.createEmptyBorder());
        l36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l36.setIcon(seat1);
				String seat_Num="A14";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l36);
        
        l37=new JButton();
        l37.setIcon(seat);
        l37.setBounds(200,70,25,50);
        l37.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l37.setBackground(new Color(116,100,139));
        l37.setFocusable(false);
        l37.setBorder(BorderFactory.createEmptyBorder());
        l37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l37.setIcon(seat1);
				String seat_Num="A15";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l37);
        
        l38=new JButton();
        l38.setIcon(seat);
        l38.setBounds(230,70,25,50);
        l38.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l38.setBackground(new Color(116,100,139));
        l38.setFocusable(false);
        l38.setBorder(BorderFactory.createEmptyBorder());
        l38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l38.setIcon(seat1);
				String seat_Num="A16";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l38);
        
        l39=new JButton();
        l39.setIcon(seat);
        l39.setBounds(260,70,25,50);
        l39.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l39.setBackground(new Color(116,100,139));
        l39.setFocusable(false);
        l39.setBorder(BorderFactory.createEmptyBorder());
        l39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l39.setIcon(seat1);
				String seat_Num="A17";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l39);
        
        l40=new JButton();
        l40.setIcon(seat);
        l40.setBounds(290,70,25,50);
        l40.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l40.setBackground(new Color(116,100,139));
        l40.setFocusable(false);
        l40.setBorder(BorderFactory.createEmptyBorder());
        l40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l40.setIcon(seat1);
				String seat_Num="A18";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l40);
        
        l41=new JButton();
        l41.setIcon(seat);
        l41.setBounds(320,70,25,50);
        l41.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l41.setBackground(new Color(116,100,139));
        l41.setFocusable(false);
        l41.setBorder(BorderFactory.createEmptyBorder());
        l41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l41.setIcon(seat1);
				String seat_Num="A19";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l41);
        
        l42=new JButton();
        l42.setIcon(seat);
        l42.setBounds(350,70,25,50);
        l42.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l42.setBackground(new Color(116,100,139));
        l42.setFocusable(false);
        l42.setBorder(BorderFactory.createEmptyBorder());
        l42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l42.setIcon(seat1);
				String seat_Num="A20";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l42);
        
        //Code of seats (2nd)
        l43=new JButton();
        l43.setIcon(seat);
        l43.setBounds(80,150,25,50);
        l43.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l43.setBackground(new Color(116,100,139));
        l43.setFocusable(false);
        l43.setBorder(BorderFactory.createEmptyBorder());
        l43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l43.setIcon(seat1);
				String seat_Num="B1";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l43);
        
        l44=new JButton();
        l44.setIcon(seat);
        l44.setBounds(110,150,25,50);
        l44.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l44.setBackground(new Color(116,100,139));
        l44.setFocusable(false);
        l44.setBorder(BorderFactory.createEmptyBorder());
        l44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l44.setIcon(seat1);
				String seat_Num="B2";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l44);
        
        l45=new JButton();
        l45.setIcon(seat);
        l45.setBounds(140,150,25,50);
        l45.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l45.setBackground(new Color(116,100,139));
        l45.setFocusable(false);
        l45.setBorder(BorderFactory.createEmptyBorder());
        l45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l45.setIcon(seat1);
				String seat_Num="B3";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l45);
        
        l46=new JButton();
        l46.setIcon(seat);
        l46.setBounds(170,150,25,50);
        l46.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l46.setBackground(new Color(116,100,139));
        l46.setFocusable(false);
        l46.setBorder(BorderFactory.createEmptyBorder());
        l46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l46.setIcon(seat1);
				String seat_Num="B4";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l46);
        
        l47=new JButton();
        l47.setIcon(seat);
        l47.setBounds(200,150,25,50);
        l47.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l47.setBackground(new Color(116,100,139));
        l47.setFocusable(false);
        l47.setBorder(BorderFactory.createEmptyBorder());
        l47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l47.setIcon(seat1);
				String seat_Num="B5";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l47);
        
        l48=new JButton();
        l48.setIcon(seat);
        l48.setBounds(230,150,25,50);
        l48.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l48.setBackground(new Color(116,100,139));
        l48.setFocusable(false);
        l48.setBorder(BorderFactory.createEmptyBorder());
        l48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l48.setIcon(seat1);
				String seat_Num="B6";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l48);
        
        l49=new JButton();
        l49.setIcon(seat);
        l49.setBounds(260,150,25,50);
        l49.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l49.setBackground(new Color(116,100,139));
        l49.setFocusable(false);
        l49.setBorder(BorderFactory.createEmptyBorder());
        l49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l49.setIcon(seat1);
				String seat_Num="B7";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l49);
        
        l50=new JButton();
        l50.setIcon(seat);
        l50.setBounds(290,150,25,50);
        l50.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l50.setBackground(new Color(116,100,139));
        l50.setFocusable(false);
        l50.setBorder(BorderFactory.createEmptyBorder());
        l50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l50.setIcon(seat1);
				String seat_Num="B8";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l50);
        
        l51=new JButton();
        l51.setIcon(seat);
        l51.setBounds(320,150,25,50);
        l51.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l51.setBackground(new Color(116,100,139));
        l51.setFocusable(false);
        l51.setBorder(BorderFactory.createEmptyBorder());
        l51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l51.setIcon(seat1);
				String seat_Num="B9";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l51);
        
        l52=new JButton();
        l52.setIcon(seat);
        l52.setBounds(350,150,25,50);
        l52.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l52.setBackground(new Color(116,100,139));
        l52.setFocusable(false);
        l52.setBorder(BorderFactory.createEmptyBorder());
        l52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l52.setIcon(seat1);
				String seat_Num="B10";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l52);
        
        l53=new JButton();
        l53.setIcon(seat);
        l53.setBounds(80,190,25,50);
        l53.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l53.setBackground(new Color(116,100,139));
        l53.setFocusable(false);
        l53.setBorder(BorderFactory.createEmptyBorder());
        l53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l53.setIcon(seat1);
				String seat_Num="B11";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l53);
        
        l54=new JButton();
        l54.setIcon(seat);
        l54.setBounds(110,190,25,50);
        l54.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l54.setBackground(new Color(116,100,139));
        l54.setFocusable(false);
        l54.setBorder(BorderFactory.createEmptyBorder());
        l54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l54.setIcon(seat1);
				String seat_Num="B12";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l54);
        
        l55=new JButton();
        l55.setIcon(seat);
        l55.setBounds(140,190,25,50);
        l55.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l55.setBackground(new Color(116,100,139));
        l55.setFocusable(false);
        l55.setBorder(BorderFactory.createEmptyBorder());
        l55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l55.setIcon(seat1);
				String seat_Num="B13";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l55);
        
        l56=new JButton();
        l56.setIcon(seat);
        l56.setBounds(170,190,25,50);
        l56.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l56.setBackground(new Color(116,100,139));
        l56.setFocusable(false);
        l56.setBorder(BorderFactory.createEmptyBorder());
        l56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l56.setIcon(seat1);
				String seat_Num="B14";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l56);
        
        l57=new JButton();
        l57.setIcon(seat);
        l57.setBounds(200,190,25,50);
        l57.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l57.setBackground(new Color(116,100,139));
        l57.setFocusable(false);
        l57.setBorder(BorderFactory.createEmptyBorder());
        l57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l57.setIcon(seat1);
				String seat_Num="B15";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l57);
        
        l58=new JButton();
        l58.setIcon(seat);
        l58.setBounds(230,190,25,50);
        l58.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l58.setBackground(new Color(116,100,139));
        l58.setFocusable(false);
        l58.setBorder(BorderFactory.createEmptyBorder());
        l58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l58.setIcon(seat1);
				String seat_Num="B16";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l58);
        
        l59=new JButton();
        l59.setIcon(seat);
        l59.setBounds(260,190,25,50);
        l59.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l59.setBackground(new Color(116,100,139));
        l59.setFocusable(false);
        l59.setBorder(BorderFactory.createEmptyBorder());
        l59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l59.setIcon(seat1);
				String seat_Num="B17";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l59);
        
        l60=new JButton();
        l60.setIcon(seat);
        l60.setBounds(290,190,25,50);
        l60.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l60.setBackground(new Color(116,100,139));
        l60.setFocusable(false);
        l60.setBorder(BorderFactory.createEmptyBorder());
        l60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l60.setIcon(seat1);
				String seat_Num="B18";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l60);
        
        l61=new JButton();
        l61.setIcon(seat);
        l61.setBounds(320,190,25,50);
        l61.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l61.setBackground(new Color(116,100,139));
        l61.setFocusable(false);
        l61.setBorder(BorderFactory.createEmptyBorder());
        l61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l61.setIcon(seat1);
				String seat_Num="B19";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l61);
        
        l62=new JButton();
        l62.setIcon(seat);
        l62.setBounds(350,190,25,50);
        l62.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l62.setBackground(new Color(116,100,139));
        l62.setFocusable(false);
        l62.setBorder(BorderFactory.createEmptyBorder());
        l62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l62.setIcon(seat1);
				String seat_Num="B20";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l62);
        
        l63=new JButton();
        l63.setIcon(seat);
        l63.setBounds(350,110,25,50);
        l63.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l63.setBackground(new Color(116,100,139));
        l63.setFocusable(false);
        l63.setBorder(BorderFactory.createEmptyBorder());
        l63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l63.setIcon(seat1);
				String seat_Num="C";
				String fare="800";
					 rows[0] = seat_Num;
					 rows[1] = fare;
					 d.addRow(rows);
					 count++;
			}
        });
        p4.add(l63);
        
        l64=new JLabel();
        l64.setIcon(back);
        l64.setBounds(10, 20, 33, 30);
        l64.addMouseListener(this);
        l64.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(l64);
        
        l65=new JLabel();
        l65.setIcon(shyamoli_bus);
        l65.setBounds(0,200,400,300);
        p2.add(l65);
        //Table
        tb = new JTable();
		d = new DefaultTableModel();
		d.setColumnIdentifiers(coloums);
		tb.setSelectionBackground(Color.LIGHT_GRAY);
		tb.setModel(d);
		tb.setFont(new Font("Times New Roman",Font.BOLD,15));
		tb.setBackground(Color.white);
		tb.setRowHeight(40);
		sc = new JScrollPane(tb);
		sc.setBounds(0,0,385,410);
		p5.add(sc);

        this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l64) {
			this.setVisible(false);
			bus_ticket obj=new bus_ticket();
			obj.show();
		}
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l64) {
			l64.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l64) {
			l64.setIcon(back);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			recharge obj=new recharge();
			obj.show();
		}
	}
	public static void main(String[] args) {
		shyamoli_bus_seat bt=new shyamoli_bus_seat();
        bt.show();
    }
}
