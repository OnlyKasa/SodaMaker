/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produce.SodaMoney;

import doan.quangnguyen.sodamaker.Coin;
import doan.quangnguyen.sodamaker.PaperMoney;
import java.awt.Color;

/**
 *
 * @author MrYiYi
 */
public class ProdureMoney {
    public PaperMoney Paper1000 =new PaperMoney() ;
    public PaperMoney Paper2000 =new PaperMoney();
    public PaperMoney Paper5000 =new PaperMoney();
    public PaperMoney Paper10000 =new PaperMoney();
    public PaperMoney Paper20000 =new PaperMoney();
    public PaperMoney Paper50000 =new PaperMoney();
    public Coin coin1000 =new Coin();
    public Coin coin2000 =new Coin();
    public Coin coin5000 =new Coin();
    public ProdureMoney(){
    }

    public PaperMoney getPaper1000() {
        return Paper1000;
    }

    public PaperMoney getPaper2000() {
        return Paper2000;
    }

    public PaperMoney getPaper5000() {
        return Paper5000;
    }

    public PaperMoney getPaper10000() {
        return Paper10000;
    }

    public PaperMoney getPaper20000() {
        return Paper20000;
    }

    public PaperMoney getPaper50000() {
        return Paper50000;
    }

    public Coin getCoin1000() {
        return coin1000;
    }

    public Coin getCoin2000() {
        return coin2000;
    }

    public Coin getCoin5000() {
        return coin5000;
    }
    public void setPaper1000(){
        Paper1000.setfReceptions(134);
        Paper1000.setfWidth(64);
        Paper1000.setImage("t1000.png");
        Paper1000.setDenominations(1000);
        Paper1000.setMaterial("Cotton");
    }
    public void setPaper2000(){
        Paper2000.setfReceptions(134);
        Paper2000.setfWidth(65);
        Paper2000.setImage("t2000.png");
        Paper2000.setDenominations(2000);
        Paper2000.setMaterial("Cotton");
    }
     public void setPaper5000(){
        Paper5000.setfReceptions(150);
        Paper5000.setfWidth(65);
        Paper5000.setImage("t5000.png");
        Paper5000.setDenominations(5000);
        Paper5000.setMaterial("Cotton");
    }
    public void setPaper10000(){
        Paper10000.setfReceptions(132);
        Paper10000.setfWidth(60);
        Paper10000.setImage("t10000.png");
        Paper10000.setDenominations(10000);
        Paper10000.setMaterial("Polymer");
    }
    public void setPaper20000(){
        Paper20000.setfReceptions(136);
        Paper20000.setfWidth(65);
        Paper20000.setImage("t20000.png");
        Paper20000.setDenominations(20000);
        Paper20000.setMaterial("Polymer");
    }
    public void setPaper50000(){
        Paper50000.setfReceptions(140);
        Paper50000.setfWidth(65);
        Paper50000.setImage("t5000.png");
        Paper50000.setDenominations(50000);
        Paper50000.setMaterial("Polymer");
    }
    public void setCoin1000(){
        coin1000.setfDiameter(19.0);
        coin1000.setfWeightCoin(3.8);
        coin1000.setColorCoin(Color.yellow);
        coin1000.setDenominations(1000); //menh gia
        coin1000.setMaterial("Thep ma dong thau");
    }
     public void setCoin2000(){
        coin2000.setfDiameter(23.5);
        coin2000.setfWeightCoin(5.1);
        coin2000.setColorCoin(Color.yellow);
        coin2000.setDenominations(2000); //menh gia
        coin2000.setMaterial("Thep ma dong thau");
    }
      public void setCoin5000(){
        coin5000.setfDiameter(25.5);
        coin5000.setfWeightCoin(7.7);
        coin5000.setColorCoin(Color.yellow);
        coin5000.setDenominations(5000); //menh gia
        coin5000.setMaterial("Hop Kim");
    }
}
