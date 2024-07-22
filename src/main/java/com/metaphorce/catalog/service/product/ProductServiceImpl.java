package com.metaphorce.catalog.service.product;

import com.metaphorce.catalog.repository.product.ProductRepository;
import com.metaphorce.commonslib.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {

        if (productRepository.findAll() != null) {
            return productRepository.findAll();
        }
        return null;
    }

    @Override
    public Product getProductById(Long id) {

        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void saveProduct(Product product) {
        // TODO add validations
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {

        if (getProductById(product.getId()) != null) {
            productRepository.save(product);
        } else {
            System.out.println("Product not found");
        }
    }

    @Override
    public void deleteProductById(Long id) {

        if (getProductById(id) != null) {
            productRepository.deleteById(id);
        } else {
            System.out.println("Product not found");
        }
    }

    @Override
    public Product getProductByName(String name) {

        if (productRepository.findByName(name) != null) {
            return productRepository.findByName(name);
        }
        return null;
    }

}
