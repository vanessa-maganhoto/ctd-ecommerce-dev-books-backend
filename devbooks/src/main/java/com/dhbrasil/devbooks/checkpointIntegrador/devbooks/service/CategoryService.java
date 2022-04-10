package com.dhbrasil.devbooks.checkpointIntegrador.devbooks.service;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.dto.CategoryDto;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Category;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.management.AttributeNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Page<CategoryDto> buscarTudo(PageRequest pageRequest) {
        Page<Category> list = categoryRepository.findAll(pageRequest);
        return list.map(x -> new CategoryDto(x));
    }

    public CategoryDto buscarPorId(Long id) throws AttributeNotFoundException {
        return categoryRepository.findById(id)
                .map(c -> new CategoryDto(c))
                .orElseThrow(() -> new AttributeNotFoundException("Entity not found " + id));
    }

    public CategoryDto inserir(CategoryDto dto) {
        Category category = categoryRepository.save(dto.toEntity());
        return new CategoryDto(category);
    }

    public CategoryDto atualizar(CategoryDto dto) {
        Category categoriaAtual = categoryRepository.findById(dto.getId())
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND));

        categoriaAtual.setNome(dto.getNome());

        Category categoriaAtualizada = categoryRepository.save(categoriaAtual);
        return new CategoryDto(categoriaAtualizada);
    }

    public void excluir(Long id) {
        try {
            categoryRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(NOT_FOUND, "Categoria nâo encontrada: "+id);
        }
    }



}
