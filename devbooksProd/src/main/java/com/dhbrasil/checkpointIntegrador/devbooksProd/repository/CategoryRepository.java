package com.dhbrasil.checkpointIntegrador.devbooksProd.repository;

import com.dhbrasil.checkpointIntegrador.devbooksProd.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

