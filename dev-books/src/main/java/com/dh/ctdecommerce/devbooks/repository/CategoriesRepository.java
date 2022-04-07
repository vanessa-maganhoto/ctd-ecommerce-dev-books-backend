package com.dh.ctdecommerce.devbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dh.ctdecommerce.devbooks.model.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {


}
