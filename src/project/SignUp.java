package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
public class SignUp extends JFrame implements ActionListener,MouseListener {
    JPanel p1;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField pa1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JRadioButton r1,r2;
    JButton b1;
	FileWriter data;
	FileWriter idPass;
    ButtonGroup choice=new ButtonGroup();
    ImageIcon vehicle=new ImageIcon(".\\Images\\vehicle.png");
    ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	ImageIcon sign=new ImageIcon(".\\Images\\signup.gif");
    public SignUp(){
        //frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(163,141,197));
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);

        //panel
        p1=new JPanel();
        p1.setBounds(0,0,700,1920);
        p1.setBackground(new Color(201,179,235));
        p1.setLayout(null);
        this.add(p1);

        //account
        l1=new JLabel();
        l1.setText("Create An Account");
        l1.setForeground(Color.white);
        l1.setBounds(180,60,500,40);
        l1.setLayout(null);
        l1.setFont(new Font("Elephant",Font.ITALIC,35));
        p1.add(l1);

        //first name
        l2=new JLabel();
        l2.setForeground(Color.white);
        l2.setText("First Name");
        l2.setBounds(90,130,200,30);
        l2.setLayout(null);
        l2.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l2);

        //last name
        l3=new JLabel();
        l3.setText("Last Name");
        l3.setForeground(Color.white);
        l3.setBounds(360,130,200,30);
        l3.setLayout(null);
        l3.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l3);

        //1stnameBox
        t1=new JTextField();
        t1.setBounds(90,155,200,35);
        t1.setFont(new Font("Times new roman",Font.PLAIN,17));
        t1.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        t1.setBackground(new Color(239,217,255));
        p1.add(t1);

        //laseNameBox
        t2=new JTextField();
        t2.setBounds(360,155,200,35);
        t2.setFont(new Font("Times new roman",Font.PLAIN,17));
        t2.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        t2.setBackground(new Color(239,217,255));
        p1.add(t2);

        //mail
        l4=new JLabel();
        l4.setText("Email/Phone Number");
        l4.setForeground(Color.white);
        l4.setBounds(120,200,200,30);
        l4.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l4);

        //mailBox
        t3 =new JTextField();
        t3.setBounds(120,230,380,40);
        t3.setFont(new Font("Times new roman",Font.PLAIN,17));
        t3.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        t3.setBackground(new Color(239,217,255));
        p1.add(t3);

        //password
        l5=new JLabel();
        l5.setText("Password");
        l5.setForeground(Color.white);
        l5.setBounds(120,270,200,40);
        l5.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l5);

        //passBox
        pa1=new JPasswordField();
        pa1.setBounds(120,305,380,40);
        pa1.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        pa1.setBackground(new Color(239,217,255));
        p1.add(pa1);

        //username
        l6=new JLabel();
        l6.setText("Username");
        l6.setForeground(Color.white);
        l6.setBounds(120,340,200,40);
        l6.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l6);

        //usernameBox
        t4 =new JTextField();
        t4.setBounds(120,375,380,40);
        t4.setFont(new Font("Times new roman",Font.PLAIN,17));
        t4.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        t4.setBackground(new Color(239,217,255));
        p1.add(t4);

        //student
        l7=new JLabel();
        l7.setText("Are you a student?");
        l7.setForeground(Color.white);
        l7.setBounds(120,420,200,40);
        l7.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l7);

        //roundBox1
        r1=new JRadioButton("Yes");
        r1.setBounds(120,450,60,30);
        r1.setBackground(new Color(201,179,235));
        r1.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        r1.setFocusable(false);
        p1.add(r1);
        choice.add(r1);
        r1.addActionListener(this);
        r1.addMouseListener(this);
        //roundBox2
        r2=new JRadioButton("NO");
        r2.setBounds(190,450,60,30);
        r2.setBackground(new Color(201,179,235));
        r2.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        r2.setFocusable(false);
        choice.add(r2);
        p1.add(r2);
        r2.addActionListener(this);
        r2.addMouseListener(this);

        //nid
        l8=new JLabel();
        l8.setForeground(Color.white);
        l8.setBounds(120,470,200,40);
        l8.setFont(new Font("Times New Roman",Font.PLAIN,21));
        p1.add(l8);

        //nidBox
        t5 =new JTextField();
        t5.setBounds(120,500,380,40);
        t5.setFont(new Font("Times new roman",Font.PLAIN,21));
        t5.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
        t5.setBackground(new Color(239,217,255));
        p1.add(t5);

        //confirm
        b1=new JButton("Confirm");
        b1.setBounds(200,555,200,35);
        b1.setBackground(new Color(142,99,173));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Times new roman",Font.BOLD,21));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFocusable(false);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(b1);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()==b1.getActionCommand() && !t1.getText().isEmpty() && !t2.getText().isEmpty() && !t3.getText().isEmpty() && !t4.getText().isEmpty() && !t5.getText().isEmpty() && (r1.isSelected() || r2.isSelected())) { 
		    	    
			       	 try {
			       		 	data=new FileWriter(".\\Data\\info.txt",true);
			       		 	idPass=new FileWriter(".\\Data\\secret.txt",true);
			       			data.write("------------------");
			    			data.write("\nFirst Name: "+t1.getText());
			    			data.write("\nLast Name: "+t2.getText());
			    			data.write("\nEmail: "+t3.getText());
			    			data.write("\nID: "+t5.getText());
			    			data.write("\n------------------");
			    			data.close();
			    			idPass.write(t4.getText()+" "+pa1.getText());
			    			idPass.write("\n");
			    			idPass.close();
			    			setVisible(false);
			    			new SignUp().setVisible(true);
			    			JOptionPane.showMessageDialog(null,"Account Created Successfully" );
			    		} catch (IOException a) {
			    		
			    		}
			    	}
			    	else {
			    		JOptionPane.showMessageDialog(null, "Please enter your data correctly");
			    	}
			}
        });
        //have an account
        l9=new JLabel();
        l9.setText("Already have an account?Log-In");
        l9.setFont(new Font("Times New Roman",Font.PLAIN,17));
        l9.setForeground(Color.WHITE);
        l9.setBounds(203,590,230,40);
        l9.addMouseListener(this);
        p1.add(l9);
        
        //pic
        l10=new JLabel();
        l10.setIcon(vehicle);
        l10.setBounds(600,235,800,500);
        this.add(l10);
        
        l11=new JLabel();
        l11.setIcon(back);
        l11.setBounds(20, 20, 33, 30);
        l11.addMouseListener(this);
        p1.add(l11);
        
        l12=new JLabel();
        l12.setText("Easy Travel");
        l12.setBounds(900,-100,350,300);
        l12.setFont(new Font("Forte",Font.PLAIN,60));
        l12.setForeground(Color.WHITE);
        this.add(l12);
        
        l13=new JLabel();
        l13.setText("Your hassle free solution for all travel needs");
        l13.setBounds(890,-40,400,300);
        l13.setFont(new Font("Arial",Font.PLAIN,17));
        l13.setForeground(new Color(90,230,229));
        this.add(l13);

        l14=new JLabel();
        l14.setIcon(sign);
        l14.setBounds(800,100,700,800);
        this.add(l14);
        
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==r1) {
    		l8.setText("Birth Certificate ID");
    	}
    	if(e.getSource()==r2) {
    		l8.setText("NID number");
    	}
    }
 
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l9) {
			this.setVisible(false);
			SignIn obj=new SignIn();
			obj.show();
		}
		if(e.getSource()==l11) {
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
		if(e.getSource()==l11) {
			l11.setIcon(back1);
			l11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource()==l9) {
			l9.setForeground(Color.BLACK);
			l9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource()==r1) {
			r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		if(e.getSource()==r2) {
			r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l9) {
			l9.setForeground(Color.WHITE);
		}
		if(e.getSource()==l11) {
			l11.setIcon(back);
		}
	}
    public static void main(String[]args) {
        SignUp obj=new SignUp();
        obj.show();
    }
}
