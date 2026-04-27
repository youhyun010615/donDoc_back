package com.dondoc.service;

import com.dondoc.model.Categories;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService{
    private static Long categoriesIdCounter = 9L;

    @Override
    public List<Categories> getAllCategories() {
        return List.of(
                new Categories(1L, "급여", "💰", "INCOME"),
                new Categories(2L, "용돈", "🎁", "INCOME"),
                new Categories(3L, "부업", "💼", "INCOME"),
                new Categories(4L, "식비", "🍽️", "EXPENSE"),
                new Categories(5L, "교통", "🚗", "EXPENSE"),
                new Categories(6L, "쇼핑", "🛍️", "EXPENSE"),
                new Categories(7L, "의료", "🏥", "EXPENSE"),
                new Categories(8L, "문화", "🎬", "EXPENSE")
        );
    }

    @Override
    public List<Categories> getCategoriesByType(String type) {
        if (type.equals("INCOME")) {
            return List.of(
                    new Categories(1L, "급여", "💰", "INCOME"),
                    new Categories(2L, "용돈", "🎁", "INCOME"),
                    new Categories(3L, "부업", "💼", "INCOME")
            );
        } else if (type.equals("EXPENSE")) {
            return List.of(
                    new Categories(4L, "식비", "🍽️", "EXPENSE"),
                    new Categories(5L, "교통", "🚗", "EXPENSE"),
                    new Categories(6L, "쇼핑", "🛍️", "EXPENSE"),
                    new Categories(7L, "의료", "🏥", "EXPENSE"),
                    new Categories(8L, "문화", "🎬", "EXPENSE")
            );
        }
        throw new IllegalArgumentException("카테고리 타입을 찾을 수 없습니다: " + type);
    }

    @Override
    public Categories getCategoriesById(Long id) {
        if (id == 1L) {
            return new Categories(1L, "급여", "💰", "INCOME");
        } else if (id == 2L) {
            return new Categories(2L, "용돈", "🎁", "INCOME");
        } else if (id == 3L) {
            return new Categories(3L, "부업", "💼", "INCOME");
        } else if (id == 4L) {
            return new Categories(4L, "식비", "🍽️", "EXPENSE");
        } else if (id == 5L) {
            return new Categories(5L, "교통", "🚗", "EXPENSE");
        } else if (id == 6L) {
            return new Categories(6L, "쇼핑", "🛍️", "EXPENSE");
        } else if (id == 7L) {
            return new Categories(7L, "의료", "🏥", "EXPENSE");
        } else if (id == 8L) {
            return new Categories(8L, "문화", "🎬", "EXPENSE");
        }
        throw new IllegalArgumentException("카테고리를 찾을 수 없습니다: " + id);
    }

    @Override
    public Categories createCategories(Categories categories) {
        categories.setId(categoriesIdCounter++);
        return categories;
    }
}
