package com.sumiyah.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumiyah.productscategories.models.Product;
import com.sumiyah.productscategories.services.PCService;

@Controller
public class ProductController {

	private final PCService appService;
	public ProductController(PCService service) {
		this.appService = service;
	}
	
	//show all products
	@RequestMapping("/products")
	public String index(Model model) {
		model.addAttribute("product", appService.allProducts());
		return "productsHome.jsp";
	}
	
	//show one product
	@RequestMapping("/products/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product", this.appService.findProduct(id));
		return "showProduct.jsp";
	}
	
	//new product
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	} 
	
	//from from!
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("product") Product product,BindingResult result) {
		if(result.hasErrors())
			return "newProduct.jsp";
		this.appService.createProduct(product);
		return "redirect:/products";
	}
	
	
}
