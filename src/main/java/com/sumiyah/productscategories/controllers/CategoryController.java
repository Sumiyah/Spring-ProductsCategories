package com.sumiyah.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumiyah.productscategories.models.Category;
import com.sumiyah.productscategories.services.PCService;

@Controller
public class CategoryController {

//	private final PCService appService;
//	public CategoryController(PCService service) {
//		this.appService = service;
//	}
	
//	@RequestMapping("/categories")
//	public String index(Model model) {
//		model.addAttribute("category", this.appService.allCategories());
//		return "categoriesHome.jsp";
//	}
//	
//	@RequestMapping("/categories/{id}")
//	public String show(@PathVariable("id") Long id, Model model) {
//		model.addAttribute("category", this.appService.findCategory(id));
//		return "showCategory.jsp";
//	}
//	
//	@RequestMapping("/categories/new")
//	public String newCat(@ModelAttribute("category") Category category, Model model) {
//		model.addAttribute("category", this.appService.allCategories());
//		return "newCategory.jsp";
//	}
//	
//	@RequestMapping(value="/categories", method=RequestMethod.POST)
//	public String create(@Valid @ModelAttribute("category") Category category,BindingResult result) {
//		if(result.hasErrors())
//			return "newCategory.jsp";
//		this.appService.createCategory(category);
//		return "redirect:/categories";
//	}
}
