package com.dhbrasil.checkpointIntegrador.devbooksProd.dto;

import com.dhbrasil.checkpointIntegrador.devbooksProd.model.Category;

import javax.validation.constraints.NotBlank;

public class CategoryDto {

    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String image;

    public CategoryDto(){}

    public CategoryDto(Long id, String nome, String image) {
        this.id = id;
        this.nome = nome;
        this.image = image;
    }

    public Category toEntity(){
        return new Category(this.id, this.nome, this.image);
    }

    public CategoryDto(Category category){
        this.id = category.getId();
        this.nome = category.getNome();
        this.image = category.getImage();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
