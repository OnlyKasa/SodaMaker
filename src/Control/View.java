/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ConnectDB.SQLsever.ConnectDB;
import doan.quangnguyen.sodamaker.Money;
import doan.quangnguyen.sodamaker.Potation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MrYiYi
 */
public class View {
    private ConnectDB con ;
    private ArrayList <Money> money ;
    private int someOfMoney ; 
    private int bredMoney ;
    private  ArrayList<Potation> potation;
   public View(){
   con =new ConnectDB();
   money=new ArrayList();
   someOfMoney=0;
   bredMoney=1;
   potation= new ArrayList();
   }
    public ArrayList<Money> getMoney() {
        return money;
    }
    public ResultSet viewPotation() throws SQLException{
    con.getConnect();
    String sql="select * from tbPotation";
    return con.runSql(sql);
    }
    public void setPotation() throws SQLException{
    Potation npotation=new Potation();
    con.getConnect();
    String sql="select * from tbPotation";
    ResultSet rs= con.runSql(sql);
    if(rs.next()){
       npotation.setPotationName(rs.getString("potationName"));
       npotation.setPrice(rs.getInt("price"));
       npotation.setNumber(rs.getInt("number"));
       
    }
        potation.add(npotation);
    }
    public void setMoney(ArrayList<Money> money) {
        this.money = money;
    }

    public int getSomeOfMoney() {
        return someOfMoney;
    }

    public void setSomeOfMoney(int someOfMoney) {
        this.someOfMoney = someOfMoney;
    }

    public int getBredMoney() {
        return bredMoney;
    }

    public void setBredMoney(int bredMoney) {
        this.bredMoney = bredMoney;
    }

    public ArrayList<Potation> getPotation() {
        return potation;
    }

    public void setPotation(ArrayList<Potation> potation) {
        this.potation = potation;
    }
   
     
}
