package com.dh.ctdecommerce.devbooks.dto;

import com.dh.ctdecommerce.devbooks.model.Categories;

public class CategoriesDto {

    private Long id;
    private String nome;

    
	public CategoriesDto() {
		
	}
	
	public CategoriesDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public CategoriesDto(Categories relacao) {
		this.id = relacao.getId();
		this.nome = relacao.getNome();
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    


}
