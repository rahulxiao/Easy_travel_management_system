package  project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
public class support extends JFrame implements ActionListener,MouseListener {
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1;
	FileWriter complain;
	ImageIcon logo=new ImageIcon(".\\Images\\logo_Gold.png");
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	ImageIcon back1=new ImageIcon(".\\Images\\back1.png");
	public support() {
		//Frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(163,141,197));
		this.setResizable(false);
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setTitle("Support");
		//Panel
		p1=new JPanel();
		p1.setBounds(160,170,1200,500);
		p1.setBackground(new Color(201,179,235));
		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p1.setLayout(null);
		this.add(p1);
		//Label
		l1=new JLabel();
		l1.setText("Contact Us");
		l1.setBounds(580,10,200,100);
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		l1.setForeground(Color.WHITE);
		this.add(l1);
		
		l2=new JLabel();
		l2.setText("Thank you for you reaching us! We are always happy to hear from you.");
		l2.setBounds(400,50,600,100);
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,17));
		l2.setForeground(Color.WHITE);
		this.add(l2);
		
		l3=new JLabel();
		l3.setIcon(back);
		l3.setBounds(50,20,80,80);
		l3.addMouseListener(this);
		l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(l3);
		
		l4=new JLabel();
		l4.setIcon(logo);
		l4.setBounds(1150,0,300,80);
		this.add(l4);
		
		l5=new JLabel();
		l5.setText("Purpose");
		l5.setBounds(30,5,100,50);
		l5.setFont(new Font("Times new roman",Font.BOLD,17));
		l5.setForeground(Color.BLACK);
		p1.add(l5);
		
		l6=new JLabel();
		l6.setText("Your name:");
		l6.setBounds(30,90,100,50);
		l6.setFont(new Font("Times new roman",Font.BOLD,17));
		l6.setForeground(Color.BLACK);
		p1.add(l6);
		
		l7=new JLabel();
		l7.setText("Your city:");
		l7.setBounds(670,90,100,50);
		l7.setFont(new Font("Times new roman",Font.BOLD,17));
		l7.setForeground(Color.BLACK);
		p1.add(l7);
		
		l8=new JLabel();
		l8.setText("Phone Number:");
		l8.setBounds(30,190,130,50);
		l8.setFont(new Font("Times new roman",Font.BOLD,17));
		l8.setForeground(Color.BLACK);
		p1.add(l8);
		
		l9=new JLabel();
		l9.setText("Email:");
		l9.setBounds(670,190,130,50);
		l9.setFont(new Font("Times new roman",Font.BOLD,17));
		l9.setForeground(Color.BLACK);
		p1.add(l9);
		
		l10=new JLabel();
		l10.setText("Message:");
		l10.setBounds(30,290,130,50);
		l10.setFont(new Font("Times new roman",Font.BOLD,17));
		l10.setForeground(Color.BLACK);
		p1.add(l10);
		
		//Text Field
		t1=new JTextField();
		t1.setBounds(30,50,1140,40);
		t1.setBackground(new Color(239,217,255));
		t1.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t1);
		
		t2=new JTextField();
		t2.setBounds(30,140,500,50);
		t2.setBackground(new Color(239,217,255));
		t2.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t2);
		
		t3=new JTextField();
		t3.setBounds(670,140,500,50);
		t3.setBackground(new Color(239,217,255));
		t3.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t3);
		
		t4=new JTextField();
		t4.setBounds(30,240,500,50);
		t4.setBackground(new Color(239,217,255));
		t4.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t4);
		
		t5=new JTextField();
		t5.setBounds(670,240,500,50);
		t5.setBackground(new Color(239,217,255));
		t5.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t5);
		
		t6=new JTextField();
		t6.setBounds(30,340,1140,100);
		t6.setBackground(new Color(239,217,255));
		t6.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		p1.add(t6);
		
		//Button 
		b1=new JButton();
		b1.setText("Submit");
		b1.setBounds(690,690,100,40);
		b1.setBackground(new Color(239,217,255));
		b1.setFocusable(false);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setBorder(BorderFactory.createLineBorder(new Color(239,217,255)));
		b1.addActionListener(this);
		this.add(b1);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()==b1.getActionCommand() && !t1.getText().isEmpty() && !t2.getText().isEmpty() && !t3.getText().isEmpty() && !t4.getText().isEmpty() && !t5.getText().isEmpty() && !t6.getText().isEmpty()) {
				try {
					complain=new FileWriter(".\\Data\\support.txt",true);
					complain.write("\n##########COMPLAIN##########");
					complain.write("\nPurpose: "+t1.getText());
					complain.write("\nName: "+t2.getText());
					complain.write("\nCity: "+t3.getText());
					complain.write("\nPhone Number: "+t4.getText());
					complain.write("\nEmail: "+t5.getText());
					complain.write("\nMessage: "+t6.getText());
					complain.close();
					this.setVisible(false);
					new support().setVisible(true);
					JOptionPane.showMessageDialog(null,"Submitted Successfully");
				} catch (Exception ae) {
					JOptionPane.showMessageDialog(null,"Please fillup all boxes!");
				}	
		}
		else {
			JOptionPane.showMessageDialog(null,"Please fillup all boxes!");
		}
	}
		
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l3) {
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
		if(e.getSource()==l3) {
			l3.setIcon(back1);
		}
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l3) {
			l3.setIcon(back);
		}
	}
	public static void main(String[]args) {
		support obj=new support();
		obj.show();
	}
}
