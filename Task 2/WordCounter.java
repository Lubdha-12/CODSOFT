package codsoft;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

class WordCounter
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("Word Counter");
        JLabel l1,l2,l3,l4;
        JTextArea text=new JTextArea("");
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        JButton submit,clear;
        submit=new JButton("SUBMIT");
        clear=new JButton("CLEAR");
        
        l1=new JLabel("Enter Your Text Here:");
        l2=new JLabel("Count Of Total Words:");
        l3=new JLabel("Count For Characters With Spaces:");
        l4=new JLabel("Count For Characters Without Spaces:");
        
        Font txtFont=new Font(Font.DIALOG,Font.PLAIN,18 );
        l1.setFont(txtFont);
        l2.setFont(txtFont);
        l3.setFont(txtFont);
        l4.setFont(txtFont);
        
        l1.setBounds(10,25,200,30);
        text.setBounds(18,60,450,300);
        l2.setBounds(10,370,400,30);
        l3.setBounds(10,400,400,30);
        l4.setBounds(10,430,400,30);
        
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLUE);
        
        submit.setBounds(100,470,100,50);
        clear.setBounds(275,470,100,50);
        
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        
        clear.setBackground(Color.RED);
        clear.setForeground(Color.WHITE);
        
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        submit.addActionListener (new ActionListener()
            {
                 public void actionPerformed(ActionEvent e)
                 {
                    String str=text.getText().trim();
                    
                     if(str.isEmpty())
                     {
                        JOptionPane.showMessageDialog(f,"Please Enter Some Text","Error",JOptionPane.ERROR_MESSAGE); 
                     }
                     else
                     {
                     int count=0,i,word=0;
                     for(i=0;i<str.length();i++)
                     {
                         if(str.charAt(i)!=' ')
                         {
                             count++;
                         }
                         else
                         {
                             word++;
                         }
                     }
                     l2.setText("Count Of Total Words: " + (word+1));
                     l3.setText("Count For Characters With Spaces: " + str.length());
                     l4.setText("Count For Characters Without Spaces: " + count);
                }
              }
            }
        );
        
       clear.addActionListener(new ActionListener()
          {
               public void actionPerformed(ActionEvent e)
               {
                   text.setText("");
                   l2.setText("Count For Characters With Spaces:");
                   l3.setText("Count For Characters Without Spaces:");
                   l4.setText("Count Of Total Words:");
               }
          }
       );
       
       f.add(l1);
       f.add(text);
       f.add(l2);
       f.add(l3);
       f.add(l4);
       f.add(submit);
       f.add(clear);
       f.setSize(500,570);
       f.setResizable(false);
       f.setLayout(null);
       f.setLocationRelativeTo(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
