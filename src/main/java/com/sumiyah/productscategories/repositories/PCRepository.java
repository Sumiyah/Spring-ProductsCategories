package com.sumiyah.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumiyah.productscategories.models.CategoryProduct;

@Repository
public interface PCRepository extends CrudRepository<CategoryProduct, Long>{

	

}
