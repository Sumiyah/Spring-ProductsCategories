package com.sumiyah.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sumiyah.productscategories.models.CategoryProduct;
import com.sumiyah.productscategories.services.PCService;

@Controller
public class AssociationController {

	private final PCService appService;
	public AssociationController(PCService service) {
		this.appService = service;
	}
	@PostMapping("/associations/{kind}")
	public String Create(@Valid @ModelAttribute("association") CategoryProduct association,
			BindingResult result,
			@PathVariable("kind") String kind) {
		if(result.hasErrors())
			return String.format("/%s/show.jsp", kind);
		appService.createAssociation(association);
		return "redirect:/";
	}
}
