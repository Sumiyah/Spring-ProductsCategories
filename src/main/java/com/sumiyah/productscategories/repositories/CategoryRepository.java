package com.sumiyah.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
