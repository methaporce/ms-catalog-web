package com.metaphorce.catalog.controller.product;

import com.metaphorce.catalog.service.product.ProductServiceImpl;
import com.metaphorce.commonslib.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/catalog/product")
@Slf4j
@Validated
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;


    @GetMapping("/all")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping("/getByName")
    public Product getProductByName(String name) {
        return productService.getProductByName(name);
    }

    @RequestMapping("/id")
    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }

    @RequestMapping("/delete")
    public void deleteProductById(Long id) {
        productService.deleteProductById(id);
    }

    @RequestMapping("/update")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @PostMapping("/create")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }
}
