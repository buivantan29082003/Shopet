/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Chitiet {

    private int mag;
    private int phantram;

    public Chitiet(int mag, int phantram) {
        this.mag = mag;
        this.phantram = phantram;
    }

    public int getMag() {
        return mag;
    }

    /**
     * @param mag the mag to set
     */
    public void setMag(int mag) {
        this.mag = mag;
    }

    /**
     * @return the phantram
     */
    public int getPhantram() {
        return phantram;
    }

    /**
     * @param phantram the phantram to set
     */
    public void setPhantram(int phantram) {
        this.phantram = phantram;
    }

}
