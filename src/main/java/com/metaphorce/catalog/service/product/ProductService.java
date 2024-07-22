package com.metaphorce.catalog.service.product;

import com.metaphorce.commonslib.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProductById(Long id);
    Product getProductByName(String name);

}
