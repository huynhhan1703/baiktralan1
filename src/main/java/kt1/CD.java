/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

import javax.print.DocFlavor;

/**
 *
 * @author ADMIN
 */
public class CD {
    private String maso,tenCD,casi;
    private double giaban;
    private int namphatthanh;

    public CD() {
    }

    public CD(String maso, String tenCD, String casi, double giaban, int namphatthanh) {
        this.maso = maso;
        this.tenCD = tenCD;
        this.casi = casi;
        this.giaban = giaban;
        this.namphatthanh = namphatthanh;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamphatthanh() {
        return namphatthanh;
    }

    public void setNamphatthanh(int namphatthanh) {
        this.namphatthanh = namphatthanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maso=" + maso + ", tenCD=" + tenCD + ", casi=" + casi + ", giaban=" + giaban + ", namphatthanh=" + namphatthanh + '}';
    }
            
    
}
