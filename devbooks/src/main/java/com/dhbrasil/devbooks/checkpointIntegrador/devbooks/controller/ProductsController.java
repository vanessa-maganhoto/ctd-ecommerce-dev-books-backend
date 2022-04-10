package com.dhbrasil.devbooks.checkpointIntegrador.devbooks.controller;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.dto.ProductsDto;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public ResponseEntity<List<ProductsDto>> findAll(
            @RequestParam(value = "categoryId", defaultValue = "0") Long categoryId,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "name", defaultValue = "") String nome,
            @RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage);

        List<ProductsDto> list = productsService.todosProdutos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductsDto> findById(@PathVariable Long id) throws AttributeNotFoundException {
        ProductsDto produtoDto = productsService.buscaPorIdProdutos(id);
        return ResponseEntity.ok().body(produtoDto);
    }

    @PostMapping
    public ProductsDto insert(@RequestBody ProductsDto dto){
        return  productsService.cadastrar(dto);
    }

    @PutMapping(value = "/{id}")  // OK
    public ResponseEntity<ProductsDto> update(@PathVariable Long id, @RequestBody ProductsDto dto) throws Exception{
        dto.setId(id);
        ProductsDto obj = productsService.atualizar(dto);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}") // OK
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception{
        productsService.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/search")
    public List<ProductsDto> buscarCategoriaPorNome (@RequestParam Long idCategory){
        return productsService.buscarLivrosPorCategoria(idCategory);
    }
}
