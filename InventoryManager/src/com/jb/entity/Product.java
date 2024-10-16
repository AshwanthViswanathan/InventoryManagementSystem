package com.jb.entity;

public class Product {
    private int sku;
    private String productDesc;
    private int warehouseQuantity;
    private int shelfQuantity;
    private double pricePerUnit;
    private double costPerUnit;
    public Product(int sku, String productDesc, int warehouseQuantity, int shelfQuantity, double pricePerUnit, double costPerUnit) {
        this.sku = sku;
        this.productDesc = productDesc;
        this.warehouseQuantity = warehouseQuantity;
        this.shelfQuantity = shelfQuantity;
        this.pricePerUnit = pricePerUnit;
        this.costPerUnit = costPerUnit;

    }
    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getWarehouseQuantity() {
        return warehouseQuantity;
    }

    public void setWarehouseQuantity(int warehouseQuantity) {
        this.warehouseQuantity = warehouseQuantity;
    }

    public int getShelfQuantity() {
        return shelfQuantity;
    }

    public void setShelfQuantity(int shelfQuantity) {
        this.shelfQuantity = shelfQuantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

}
