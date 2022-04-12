package com.dhbrasil.checkpointIntegrador.devbooksProd.dto;

import com.dhbrasil.checkpointIntegrador.devbooksProd.model.Category;

import javax.validation.constraints.NotBlank;

public class CategoryDto {

    private Long id;
    @NotBlank
    private String nome;

    public CategoryDto(){}

    public CategoryDto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Category toEntity(){
        return new Category(this.id, this.nome);
    }

    public CategoryDto(Category category){
        this.id = category.getId();
        this.nome = category.getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
