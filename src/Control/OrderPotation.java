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
import doan.quangnguyen.sodamaker.Potation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MrYiYi
 */
public class OrderPotation {
  
    private  ArrayList<Money> moneyInput=new ArrayList<Money>();
    private  int sumMoneyInput ;
    private Money money;
    private  ArrayList<Potation> potationOrder =new ArrayList<Potation>() ;
    private  int sumMoneyOrder ;
    private  ArrayList<Money> moneyOutput =new ArrayList<Money>();
    private  int sumMoneyOutput;
    public OrderPotation(){}
    public Money getMoney(int index){
        return moneyInput.get(index);
    }
    public Money getMoney1(int index){
        return moneyOutput.get(index);
    }
    public ArrayList getMoneyInput() {
        return moneyInput;
    }
    public  ArrayList getMoneyOutput() {
        return moneyOutput;
    }
    //begin check number money on sever
     public boolean selectMoney(PaperMoney money) throws SQLException{
       ConnectDB con = new ConnectDB();
       con.getConnect();
       String sql ="select numberMoney from tbMoney where denomination="+money.getDenominations()+"and bredMoney=1";
       ResultSet rs= con.runSql(sql);
       if(rs.next())
           return rs.getInt("numberMoney")>0;
           else
           return false;
    }public boolean selectMoney(Coin money) throws SQLException{
       ConnectDB con = new ConnectDB();
       con.getConnect();
       String sql ="select numberMoney from tbMoney where denomination="+money.getDenominations()+"and bredMoney=0" ;
       ResultSet rs= con.runSql(sql);
       if(rs.next())
           return rs.getInt("numberMoney")>0;
           else
           return false;
    }
    //end check number money on sever
    public void setMoneyOutput() throws SQLException {
        ProdureMoney money=new ProdureMoney();
        money.setCoin1000();
        money.setCoin2000();
        money.setCoin5000();
        money.setPaper1000();
        money.setPaper2000();
        money.setPaper5000();
        money.setPaper10000();
        money.setPaper20000();
        money.setPaper50000();
      while ( sumMoneyOutput>=50000 && selectMoney(money.getPaper50000())){
          sumMoneyOutput-=50000;
          moneyOutput.add(money.getPaper50000());
      }
      while ( sumMoneyOutput>=20000 && selectMoney(money.getPaper20000())){
          sumMoneyOutput-=20000;
          moneyOutput.add(money.getPaper20000());
          //break;
      }
      while ( sumMoneyOutput>=10000 && selectMoney(money.getPaper10000())){
          sumMoneyOutput-=10000;
          moneyOutput.add(money.getPaper10000());
          //break;
      }
      while ( sumMoneyOutput>=5000 && (selectMoney(money.getPaper5000())||selectMoney(money.getCoin5000()))){
          sumMoneyOutput-=5000;
          if(selectMoney(money.getPaper5000())){
             moneyOutput.add(money.getPaper5000());
          }else 
             moneyOutput.add(money.getCoin5000());
         // break;
      }
      while ( sumMoneyOutput>=2000 && (selectMoney(money.getPaper2000())||selectMoney(money.getCoin2000()))){
          sumMoneyOutput-=2000;
          if(selectMoney(money.getPaper2000())){
             moneyOutput.add(money.getPaper2000());
          }else
             moneyOutput.add(money.getCoin2000()); 
         // break;
      }
      while ( sumMoneyOutput>=1000 && (selectMoney(money.getPaper1000())||selectMoney(money.getCoin1000()))){
          sumMoneyOutput-=1000;
          if(selectMoney(money.getPaper1000())){
              moneyOutput.add(money.getPaper1000());
          }else
              moneyOutput.add(money.getCoin1000());
         // break;
      }
      if(sumMoneyOutput!=0){
          moneyOutput.clear();
      }
    }
    public void setMoneyOutput(ArrayList<Money> money){
        this.moneyOutput=money;
    }
    public void setMoneyInput(Money money) {
       this.moneyInput.add(money);
    }

    public int getSumMoneyInput() {
        return sumMoneyInput;
    }

    public void setSumMoneyInput() {
        if (!this.moneyInput.isEmpty()){     
         
              sumMoneyInput+=moneyInput.get(moneyInput.size()-1).getDenominations();
            }
    }

    public  ArrayList getPotationOrder() {
        return potationOrder;
    }
    public Potation getPotationOrder(int index) {
                return potationOrder.get(index);
    }
    public boolean checkPotation(int key) throws SQLException{
        ConnectDB con = new ConnectDB();
       if(con.getConnect()){
        String sql="Select * from tbPotation where potationKey="+key+"and number >0";
        ResultSet rs = con.runSql(sql);
        return rs.next();
       }else return false;
    }
    public Potation orderPotation(int key) throws SQLException{
        Potation potation=new Potation();
        ConnectDB con = new ConnectDB();
        con.getConnect();
        String sql="Select * from tbPotation where potationKey="+key+"and number >0";
        ResultSet rs = con.runSql(sql);
        if(rs.next()){
            potation.setPotationName(rs.getString("potationName"));
            potation.setPrice(Integer.parseInt(rs.getString("price")));
            potation.setPotationKey(key);
        }
        
        return potation ;
    }
    public  void setPotationOrder(Potation potation) {
       this.potationOrder.add(potation);
    }
    
    public int getSumMoneyOrder() {
        return sumMoneyOrder;
    }

    public  void setSumMoneyOrder() {
        if(!this.potationOrder.isEmpty()){
                sumMoneyOrder+=potationOrder.get(potationOrder.size()-1).getPrice();
            } 
    }
    public void setSumMoneyOrder(ArrayList<Potation> potation){
    sumMoneyOrder=0;
    if(!this.potationOrder.isEmpty()){
        for (int i =0 ; i <potationOrder.size();i++)
        sumMoneyOrder+=potationOrder.get(i).getPrice();
    }
    }
    public int getSumMoneyOutput() {
        return sumMoneyOutput;
    }

    public void setSumMoneyOutput() {
        sumMoneyOutput= sumMoneyInput - sumMoneyOrder;
    }

    public void setSumMoneyOutput(int sumMoneyOutput) {
        this.sumMoneyOutput = sumMoneyOutput;
    }
    public void resetOrder(){
        sumMoneyInput=0;
        sumMoneyOrder=0;
        sumMoneyOutput=0;
        moneyInput.removeAll(moneyInput);
        moneyOutput.removeAll(moneyOutput);
        potationOrder.removeAll(potationOrder);
    }
}
