package com.dh.ctdecommerce.devbooks.service;

import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.dh.ctdecommerce.devbooks.dto.CategoriesDto;
import com.dh.ctdecommerce.devbooks.model.Categories;
import com.dh.ctdecommerce.devbooks.repository.CategoriesRepository;


@Service
public class CategoryService {
	@Autowired
	private CategoriesRepository repository;
	
	
	public Page<CategoriesDto> buscarTudo(PageRequest pageRequest){
		Page<Categories> list = repository.findAll(pageRequest);
		return list.map(x -> new CategoriesDto(x));
	}
	
	public CategoriesDto buscarPorId(Long id) throws AttributeNotFoundException{
		Optional<Categories> obj = repository.findById(id);
		Categories relacao = obj.orElseThrow(() -> new AttributeNotFoundException("Entity not found " + id));
		return new CategoriesDto(relacao);
	}
	
	public CategoriesDto inserir(CategoriesDto dto) {
		Categories relacao = new Categories();
		relacao.setNome(dto.getNome());
		relacao = repository.save(relacao);
		return new CategoriesDto(relacao);
	}

	public CategoriesDto atualizar(Long id, CategoriesDto dto) throws Exception {
		try {
			Categories relacao = repository.getById(id);
			relacao.setNome(dto.getNome());
			relacao = repository.save(relacao);
			return new CategoriesDto(relacao);
		}catch(EntityNotFoundException e) {
			throw new Exception("Id not found");
		}
	
	}

	public void excluir(Long id) throws Exception {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new Exception("Id not found " + id);
		}
		
	}
	
}

