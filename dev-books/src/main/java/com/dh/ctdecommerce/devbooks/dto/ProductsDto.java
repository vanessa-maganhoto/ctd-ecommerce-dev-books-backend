package com.dh.ctdecommerce.devbooks.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.dh.ctdecommerce.devbooks.model.Categories;
import com.dh.ctdecommerce.devbooks.model.Products;

public class ProductsDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Long id ; 

    private String title;
    private String description;
    private Double price;
    private String image;
    
	private List<CategoriesDto> categories = new ArrayList<>();




    public ProductsDto(Long id, String title, String description, Double price, String image) {
    	this.id = id ; 
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public ProductsDto() {
	}
    
	public ProductsDto(Products relacao) {
		this.id = relacao.getId();
		this.title = relacao.getTitle();
		this.description = relacao.getDescription();
		this.price = relacao.getPrice();
		this.image = relacao.getImage();
	}

	public ProductsDto(Products relacao, Set<Categories> categories) {
		this(relacao);
		categories.forEach(cat -> this.categories.add(new CategoriesDto(cat)));
	}
    
    

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CategoriesDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoriesDto> categories) {
		this.categories = categories;
	}
    
    
}
