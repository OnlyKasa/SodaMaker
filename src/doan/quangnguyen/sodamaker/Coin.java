/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.quangnguyen.sodamaker;

import java.awt.Color;

/**
 *
 * @author MrYiYi
 */
public class Coin extends Money{
    private double fDiameter;
    private double fWeightCoin;
    private Color colorCoin;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public Coin(){};
    public Coin(double diameter ,double weightCoin, Color colorCoin){
        this.colorCoin=colorCoin;
        this.fDiameter=diameter ;
        this.fWeightCoin=weightCoin;
    }

    public double getfDiameter() {
        return fDiameter;
    }

    public void setfDiameter(double fDiameter) {
        this.fDiameter = fDiameter;
    }

    public double getfWeightCoin() {
        return fWeightCoin;
    }

    public void setfWeightCoin(double fWeightCoin) {
        this.fWeightCoin = fWeightCoin;
    }

    public Color getColorCoin() {
        return colorCoin;
    }

    public void setColorCoin(Color colorCoin) {
        this.colorCoin = colorCoin;
    }
    
}
