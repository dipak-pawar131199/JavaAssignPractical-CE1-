import javax.swing.*;
import javax.swing.event.*;
import fileCheck.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*

<APPLET CODE="fileValidateDemo.class" WIDTH=500 HEIGHT="500">
</APPLET>

*/

public class fileValidateDemo extends JApplet implements ActionListener
{
   JButton b1;
   Label l1;
   JPanel p;
   checkFileType cft;
   public void init()
   {
     p=new JPanel();
     p.setLayout(new BorderLayout());
     l1=new Label();
     
     p.add(l1,BorderLayout.NORTH);
     b1=new JButton("Accept");
     p.add(b1,BorderLayout.SOUTH);
     b1.addActionListener(this);
     add(p);
   }
   public void actionPerformed(ActionEvent e)
   {
     
      
         String action =b1.getActionCommand();
         if(action.equals("Accept"))
         {
            String fname=JOptionPane.showInputDialog("Enter file name");
            cft=new checkFileType(fname);
            l1.setText(cft.validateFile());
            showStatus(cft.validateFile());
            JOptionPane.showMessageDialog(null,cft.validateFile());
         }
               
    
     
   }
}   
