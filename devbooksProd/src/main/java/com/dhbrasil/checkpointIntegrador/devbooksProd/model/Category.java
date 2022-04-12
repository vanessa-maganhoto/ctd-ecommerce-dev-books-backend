package com.dhbrasil.checkpointIntegrador.devbooksProd.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String image;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Products> products = new HashSet<>();

    public Category(){}

    public Category(Long id, String nome, String image) {
        this.id = id;
        this.nome = nome;
        this.image = image;
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

    public Set<Products> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", image='" + image + '\'' +
                ", products=" + products +
                '}';
    }
}
