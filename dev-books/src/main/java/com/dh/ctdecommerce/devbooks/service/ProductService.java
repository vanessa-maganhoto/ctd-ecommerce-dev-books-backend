package com.dh.ctdecommerce.devbooks.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
/*	@Autowired
	private ProductsRepository produto ; 
	
	@Autowired
	private CategoriesRepository categoria ; 
	
	
	public Page<ProductsDto> todosProdutos(Long categoryId, String nome, PageRequest pageRequest){
		List<Categories> categories = categoryId == 0 ? null : Arrays.asList(categoria.getById(categoryId));
		Page<Products> list = produto.find(categories, nome, pageRequest);
		return list.map(x -> new ProductsDto(x));
	}
	
	public ProductsDto buscaPorIdProdutos(Long id) throws AttributeNotFoundException{
		Optional<Products> obj = produto.findById(id);
		Products relacao = obj.orElseThrow(() -> new AttributeNotFoundException("Produto não encontrado" + id));
		return new ProductsDto(relacao, relacao.getCategories());
	}
	
	public ProductsDto cadastrar(ProductsDto dto) {
		Products relacao = new Products();
		relacao = produto.save(relacao);
		return new ProductsDto(relacao, relacao.getCategories());
	}
	
	public ProductsDto atualizar(Long id, ProductsDto dto) throws Exception {
		try {
			Products entity = produto.getById(id);
			entity = produto.save(entity);
			return new ProductsDto(entity, entity.getCategories());
		}catch(EntityNotFoundException e) {
			throw new Exception("Id not found");
		}
	
	}
	
	public void excluir(Long id) throws Exception {
		try {
			produto.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new Exception("Id not found " + id);
		}
}*/
}
