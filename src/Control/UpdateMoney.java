/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ConnectDB.SQLsever.ConnectDB;
import Produce.SodaMoney.ProdureMoney;
import doan.quangnguyen.sodamaker.Coin;
import doan.quangnguyen.sodamaker.Money;
import doan.quangnguyen.sodamaker.PaperMoney;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MrYiYi
 */
public class UpdateMoney {
    public UpdateMoney(){
    }
    public int runUpdateMoney(String proc,PaperMoney money,String number){
        ConnectDB con = new ConnectDB();
        int iNumber;
        try{
        iNumber=Integer.parseUnsignedInt(number.trim());
        }
        catch(NumberFormatException e){
        iNumber=1;
        }
        String sql = "exec "+proc+" @bredMoney=1"+",@denomination="+
                money.getDenominations()+",@widthMoney="+money.getfWidth()+",@imageMoney="+"'"+money.getImage()+"'"
             + ",@material="+"'"+money.getMaterial()+"'"+",@receptions="+money.getfReceptions();
        con.getConnect();
        int i=0;
            for (int j=0 ;j<iNumber;j++){
                try {
                    if(con.runUpdate(sql)>0){
                    i = i+1; 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateMoney.class.getName()).log(Level.SEVERE, null, ex);
                    i=0;
                }
            }
            return i;
    }

     public int runUpdateMoney(String proc,Coin money,String number){
        ConnectDB con= new ConnectDB();
        int iNumber;
        try{
            iNumber=Integer.parseUnsignedInt(number.trim());
        }
            catch(NumberFormatException e){
                iNumber=1;
            }
        String sql= "exec "+proc+" @bredMoney=0"+",@denomination="+money.getDenominations()+",@diameter="+money.getfDiameter()+
                ",@weightCoin="+money.getfWeightCoin()+",@colorCoin="+"'"+String.valueOf(money.getColorCoin())+"'"+
                ",@material="+"'"+money.getMaterial()+"'";
        con.getConnect();
        int i=0;
            for (int j=0 ;j<iNumber;j++){
                try {
                    if (con.runUpdate(sql)>0){
                        i=i+1;
                    }
                }   catch (SQLException ex) {
                        Logger.getLogger(UpdateMoney.class.getName()).log(Level.SEVERE, null, ex);
                        i=0;
                    }
            }
        return i ;
     }
     public int runUpdateMoney(String proc,Money money,String number,int bredMoney){
        ConnectDB con= new ConnectDB();
        int iNumber;
        try{
            iNumber=Integer.parseUnsignedInt(number.trim());
        }
            catch(NumberFormatException e){
                iNumber=1;
            }
        String sql= "exec "+proc+" @bredMoney="+bredMoney+",@denomination="+money.getDenominations();
        con.getConnect();
        int i=0;
            for (int j=0 ;j<iNumber;j++){
                try {
                    if (con.runUpdate(sql)>0){
                        i=i+1;
                    }
                }   catch (SQLException ex) {
                        Logger.getLogger(UpdateMoney.class.getName()).log(Level.SEVERE, null, ex);
                        i=0;
                    }
            }
        return i ;
     }

}
