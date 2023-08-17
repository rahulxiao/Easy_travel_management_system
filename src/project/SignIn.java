package  project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class SignIn extends JFrame implements MouseListener,ActionListener {
	JLabel l1,l2,l3,l4,l5,l7;
	JTextField t1;
	JPanel p1;
	JButton b2,b3,b4;
	JPasswordField t2;
	JCheckBox c1;
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon bus=new ImageIcon(".\\Images\\bus.png");
	ImageIcon google=new ImageIcon(".\\Images\\google.png");
	public SignIn(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(163,141,197));
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		//Panel
		p1=new JPanel();
		p1.setBounds(940,120,350,500);
		p1.setBackground(new Color(208,189,238));
		p1.setLayout(null);
		this.add(p1);
		//Label
		l1=new JLabel();
		l1.setIcon(back);
		l1.setBounds(50, 30, 33, 33);
		l1.addMouseListener(this);
		this.add(l1);
		
		l2=new JLabel();
		l2.setIcon(bus);
		l2.setBounds(5,10, 1000, 1000);
		this.add(l2);
		
		l3=new JLabel();
		l3.setText("Log In");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setBounds(140, 10, 100, 50);
		l3.setForeground(Color.WHITE);
		p1.add(l3);
		
		l4=new JLabel();
		l4.setText("Username");
		l4.setFont(new Font("Arial",Font.BOLD,18));
		l4.setBounds(45, 100, 120, 50);
		l4.setForeground(Color.WHITE);
		p1.add(l4);
		
		l5=new JLabel();
		l5.setText("Password");
		l5.setFont(new Font("Arial",Font.BOLD,18));
		l5.setBounds(45, 180, 150, 50);
		l5.setForeground(Color.WHITE);
		p1.add(l5);
		
		l7=new JLabel();
		l7.setText("Don't have account?Sign Up");
		l7.setFont(new Font("Arial",Font.BOLD,15));
		l7.setBounds(80,470,220,20);
		l7.setForeground(Color.WHITE);
		l7.addMouseListener(this);
		p1.add(l7);
		
		//Text Field
		t1=new JTextField();
		t1.setBounds(45,140,250,40);
		t1.setBackground(new Color(246,227,255));
		t1.setBorder(BorderFactory.createEmptyBorder());
		t1.setFont(new Font("Arial",Font.BOLD,15));
		p1.add(t1);
		
		t2=new JPasswordField();
		t2.setBounds(45,220,250,40);
		t2.setBackground(new Color(246,227,255));
		t2.setBorder(BorderFactory.createEmptyBorder());
		t2.setFont(new Font("Arial",Font.BOLD,15));
		p1.add(t2);
		
		//Button
		b2=new JButton();
		b2.setText("Confirm");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(45,320,250,40);
		b2.setBackground(new Color(142,99,173));
		b2.setBorder(BorderFactory.createLineBorder(new Color(142,99,173)));
		b2.setForeground(Color.WHITE);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addMouseListener(this);
		b2.addActionListener(this);
		b2.setFocusable(false);
		p1.add(b2);
		
		b3=new JButton();
		b3.setText("Continue with Google");
		b3.setIcon(google);
		b3.setFont(new Font("Arial",Font.PLAIN,15));
		b3.setBounds(45,370,250,40);
		b3.setBackground(new Color(80,61,110));
		b3.setIconTextGap(13);
		b3.setBorder(BorderFactory.createLineBorder(new Color(142,99,173)));
		b3.setForeground(Color.WHITE);
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.addMouseListener(this);
		b3.setFocusable(false);
		p1.add(b3);
		
		//CheckBox
		c1=new JCheckBox();
		c1.setText("Show Password");
		c1.setFont(new Font("Arial",Font.PLAIN,10));
		c1.setBounds(45, 270, 100, 20);
		c1.setBackground(new Color(208,189,238));
		c1.setBorder(BorderFactory.createEmptyBorder());
		c1.setForeground(Color.WHITE);
		c1.setFocusable(false);
		c1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c1.addActionListener(this);
		c1.addMouseListener(this);
		p1.add(c1);
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l7) {
			this.setVisible(false);
			SignUp obj=new SignUp();
			obj.show();
		}
		if(e.getSource()==l1) {
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
		if(e.getSource()==l1) {
			l1.setIcon(back1);
			l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource()==l7) {
			l7.setForeground(Color.BLACK);
			l7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l1) {
			l1.setIcon(back);
		}
		if(e.getSource()==l7) {
			l7.setForeground(Color.WHITE);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(c1.isSelected()) {
			t2.setEchoChar((char)0);
		}
		else {
			t2.setEchoChar('*');
		}
		if(e.getActionCommand()==b2.getActionCommand()) {
			try {
				FileReader fr=new FileReader(".\\Data\\secret.txt");
				BufferedReader br=new BufferedReader(fr);
				String userName=t1.getText().toString();
				String pass=t2.getText().toString();
				String str;
				boolean status=false;
				while((str=br.readLine())!=null) {
					if(str.equals(userName+" "+pass)) {
						this.setVisible(false);
						website obj=new website();
						obj.show();
						status=true;
						break;
					}
				}
				if(status==false) {
					JOptionPane.showMessageDialog(null,"Please use correct username or password");
				}
			} catch (Exception e1) {
			}
		}
	}
	public static void main(String[]args) {
		SignIn obj=new SignIn();
		obj.show();
	}
}

