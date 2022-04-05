package com.dh.ctdecommerce.devbooks.dto;

import com.dh.ctdecommerce.devbooks.model.Categories;

public class CategoriesDto {

    private String nome;
    private Categories categories;

    public CategoriesDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
