package com.dondoc.service;

import com.dondoc.model.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> getAllCategories();
    List<Categories> getCategoriesByType(String type);
    Categories getCategoriesById(Long id);
    Categories createCategories(Categories categories);
}
