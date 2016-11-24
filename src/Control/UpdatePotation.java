/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ConnectDB.SQLsever.ConnectDB;
import GUI.machine.Admin;
import doan.quangnguyen.sodamaker.Potation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MR
 */
public class UpdatePotation {
    public UpdatePotation(){}
    public int runUpdate(String proc, String number,String name,String key ,String price ){
        Potation potation = new Potation();
        ConnectDB con= new ConnectDB();
        int iNumber;
        try{
            iNumber=Integer.parseUnsignedInt(number.trim());
        }
        catch(NumberFormatException e){
            iNumber=1;
        }
             
        String sql="exec "+proc+
                    " '"+name+"'"+","+Integer.parseInt(key)+","+Integer.parseInt(price);
        con.getConnect();
        int i=0;
        for (int j=0 ;j<iNumber;j++){
            try {
                if(con.runUpdate(sql)>0){
                i = i+1; 
                }
               // message.setText(String.valueOf(rs.getWarnings()));
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                i=0;
            } 
        }
     return i;
    }
}
