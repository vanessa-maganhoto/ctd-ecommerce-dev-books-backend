package com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

    Category findByNome (String nome);
}
