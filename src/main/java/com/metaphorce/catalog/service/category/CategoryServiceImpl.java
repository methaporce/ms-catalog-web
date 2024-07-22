package com.metaphorce.catalog.service.category;

import com.metaphorce.catalog.repository.category.CategoryRepository;
import com.metaphorce.commonslib.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void saveCategory(Category category) {
         categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {

        if (categoryRepository.findById(id).isPresent()) {
            return categoryRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

        if (getCategoryById(id) != null) {
            categoryRepository.deleteById(id);
        } else {
            System.out.println("Category not found");
        }
    }

    @Override
    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll() != null ? categoryRepository.findAll() : null;
    }

    @Override
    public void updateCategory(Category category) {

        if (getCategoryById(category.getId()) != null) {
            categoryRepository.save(category);
        } else {
            System.out.println("Category not found");
        }

    }

    @Override
    public Category getCategoryByName(String name) {

        if (categoryRepository.findByName(name) != null) {
            return categoryRepository.findByName(name);
        }

        return null;
    }
}
