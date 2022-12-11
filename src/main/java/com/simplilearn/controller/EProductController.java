package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.EProduct;
import com.simplilearn.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	EProductService eProductService;

	// STEP 1: Handle request
	@GetMapping("/getProducts")
	public String listProducts(Model model) {
		
		// STEP 2: Invoke service to execute business logic
		List<EProduct> products = eProductService.getProducts();
		
		// STEP 3: Populate model object
		model.addAttribute("products", products);
		
		// STEP 4: invoke view
		return "list-product";
	}

}
