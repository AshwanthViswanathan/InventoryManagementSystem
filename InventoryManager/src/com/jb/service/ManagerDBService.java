package com.jb.service;

import com.jb.entity.Product;
import com.jb.util.DatabaseConfig;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ManagerDBService implements ManagerInterface {
    public static Connection connection;
    public static InventoryDBService inventoryDBService = new InventoryDBService();

    static {
        try {
            connection = DatabaseConfig.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean tableToDB(ArrayList<Product> products) {
        try {
            for(Product product : products){
                if(inventoryDBService.getProduct(product.getSku()) == null){
                    inventoryDBService.addProduct(product);
                } else {
                    inventoryDBService.updateProduct(product);
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public ArrayList<Product> getAllProducts() {
        return inventoryDBService.getAllProducts();
    }

    
}