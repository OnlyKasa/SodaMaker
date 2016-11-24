/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.machine;

/**
 *
 * @author MrYiYi
 */
import ConnectDB.SQLsever.ConnectDB;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
class Login extends JFrame implements ActionListener
 {
  JButton jButtonSubmit;
  JPanel panel;
  JLabel lbUser,lbPass;
  final JTextField  txtUser,txtPass;
   Login()
   {
   lbUser = new JLabel();
   lbUser.setText("Username:");
   txtUser = new JTextField(15);
 
   lbPass = new JLabel();
   lbPass.setText("Password:");
   txtPass = new JPasswordField(15);
  
   jButtonSubmit=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(3,1));
   panel.add(lbUser);
   panel.add(txtUser);
   panel.add(lbPass);
   panel.add(txtPass);
   panel.add(jButtonSubmit);
   add(panel,BorderLayout.CENTER);
   jButtonSubmit.addActionListener(this);
   setTitle("LOGIN");
   }
  public void actionPerformed(ActionEvent evt)
   {    ResultSet rs = null;
        String value1=null ;
        value1=txtUser.getText();
        String value2=null;
        value2=txtPass.getText();
        String Sql="select * from tbAccount where nameAcc='"+value1+"'and passAcc='"+value2+"'" ;
        ConnectDB connect= new ConnectDB();
       if(connect.getConnect()){
       try {
           rs=connect.runSql(Sql);
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }      
       try {
           if(rs.next()){
               Admin page=new Admin();
               this.setVisible(false);
               page.setVisible(true); 
           }
           else{
               System.out.println("enter the valid username and password");
               JOptionPane.showMessageDialog(this,"Incorrect login or password",
                       "Error",JOptionPane.ERROR_MESSAGE);
               this.hide();
               new HomePage().setVisible(true);
           }
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this,"Not Connected Database",
            "Error",JOptionPane.ERROR_MESSAGE);
       }
}
        else {
         JOptionPane.showMessageDialog(this,"Not Connected Database",
        "Error",JOptionPane.ERROR_MESSAGE); 
             }
   }
}
 
 
