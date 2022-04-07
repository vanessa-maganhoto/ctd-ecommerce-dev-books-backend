package com.dh.ctdecommerce.devbooks.model;
import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "categories", fetch = FetchType.LAZY)
    private Set<Products> products = new HashSet<>();

    public Categories() {
    }

    public Categories(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categories(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}