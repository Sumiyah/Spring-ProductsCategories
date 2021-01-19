package com.sumiyah.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.models.CategoryProduct;
import com.sumiyah.productscategories.models.Product;
import com.sumiyah.productscategories.services.PCService;

@Controller
public class HomeController {

	@Autowired
	private PCService appService;

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//Categories
	@RequestMapping("/categories")
	public String index(Model model) {
		model.addAttribute("category", this.appService.allCategories());
		return "categoriesHome.jsp";
	}
	
	@RequestMapping("/categories/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("category", this.appService.findCategory(id));
		//USE THIS IN THE FORM TO ADD PRODUCTS IN CATEGORIES
		model.addAttribute("notInPro", this.appService.findProductsNotInCategory(this.appService.findCategory(id)));
		return "showCategory.jsp";
	}
	
	@RequestMapping("/categories/new")
	public String newCat(@ModelAttribute("category") Category category, Model model) {
		return "newCategory.jsp";
	}
	
	@RequestMapping(value="/categories", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("category") Category category,BindingResult result) {
		if(result.hasErrors())
			return "newCategory.jsp";
		this.appService.createCategory(category);
		return "redirect:/categories";
	}
	
	//Products
	//show all products
	@RequestMapping("/products")
	public String indexP(Model model) {
		model.addAttribute("product", appService.allProducts());
		return "productsHome.jsp";
	}
	
	//show one product
	@RequestMapping("/products/{id}")
	public String showP(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product", this.appService.findProduct(id));
		model.addAttribute("notInCat", this.appService.findCategoriesNotInProduct(this.appService.findProduct(id)));
		return "showProduct.jsp";
	}
	
	//new product
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product, Model model) {
		return "newProduct.jsp";
	} 
	
	//from from!
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String createP(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors())
			return "newProduct.jsp";
		this.appService.createProduct(product);
		return "redirect:/products";
	}
	
	//the link a category to product
	@RequestMapping(value="/associations/products", method=RequestMethod.POST)
	public String CreateP(@Valid @ModelAttribute("association") CategoryProduct association,
			BindingResult result) {
		if(result.hasErrors())
			return "showProducts.jsp";
		appService.createAssociation(association);
		return "redirect:/products";
	}
	
	//the link a product to a category
		@RequestMapping(value="/associations/categories", method=RequestMethod.POST)
		public String CreateC(@Valid @ModelAttribute("association") CategoryProduct association,
				BindingResult result) {
			if(result.hasErrors())
				return "showCategories.jsp";
			appService.createAssociation(association);
			return "redirect:/categories";
		}
}

