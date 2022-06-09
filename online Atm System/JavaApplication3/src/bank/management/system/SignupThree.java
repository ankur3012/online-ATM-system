package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton savingacc,fixeddepositacc,currentacc,recurringdepositacc;
    JCheckBox atmcard,internetbanking,mobilebanking,emailalerts,checquebook,estatement,declaration;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno=formno;
        setLayout(null);
          
        JLabel AccountDetails = new JLabel("Page 3: Account Details");
        AccountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        AccountDetails.setBounds(280, 40, 400, 40);
        add(AccountDetails);
        
        JLabel accounttype = new JLabel("Account Type: ");
        accounttype.setFont(new Font("Raleway", Font.BOLD, 22));
        accounttype.setBounds(100, 120, 200, 30);
        add(accounttype);
        
        savingacc = new JRadioButton("Saving Account");
        savingacc.setFont(new Font("Raleway",Font.BOLD,16));
        savingacc.setBackground(Color.WHITE);
        savingacc.setBounds(100, 160, 150, 20);
        add(savingacc);
        
        fixeddepositacc = new JRadioButton("Fixed Deposit Account");
        fixeddepositacc.setFont(new Font("Raleway",Font.BOLD,16));
        fixeddepositacc.setBackground(Color.WHITE);
        fixeddepositacc.setBounds(350, 160, 250, 20);
        add(fixeddepositacc);
        
        currentacc = new JRadioButton("Current Account");
        currentacc.setFont(new Font("Raleway",Font.BOLD,16));
        currentacc.setBackground(Color.WHITE);
        currentacc.setBounds(100, 200, 180, 20);
        add(currentacc);
       
        recurringdepositacc = new JRadioButton("Recurring Deposit Account");
        recurringdepositacc.setFont(new Font("Raleway",Font.BOLD,16));
        recurringdepositacc.setBackground(Color.WHITE);
        recurringdepositacc.setBounds(350, 200, 250, 20);
        add(recurringdepositacc);
        
        ButtonGroup groupaccount  = new ButtonGroup();
        groupaccount.add(savingacc);
        groupaccount.add(fixeddepositacc);
        groupaccount.add(currentacc);
        groupaccount.add(recurringdepositacc); 

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 250, 200, 30);
        add(card);
       
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 250, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 280, 300, 20);
        add(carddetail);
        
        
        JLabel pin = new JLabel("Pin: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 310, 200, 30);
        add(pin);
        
        JLabel pinnum = new JLabel("XXXX");
        pinnum.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnum.setBounds(330, 310, 300, 30);
        add(pinnum);
        
        JLabel pindetail = new JLabel("Your 4 digit Pin Number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 340, 300, 20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 380, 400, 30);
        add(services);
        
        atmcard =new JCheckBox("ATM CARD");
        atmcard.setBackground(Color.WHITE);
        atmcard.setFont(new Font("Raleway",Font.BOLD,16));
        atmcard.setBounds(100, 420, 200, 30);
        add(atmcard);
        
        internetbanking =new JCheckBox("Internet Banking");
        internetbanking.setBackground(Color.WHITE);
        internetbanking.setFont(new Font("Raleway",Font.BOLD,16));
        internetbanking.setBounds(350, 420, 200, 30);
        add(internetbanking);
        
        mobilebanking =new JCheckBox("Mobile Bnaking");
        mobilebanking.setBackground(Color.WHITE);
        mobilebanking.setFont(new Font("Raleway",Font.BOLD,16));
        mobilebanking.setBounds(100, 470, 200, 30);
        add(mobilebanking);
        
        emailalerts =new JCheckBox("Email & SMS Alerts");
        emailalerts.setBackground(Color.WHITE);
        emailalerts.setFont(new Font("Raleway",Font.BOLD,16));
        emailalerts.setBounds(350, 470, 200, 30);
        add(emailalerts);
        
        checquebook =new JCheckBox("Checque Book");
        checquebook.setBackground(Color.WHITE);
        checquebook.setFont(new Font("Raleway",Font.BOLD,16));
        checquebook.setBounds(100, 520, 200, 30);
        add(checquebook);
        
        estatement =new JCheckBox("E-Statement");
        estatement.setBackground(Color.WHITE);
        estatement.setFont(new Font("Raleway",Font.BOLD,16));
        estatement.setBounds(350, 520, 200, 30);
        add(estatement);
        
        declaration = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Raleway",Font.BOLD,12));
        declaration.setBounds(100, 570, 600, 30);
        add(declaration);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,620,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,620,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==submit){
            String accountType = null;
            if(savingacc.isSelected()){
                accountType = "Saving Account";
            }
            else if(fixeddepositacc.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(currentacc.isSelected()){
                accountType = "Current Account";
            }
            else if(recurringdepositacc.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() %  9000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility ="";
            if(atmcard.isSelected()){
                facility = facility+ "ATM CARD";
            }else if(internetbanking.isSelected()){
                facility = facility + "Internet Banking";
            }else if(mobilebanking.isSelected()){
                facility = facility + "Mobile Banking";
            }else if(emailalerts.isSelected()){
                facility = facility + "Email & SMS Alerts";
            }else if(checquebook.isSelected()){
                facility = facility + "Checque Book";
            }else if(estatement.isSelected()){
                facility = facility + "E-Statement";
            }
            
            try{
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is required");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+
			    accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.execute(query1);
                    conn.s.execute(query2);
                    JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: " +pinnumber);
		    
		    setVisible(false);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
		    new Deposit(pinnumber).setVisible(false);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            }
            
        
        else if(ae.getSource() == cancel)
        {
		setVisible(false);
		new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignupThree(""); 
    }
    
}