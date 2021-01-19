package com.sumiyah.productscategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.models.CategoryProduct;
import com.sumiyah.productscategories.models.Product;
import com.sumiyah.productscategories.repositories.CategoryRepository;
import com.sumiyah.productscategories.repositories.PCRepository;
import com.sumiyah.productscategories.repositories.ProductRepository;

@Service
public class PCService {
	
	@Autowired
	private  ProductRepository ProductRepo;
	@Autowired
	private  CategoryRepository CategoryRepo;
	@Autowired
	private  PCRepository PCRepo;
	
//	public PCService(ProductRepository pRepo, CategoryRepository cRepo, PCRepository pcRepo) {
//		this.ProductRepo = pRepo;
//		this.CategoryRepo = cRepo;
//		this.PCRepo = pcRepo;
//	}
	
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
