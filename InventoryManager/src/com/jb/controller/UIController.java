package com.jb.controller;

import com.jb.ui.*;
import com.jb.util.*;

import javax.swing.*;
import java.sql.*;


public class UIController {
    public static UIController uiController = new UIController();
    LoginForm loginForm;
    RoleSelectorForm roleSelector;
    WarehouseManagerForm warehouseManagerForm;
    //InventoryAppUIForm invForm;

    public void showLoginForm() {
        loginForm = new LoginForm();
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginForm.setVisible(true);
    }

    public void showRoleSelector() {
        roleSelector = new RoleSelectorForm();
        roleSelector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        roleSelector.setVisible(true);
    }

    public void showWarehouseManagerForm() {
        warehouseManagerForm = new WarehouseManagerForm();
        warehouseManagerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        warehouseManagerForm.setVisible(true);
    }

    public void showStockAssociateForm() {
        StockAssociateForm stockAssociateForm = new StockAssociateForm();
        stockAssociateForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stockAssociateForm.setVisible(true);
    }

    public void showInventoryManagerForm() {
        InventoryManagerForm inventoryManagerForm = new InventoryManagerForm();
        inventoryManagerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryManagerForm.setVisible(true);
    }

    public void showManagerForm() {
        ManagerForm managerForm = new ManagerForm();
        managerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        managerForm.setVisible(true);
    }

    public void showSalesAssociateForm() {
        SalesAssociateForm salesAssociateForm = new SalesAssociateForm();
        salesAssociateForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        salesAssociateForm.setVisible(true);
    }

//    public void showInventoryAppUI() {
//        invFpr, = new InventoryAppUIForm();
//        inventoryAppUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        inventoryAppUI.setVisible(true);
//    }
//    public void showRoleSelector() {
//        CheckOutForm checkOutForm = new CheckOutForm();
//        checkOutForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        checkOutForm.setVisible(true);
//    }

    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConfig.connect();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            uiController.showLoginForm();
        }

    }
}
