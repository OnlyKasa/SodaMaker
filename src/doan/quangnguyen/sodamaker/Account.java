/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.quangnguyen.sodamaker;

/**
 *
 * @author MrYiYi
 **/
public class Account {
    private String nameAcc;
    private String passAcc;
    public Account(){}
    public Account(String nameAcc , String passAcc){
        this.nameAcc= nameAcc ;
        this.passAcc=passAcc;
    }

    public String getNameAcc() {
        return nameAcc;
    }

    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
    }

    public String getPassAcc() {
        return passAcc;
    }

    public void setPassAcc(String passAcc) {
        this.passAcc = passAcc;
    }
    
}
