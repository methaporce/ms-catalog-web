package com.metaphorce.catalog.controller.category;

import com.metaphorce.catalog.service.category.CategoryServiceImpl;
import com.metaphorce.commonslib.entities.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/catalog/category")
@Slf4j
@Validated
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;


    @RequestMapping("/all")
    public Iterable<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @RequestMapping("/getByName")
    public Category getCategoryByName(String name) {
        return categoryService.getCategoryByName(name);
    }

    @RequestMapping("/id")
    public Category getCategoryById(Long id) {
        return categoryService.getCategoryById(id);
    }

    @RequestMapping("/delete")
    public void deleteCategoryById(Long id) {
        categoryService.deleteCategoryById(id);
    }

    @RequestMapping("/update")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping("/create")
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    }

}
