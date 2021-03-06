package com.example.Catalog.repositiry;

import com.example.Catalog.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

    @Query("select c from categories c")
    //public List<Categories> findAll();
//non-static method getAllCategories() cannot be referenced from a static context ругается здесь    
    List<Categories> getAllCategories() ;

}
