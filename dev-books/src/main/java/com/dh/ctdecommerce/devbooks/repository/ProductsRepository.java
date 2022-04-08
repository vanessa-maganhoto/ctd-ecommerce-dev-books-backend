package com.dh.ctdecommerce.devbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dh.ctdecommerce.devbooks.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{



}
