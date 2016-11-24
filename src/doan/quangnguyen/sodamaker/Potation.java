/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.quangnguyen.sodamaker;

/**
 *
 * @author MrYiYi
 */
public class Potation{
    private String potationName;   // ten do uong 
    private int potationKey;        // ma do uong 
    private int price ;             // gia do uong
    private int number;             // so luong do uong
    public Potation(){}
    public Potation(String potationName , int potationKey , int price , int number){
        this.potationName= potationName ;
        this.potationKey=potationKey ;
        this.price=price;
        this.number=number;
    }
/** begin seter and geter
     * @return  */
    public String getPotationName() {
        return potationName;
    }

    public void setPotationName(String potationName) {
        this.potationName = potationName;
    }

    public int getPotationKey() {
        return potationKey;
    }

    public void setPotationKey(int potationKey) {
        this.potationKey = potationKey;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number =number;
    }
  /*end seter and geter*/   
}
