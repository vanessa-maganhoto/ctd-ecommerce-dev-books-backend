package com.dh.ctdecommerce.devbooks.controller;

import java.net.URI;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dh.ctdecommerce.devbooks.dto.ProductsDto;
import com.dh.ctdecommerce.devbooks.service.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductsController {
/*	
	@Autowired
	private ProductService produto;
	
	@GetMapping
	public ResponseEntity<Page<ProductsDto>> findAll(
			@RequestParam(value = "categoryId", defaultValue = "0") Long categoryId,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "name", defaultValue = "") String nome,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage);
		
		Page<ProductsDto> list = produto.todosProdutos(categoryId, nome.trim(), pageRequest);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductsDto> findById( @PathVariable Long id) throws AttributeNotFoundException{
		ProductsDto obj = produto.buscaPorIdProdutos(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	@PostMapping
	public ResponseEntity<ProductsDto> insert( @RequestBody ProductsDto dto){
		dto = produto.cadastrar(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProductsDto> update(@PathVariable Long id,  @RequestBody ProductsDto dto) throws Exception{
		ProductsDto obj = produto.atualizar(id, dto);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception{
		produto.excluir(id);
		return ResponseEntity.noContent().build();
	}*/

}
