package com.dhbrasil.devbooks.checkpointIntegrador.devbooks;

import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Category;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.model.Products;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository.CategoryRepository;
import com.dhbrasil.devbooks.checkpointIntegrador.devbooks.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevbooksApplication implements CommandLineRunner {
	@Autowired private ProductsRepository productsRepository;
	@Autowired private CategoryRepository categoryRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(DevbooksApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {


		Category c1 = categoryRepository.save(new Category(null,"Metodologias Ágeis"));
		Category c2 = categoryRepository.save(new Category(null,"Design"));
		Category c3 = categoryRepository.save(new Category(null,"Lógica de Programação"));//
		Category c4 = categoryRepository.save(new Category(null,"Padrões de Projeto"));
		Category c5 = categoryRepository.save(new Category(null,"Arquitetura de Software"));

		productsRepository.save(new Products("Scrum: a arte de fazer o dobro do trabalho na metade do tempo", "Livro sobre Scrum", 38.00, "https://febracis.vteximg.com.br/arquivos/ids/155476-1000-1000/SCRUN.png?v=636939596203670000", "Jeff Sutherland", "Leya", c1));
		productsRepository.save(new Products("Lean Inception:como alinhar pessoas e construir o produto certo", "Livro para facilitar o processo de construção de produtos", 28.12, "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQky1ZvpCGJsjtodlEfF5TN7N4G_P9u-Mlzb5XANkljoxgCOQD9", "Paulo Caroli", "Editora Caroli", c1));
		productsRepository.save(new Products("Estratégia de UX", "Livro sobre experiência do usuário", 95.00, "https://s3.novatec.com.br/capas-ampliadas/capa-ampliada-9786586057652.jpg", "Jaime Levy", "Novatec", c2));
		productsRepository.save(new Products("Leis da Psicologia Aplicadas a UX", "Livro sobre a psicologia o contexto da experiência do usuário", 57.00, "https://s3.novatec.com.br/capas-ampliadas/capa-ampliada-9786586057256.jpg", "Jon Yablonski", "Novatec", c2));
		productsRepository.save(new Products("Jogos com Scratch", "Livro de lógica de programação voltado para o público infanto-juvenil.", 25.90,"https://cdn.shopify.com/s/files/1/0155/7645/products/JogoscomScratch_ebook_large.jpg?v=1631656609", "Carlos Emilio Padilla", "Alura", c3));
		productsRepository.save(new Products("App Inventor", "Livro de introdução à lógica", 31.90,"https://cdn.shopify.com/s/files/1/0155/7645/products/AppInventor_Amazon_large.jpg?v=1631563734", "Nelson Fabbri","Alura", c3));
		productsRepository.save(new Products("Use a cabeça!: padrões de projetos", "Livro sobre padrões de projeto: design patterns", 131.99, "https://images-na.ssl-images-amazon.com/images/I/51-UxkpndnL._SX367_BO1,204,203,200_.jpg", "Eric Freeman & Elisabeth Freeman", "Alta Books", c4));
		productsRepository.save(new Products("Padrões de projeto para o Android", "Livro sobre padrão de projeto exclusivo para Android", 93.00, "https://s3.novatec.com.br/capas/9788575223581.jpg", "Greg Nudelman", "Novatec", c4));
		productsRepository.save(new Products("Código limpo: Habilidades práticas do Agile Software", "Livro para aprimorar seus conhecimentos em arquitetura de software", 71.67, "https://images-na.ssl-images-amazon.com/images/I/41aHzYSXZkL._SX380_BO1,204,203,200_.jpg", "Robert C. Martin", "Alta Books", c5 ));
		productsRepository.save(new Products("Refatoração", "Livro sobre a importância de refatorar e melhorar os códigos", 98.90, "https://images-na.ssl-images-amazon.com/images/I/4125lRe2M9L._SX347_BO1,204,203,200_.jpg", "Martin Fowler", "Novatec", c5));
	}
}


