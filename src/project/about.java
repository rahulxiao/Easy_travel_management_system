package  project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class about extends JFrame implements ActionListener,MouseListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JButton b2;

    ImageIcon profile1=new ImageIcon(".\\Images\\abdudu (2).png");
    ImageIcon profile2=new ImageIcon(".\\Images\\r3.png");
    ImageIcon profile3=new ImageIcon(".\\Images\\t1.png");
    ImageIcon profile4=new ImageIcon(".\\Images\\Get.jpg");



    public about() {
        this.setTitle("About");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(163,141,197));
        this.setResizable(false);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        l1=new JLabel();
        l1.setText("Supervised By");
        l1.setFont(new Font("Times new roman",Font.BOLD,30));
        l1.setForeground(Color.WHITE);
        l1.setFocusable(false);
        l1.setBounds(670,290,400,40);
        this.add(l1);

        l3=new JLabel();
        l3.setText("<html>Md. Nazmul Hossain<br>"+"Dept. Of CSE</html>");
        l3.setFont(new Font("Times new roman",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setFocusable(false);
        l3.setBounds(630,330,400,59);
        this.add(l3);

        l2=new JLabel();
        l2.setText("<html>Rahul Biswas<br> " +
                "ID: 22-49413-3<br></html>");
        l2.setFont(new Font("Times new roman",Font.BOLD,30));
        l2.setForeground(Color.WHITE);
        l2.setFocusable(false);
        l2.setBounds(200,700,400,60);
        this.add(l2);

        l4=new JLabel();
        l4.setText("<html>Talha Jubayer<br> " +
                "ID: 22-49413-3<br></html>");
        l4.setFont(new Font("Times new roman",Font.BOLD,30));
        l4.setForeground(Color.WHITE);
        l4.setFocusable(false);
        l4.setBounds(650,700,400,60);
        this.add(l4);

        l5=new JLabel();
        l5.setText("<html>Abdullah Al Meyad<br> " +
                "ID: 22-49401-3<br></html>");
        l5.setFont(new Font("Times new roman",Font.BOLD,30));
        l5.setForeground(Color.WHITE);
        l5.setFocusable(false);
        l5.setBounds(1100,700,400,60);
        this.add(l5);

        l11=new JLabel();
        l11.setIcon(profile1);
        l11.setBounds(1110,400,400,350);
        this.add(l11);

        l11=new JLabel();
        l11.setIcon(profile4);
        l11.setBounds(650,0,400,300);
        this.add(l11);

        l11=new JLabel();
        l11.setIcon(profile3);
        l11.setBounds(645,400,400,350);
        this.add(l11);
        
        l7=new JLabel();
        l7.setIcon(profile2);
        l7.setBounds(195,380,400,400);
        this.add(l7);

        b2=new JButton();
        b2.setText("Back");
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBounds(45,20,150,40);
        b2.setBackground(new Color(142,99,173));
        b2.setBorder(BorderFactory.createLineBorder(new Color(142,99,173)));
        b2.setForeground(Color.WHITE);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.addMouseListener(this);
        b2.addActionListener(this);
        b2.setFocusable(false);
        this.add(b2);

        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[]args) {
        about obj=new about();
        obj.show();
    }
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==b2) {
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

    }
    public void mouseExited(MouseEvent e) {

    }
}


