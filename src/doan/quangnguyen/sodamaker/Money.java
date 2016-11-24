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
public class Money {
    private int denominations;  //menh gia
    private String material ;     // chat lieu
    private int numberMoney; //so luong 
    public Money(){}                    // thiet lap ko tham so 
    public Money(int denominations, String material){   // thiet lap co tham so
        this.denominations=denominations ;
        this.material = material;
    }
    public int add(Money M1 , Money M2){ 
        return(M1.denominations+ M2.denominations);
    }
    public int sub(Money M1 , Money M2){
        return(M1.denominations-M2.denominations);
    }
 /** begin seter and geter
     * @return  */
    public int getDenominations() {
        return denominations;
    }

    public void setDenominations(int denominations) {
        this.denominations = denominations;
    }

    public void setMaterial(String material){
        this.material = material;
    }
    
 /*end seter and geter*/

    public String getMaterial() {
        return material;
    }
}
