package com.perfulandia.Invetory.service;

import com.perfulandia.Invetory.entities.Product;

public interface ProductService {

    Product getProduct(String id);
    void addProduct(Product product);
    void deleteProduct(String id);
    Product updateProduct(Product product);
}
