package com.sumiyah.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sumiyah.productscategories.models.CategoryProduct;

public interface PCRepository extends CrudRepository<CategoryRepository, Long>{

	CategoryProduct save(CategoryProduct pc);

}
