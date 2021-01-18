package com.sumiyah.productscategories.services;

import java.util.List;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.models.CategoryProduct;
import com.sumiyah.productscategories.models.Product;
import com.sumiyah.productscategories.repositories.CategoryRepository;
import com.sumiyah.productscategories.repositories.PCRepository;
import com.sumiyah.productscategories.repositories.ProductRepository;

public class PCService {
	
	private final ProductRepository ProductRepo;
	private final CategoryRepository CategoryRepo;
	private final PCRepository PCRepo;
	
	public PCService(ProductRepository pRepo, CategoryRepository cRepo, PCRepository pcRepo) {
		this.ProductRepo = pRepo;
		this.CategoryRepo = cRepo;
		this.PCRepo = pcRepo;
	}
	
	public Product createProduct(Product product) {
		return ProductRepo.save(product);
	}
	
	public Category createCategory(Category category) {
		return CategoryRepo.save(category);
	}
	
	public List<Product> allProducts(){
		return ProductRepo.findAll();
	}
	
	public List<Category> allCategories(){
		return CategoryRepo.findAll();
	}
	
	public Product findProduct(Long id) {
		return this.ProductRepo.findById(id).orElse(null);
	}
	
	public Category findCategory(Long id) {
		return this.CategoryRepo.findById(id).orElse(null);
	}
	
	public CategoryProduct createAssociation(CategoryProduct pc) {
		return this.PCRepo.save(pc);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return CategoryRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return ProductRepo.findByCategoriesNotContains(category);
	}

}
