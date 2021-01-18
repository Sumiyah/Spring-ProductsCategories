package com.sumiyah.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
