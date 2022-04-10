package com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByCategoryId(Long i);
}
