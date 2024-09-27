package com.tka.inventory;

public class Product {
    private int pid;
    private String pnm, pcategory;
    private float pcost;

    public Product() {
        super();
    }

    public Product(int pid, String pnm, String pcategory, float pcost) {
        super();
        this.pid = pid;
        this.pnm = pnm;
        this.pcategory = pcategory;
        this.pcost = pcost;
    }

    // Getters and setters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPnm() {
        return pnm;
    }

    public void setPnm(String pnm) {
        this.pnm = pnm;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public float getPcost() {
        return pcost;
    }

    public void setPcost(float pcost) {
        this.pcost = pcost;
    }

    // Overriding toString() method to display product details
    @Override
    public String toString() {
        return "Product ID: " + pid + ", Name: " + pnm + ", Category: " + pcategory + ", Cost: $" + pcost;
    }
}
