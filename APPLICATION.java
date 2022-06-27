
package swing;

import javax.swing.*;
import java.awt.event.*;

public class APPLICATION
{
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        JButton b=new JButton(" PLEASE ORDER");
        JLabel l=new JLabel("MENU CARD : ORDER PLAESE");
        //JLabel l1=new JLabel();
    
        JCheckBox rb1=new JCheckBox("PIZZA");
        JCheckBox rb2=new JCheckBox("BURGER");
        JCheckBox rb3=new JCheckBox("TEA");
        JCheckBox rb4=new JCheckBox("COFFE");
        
        
        rb1.setBounds(150,120,100,60);
        rb2.setBounds(150,180,100,60);
        rb3.setBounds(150,240,100,60);
        rb4.setBounds(150,300,100,60);
        b.setBounds(150,400,130,60);
        l.setBounds(150,60,180,60);
        //l1.setBounds(150,500,260,60);
        
       // ButtonGroup bg=new ButtonGroup();
        //bg.add(rb1);bg.add(rb2);   bg.add(rb3);bg.add(rb4);
        
        f.add(rb1);f.add(rb2);f.add(rb3);f.add(rb4);f.add(b);f.add(l);
        
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                float amount=0;
                String msg=" ";
                
                if(rb1.isSelected())
                {
                    amount=100;
                    msg="YOU CHOOSE : PIZZA : ";
                }
                if(rb2.isSelected())
                {
                    amount=80;
                    msg="YOU CHOOSE : BURGER : "; 
                    
                }
                if(rb3.isSelected())
                {
                    amount=20;
                    msg="YOU CHOOSE : TEA : ";
                    
                }
                
                if(rb4.isSelected())
                {
                    amount=40;
                    msg="YOU CHOOSE : COFFEE : "; 
                    
                }
                if(rb1.isSelected() && rb2.isSelected())
                {
                    amount=100+80;
                    msg="YOU CHOOSE : PIZZA AND BURGER : ";
                    
                }
                if(rb1.isSelected() && rb3.isSelected())
                {
                    amount=100+20;
                    msg="YOU CHOOSE : PIZZA AND TEA  : ";  
                    
                }
                
                if(rb1.isSelected() && rb4.isSelected())
                {
                    amount=100+40;
                    msg="YOU CHOOSE : PIZZA AND COFFEE : "; 
                    
                }
                
                if(rb2.isSelected() && rb3.isSelected())
                {
                   amount=80+20;
                    msg="YOU CHOOSE : BURGER AND TEA : ";
                    
                }
                
                if(rb2.isSelected() && rb4.isSelected())
                {
                    amount=80+40;
                    msg="YOU CHOOSE : BURGER AND COFFEE : ";
                    
                }
                
                if(rb3.isSelected() && rb4.isSelected())
                {
                   amount=20+40;
                    msg="YOU CHOOSE : TEA AND COFFEE : ";
                }
                
                if(rb1.isSelected()&& rb2.isSelected() && rb3.isSelected() && rb4.isSelected())
                {
                    amount=100+40+80+20;
                    msg="YOU CHOOSE : ALL ITEM : ";
     
                }
                
                JOptionPane.showMessageDialog(f,msg+"AMOUNT IS : "+amount);
              
                
            }
            
        });
    
        f.setSize(550,800);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    
}
