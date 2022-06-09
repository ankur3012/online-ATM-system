package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {

    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,occupation,education,qualification;
    String formno;
    
    SignUpTwo(String formno) {
        this.formno=formno;
	
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel relegion = new JLabel("Relegion: ");
        relegion.setFont(new Font("Raleway", Font.BOLD, 20));
        relegion.setBounds(100, 140, 100, 30);
        add(relegion);
        
        String valReligion[]= {"Hindu", "Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        relegion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel Category = new JLabel("Category: ");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);
      
        String valcategory[]= {"General", "OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);

        String incomecategory[]= {"NULL", "<1,50,000","2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educational = new JLabel("Educational: ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        
        String educationvalues[]= {"Non-Graduation", "Graduation","Post-Graduation","Doctrate","Others"};
        education = new JComboBox(educationvalues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        String occupationvalues[]= {"Salaried", "Self-Employee","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        pan.setBackground(Color.WHITE);
        add(pan);
        
        JLabel pan = new JLabel("Pan Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        pan.setBackground(Color.WHITE);
        add(pan);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        JLabel citizen = new JLabel("Senior Citizen: ");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizen  = new ButtonGroup();
        seniorcitizen.add(syes);
        seniorcitizen.add(sno);

        JLabel existingaccount = new JLabel("Existing Account: ");
        existingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingaccount.setBounds(100, 590, 200, 30);
        add(existingaccount);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup  = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
         
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
       String sreligion = (String) religion.getSelectedItem();
       String scategory = (String) category.getSelectedItem();
       String sincome = (String) income.getSelectedItem();
       String seducation = (String) education.getSelectedItem();
       String soccupation = (String) occupation.getSelectedItem();
       
       String seniorcitizen = null;
        if(syes.isSelected()){ 
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){ 
            seniorcitizen = "No";
        }
            
        String existingaccount = null;
        if(eyes.isSelected())
        { 
            existingaccount = "Yes";
        }
        else if(eno.isSelected())
        { 
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
 
        try{
            String query = "insert into Signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+
                    sincome+"','"+seducation+"','"+soccupation+"','"+span
                    +"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     dispose();
                new SignupThree(formno).setVisible(true);
            }
        catch(Exception e)
        {
             System.out.println(e);
        }
        
    }
     public static void main(String[] args)
        {
        new SignUpTwo("");
    }
}