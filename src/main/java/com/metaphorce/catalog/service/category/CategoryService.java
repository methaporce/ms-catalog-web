package com.metaphorce.catalog.service.category;

import com.metaphorce.commonslib.entities.Category;

public interface CategoryService {

    void saveCategory(Category category);

    Category getCategoryById(Long id);

    void deleteCategoryById(Long id);

    Iterable<Category> getAllCategories();

    void updateCategory(Category category);

    Category getCategoryByName(String name);

}
