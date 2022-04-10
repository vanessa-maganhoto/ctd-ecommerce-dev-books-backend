package com.dhbrasil.devbooks.checkpointIntegrador.devbooks.service;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.dto.ProductsDto;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Products;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.management.AttributeNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Autowired
    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<ProductsDto> todosProdutos() {
        return productsRepository.findAll().stream()
                .map(p -> new ProductsDto(p))
                .collect(Collectors.toList());
    }

    public ProductsDto buscaPorIdProdutos(Long id) throws AttributeNotFoundException {

        return productsRepository.findById(id)
                .map(p -> new ProductsDto(p))
                .orElseThrow(() -> new AttributeNotFoundException("Produto não encontrado" + id));
    }

    public ProductsDto cadastrar(ProductsDto produtoDto) {
        Products produto = productsRepository.save(produtoDto.toEntity());
        return new ProductsDto(produto);
    }

    public ProductsDto atualizar(ProductsDto dto) {
        Products produtoAtual = productsRepository.findById(dto.getId())
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND));

        produtoAtual.setId(dto.getId());
        produtoAtual.setTitle(dto.getTitle());
        produtoAtual.setDescription(dto.getDescription());
        produtoAtual.setPrice(dto.getPrice());
        produtoAtual.setImage(dto.getImage());

        Products produtoAtualizado = productsRepository.save(produtoAtual);
        return new ProductsDto(produtoAtualizado);
    }

    public void excluir(Long id) {
        try {
            productsRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResponseStatusException(NOT_FOUND, "Produto não encontrado: " + id);
        }
    }

    public List<ProductsDto> buscarLivrosPorCategoria(Long idCategory) {

        return productsRepository.findByCategoryId(idCategory)
                .stream()
                .map(p -> new ProductsDto(p))
                .collect(Collectors.toList());
    }
}
