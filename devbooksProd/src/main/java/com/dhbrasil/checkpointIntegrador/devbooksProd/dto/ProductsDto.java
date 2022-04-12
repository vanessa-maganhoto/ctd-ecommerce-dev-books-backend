package com.dhbrasil.checkpointIntegrador.devbooksProd.dto;

import com.dhbrasil.checkpointIntegrador.devbooksProd.model.Products;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductsDto {


    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotNull
    private Double price;
    @NotBlank
    private String image;
    @NotBlank
    private String author;
    @NotBlank
    private String publishingCompany;

    @NotNull
    @Valid
    private CategoryDto category;

    public ProductsDto(){}

    public ProductsDto(Products products){
        this.id = products.getId();
        this.title = products.getTitle();
        this.description = products.getDescription();
        this.price = products.getPrice();
        this.image = products.getImage();
        this.author = products.getAuthor();
        this.publishingCompany = products.getPublishingCompany();
        this.category = new CategoryDto(products.getCategory());
    }

    public Products toEntity(){
        return new Products(
                this.title,
                this.description,
                this.price,
                this.image,
                this.author,
                this.publishingCompany,
                this.category == null ? null : this.category.toEntity());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
