package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Login extends JFrame implements ActionListener{
    
    JButton Login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        
        setTitle("Automatic Teller Machine");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100,100);
        add(label);
        
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward",Font.BOLD, 38));
        add(text);
        
         JLabel cardno = new JLabel("Card NO :");
        cardno.setBounds(120, 150, 400, 40);
        cardno.setFont(new Font("Raleway",Font.BOLD, 38));
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(340, 160, 230, 30);
        cardTextField.setFont(new Font ("Arial", Font.BOLD, 16));
        add(cardTextField);
        
         JLabel pin = new JLabel("PIN :");
        pin.setBounds(210, 220, 400, 40);
        pin.setFont(new Font("Raleway",Font.BOLD, 38));
        add(pin);
        
        pinTextField = new JPasswordField ();
        pinTextField.setBounds(340, 230, 230, 30);
        pinTextField.setFont(new Font ("Arial", Font.BOLD, 16));
        add(pinTextField);
        
        Login = new JButton("SIGN IN");
        Login.setBounds(340, 300, 100, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(470, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGNUP");
        signup.setBounds(340, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if (ae.getSource()== Login){
            
        }else if (ae.getSource()== signup){
           setVisible(false);
           new SignUp1().setVisible(true);
        }
        
        
    }
    public static void main(String aggs[]) {
        new Login();
        
    }
    
}
