package com.jb.service;

import com.jb.entity.Product;
import com.jb.util.DatabaseConfig;

import java.util.*;

import java.sql.*;

public class InventoryDBService implements InventoryServiceInterface {
    public static Connection connection;

    static {
        try {
            connection = DatabaseConfig.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM inventory");
            ArrayList<Product> products = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("sku"),
                        resultSet.getString("productdesc"),
                        resultSet.getInt("qtywh"),
                        resultSet.getInt("qtyshelf"),
                        resultSet.getDouble("priceperpnit"),
                        resultSet.getDouble("costperunit"));
                products.add(product);
            }
            return products;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Product getProduct(int sku) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM inventory WHERE sku = " + sku);
            if (resultSet.next()) {
                return new Product(resultSet.getInt("sku"),
                        resultSet.getString("productdesc"),
                        resultSet.getInt("qtywh"),
                        resultSet.getInt("qtyshelf"),
                        resultSet.getDouble("priceperunit"),
                        resultSet.getDouble("costperunit"));
            } else {
                System.out.println("Product not found");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addProduct(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO inventory VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, product.getSku());
            preparedStatement.setString(2, product.getProductDesc());
            preparedStatement.setInt(3, product.getWarehouseQuantity());
            preparedStatement.setInt(4, product.getShelfQuantity());
            preparedStatement.setDouble(5, product.getPricePerUnit());
            preparedStatement.setDouble(6, product.getCostPerUnit());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateWarehouseQuantity(int sku, int quantity, int type) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE inventory SET qtywh = qtywh + ? WHERE sku = ?");
            preparedStatement.setInt(1, quantity);
            preparedStatement.setInt(2, sku);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateShelfQuantity(int sku, int quantity, int type) {
        try {
            if (type == CHECK_OUT) {
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE inventory SET qtyshelf = qtyshelf - 1 WHERE sku = ?");
                preparedStatement.setInt(1, sku);
                preparedStatement.executeUpdate();
                return true;
            } else if (type == CHECK_IN) {
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE inventory SET qtyshelf = qtyshelf + 2 WHERE sku = ?");
                preparedStatement.setInt(1, sku);
                preparedStatement.executeUpdate();
                return true;
            } else {
                System.out.println("Invalid type");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE inventory SET productdesc = ?, qtywh = ?, qtyshelf = ?, priceperunit = ?, costperunit = ? WHERE sku = ?");
            preparedStatement.setString(1, product.getProductDesc());
            preparedStatement.setInt(2, product.getWarehouseQuantity());
            preparedStatement.setInt(3, product.getShelfQuantity());
            preparedStatement.setDouble(4, product.getPricePerUnit());
            preparedStatement.setDouble(5, product.getCostPerUnit());
            preparedStatement.setInt(6, product.getSku());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateProduct(ArrayList<Product> products) {
        try {
            for (Product product : products) {
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE inventory SET productdesc = ?, qtywh = ?, qtyshelf = ?, priceperunit = ?, costperunit = ? WHERE sku = ?");
                preparedStatement.setString(1, product.getProductDesc());
                preparedStatement.setInt(2, product.getWarehouseQuantity());
                preparedStatement.setInt(3, product.getShelfQuantity());
                preparedStatement.setDouble(4, product.getPricePerUnit());
                preparedStatement.setDouble(5, product.getCostPerUnit());
                preparedStatement.setInt(6, product.getSku());
                preparedStatement.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean productEqualsDB(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM inventory WHERE sku = ?");
            preparedStatement.setInt(1, product.getSku());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return product.getProductDesc().equals(resultSet.getString("productdesc")) &&
                        product.getWarehouseQuantity() == resultSet.getInt("qtywh") &&
                        product.getShelfQuantity() == resultSet.getInt("qtyshelf") &&
                        product.getPricePerUnit() == resultSet.getDouble("priceperunit") &&
                        product.getCostPerUnit() == resultSet.getDouble("costperunit");
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
