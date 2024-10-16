package com.jb.service;

import com.jb.entity.*;

import java.util.ArrayList;

public interface InventoryServiceInterface {

    public int CHECK_IN = 0;
    public int CHECK_OUT = 1;
    public ArrayList<Product> getAllProducts();
    public Product getProduct(int id);
    public boolean addProduct(Product product);
    public boolean updateWarehouseQuantity(int sku, int quantity, int type);
    public boolean updateShelfQuantity(int sku, int quantity, int type);
    public boolean updateProduct(Product product);
    public boolean updateProduct(ArrayList<Product> products);
    public boolean productEqualsDB(Product product);
}