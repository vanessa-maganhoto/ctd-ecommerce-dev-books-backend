package com.dhbrasil.checkpointIntegrador.devbooksProd.repository;

import com.dhbrasil.checkpointIntegrador.devbooksProd.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByCategoryId(Long id);
}
