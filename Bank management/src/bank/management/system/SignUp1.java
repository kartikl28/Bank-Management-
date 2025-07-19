package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUp1 extends JFrame implements ActionListener{

      
    long random;
    JTextField nameTextField,fatherTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton  male, female,unmarried ,married,other;
    JDateChooser datechooser;
    
    
    
    SignUp1(){
        
        setLayout(null);
        
        Random ran = new Random();
         random = Math.abs((ran.nextLong() %9000L)+ 1000L);
        
        
        JLabel formno = new JLabel ("ALLICATION FORM NO : " +random );
        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personaldetails = new JLabel ("Page 1 : Personal Details ");
        personaldetails.setFont(new Font("Raleway",Font.BOLD, 20));
        personaldetails.setBounds(290, 80, 400, 30);
        add(personaldetails);
        
        JLabel name = new JLabel ("Name :" );
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(140, 140, 100, 40);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        nameTextField.setBounds(320, 150, 400, 30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel ("Father's Name :" );
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(140, 200, 200, 40);
        add(fname);
        
        fatherTextField = new JTextField();
        fatherTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        fatherTextField.setBounds(320, 210, 400, 30);
        add(fatherTextField);
        
        JLabel dob= new JLabel ("Date of Birth :" );
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(140, 260, 200, 40);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(320, 270, 200, 30);
        datechooser.setFont(new Font("Raleway",Font.BOLD, 17));
        datechooser.setForeground(Color.BLACK);
        add(datechooser);
        
        male = new JRadioButton("Male");
        male.setBounds(320, 320, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(430, 320, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        


        
        
        
        JLabel gender = new JLabel ("Gender :" );
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(140, 320, 100, 40);
        add(gender);
        
        JLabel email = new JLabel ("Email Address :" );
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(140, 380, 200, 40);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        emailTextField.setBounds(320, 390, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel (" Marital Status :" );
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        marital.setBounds(140, 440, 200, 40);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(320, 450, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(400, 450, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(500, 450, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup  = new ButtonGroup();
        add(married);
        add(unmarried);
        add(other);


        
        JLabel address = new JLabel (" Address :" );
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(140, 500, 100, 40);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        addressTextField.setBounds(320, 510, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel (" City :" );
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(140, 560, 100, 40);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        cityTextField.setBounds(320, 570, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel (" State :" );
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        state.setBounds(140, 620, 100, 40);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        stateTextField.setBounds(320, 630, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel (" Pincode :" );
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(140, 680, 100, 40);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD, 17));
        pinTextField.setBounds(320, 690, 400, 30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBounds(730, 720, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        
        next.setFont(new Font("Raleway",Font.BOLD, 17));
        add(next);
        
        
        
       getContentPane().setBackground(Color.WHITE);
        
  
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionListener ae){
        String formno = "  "+ random ;//long
        String name= nameTextField.getText();
        String fathername=fatherTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
        if (male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
            
        }
        String email =emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital="Married";
            
        }else if(unmarried.isSelected()){
            marital="Unmarried";
            
        }else if(other.isSelected()){
            marital="Other";
          
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode =pinTextField.getText();
        
        try {
            if(name.equals("  ")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                Conn c= new Conn();
                String query = "insert into SignUp1 values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
            }
        
        }catch(Exception e){
        
        System.out.println(e);
        }
    }
    public static void main(String args[]){
        new SignUp1();
    }

}  
    

