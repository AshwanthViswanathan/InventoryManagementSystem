package com.jb.service;

import com.jb.entity.Product;

import java.util.ArrayList;

public interface ManagerInterface {
    public boolean tableToDB(ArrayList<Product> products);
}
