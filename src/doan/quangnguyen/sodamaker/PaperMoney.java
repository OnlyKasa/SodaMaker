/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.quangnguyen.sodamaker;


import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author MrYiYi
 */
public class PaperMoney extends Money{
    private double fReceptions;
    private double fWidth;
    public Image image;
    private String material;

    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getfReceptions() {
        return fReceptions;
    }
    public void setfReceptions(double fReceptions) {
        this.fReceptions = fReceptions;
    }
    public double getfWidth() {
        return fWidth;
    }
    public void setfWidth(double fWidth) {
        this.fWidth = fWidth;
    }

   public void setImage(String path) {
       image = new ImageIcon(path).getImage();
    }
   public Image getImage(){
   return image;
   }
}
