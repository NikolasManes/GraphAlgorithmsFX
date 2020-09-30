package com.nikolas;

public class GNode {
    public static int autoIndex = 0;
    // Has only one attribute an ID
    private int mID;
    private double mCordX;
    private double mCordY;
    // Basic constructor the ID must be set at declaration
    public GNode(double cordX, double cordY) {
        this.mID = autoIndex++;
        this.mCordX = cordX;
        this.mCordY = cordY;
    }
    // Getter for the ID
    public int getId() {
        return mID;
    }

    public double getCordX() {
        return mCordX;
    }

    public double getCordY() {
        return mCordY;
    }

    public boolean nodeSelect(double clickX, double clickY){
        return Math.pow((this.mCordY-clickY), 2) + Math.pow((this.mCordX-clickX), 2) < 900;
    }
}
