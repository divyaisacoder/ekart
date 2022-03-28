package com.project.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.ProductDTO;
import com.project.exception.ProductException;
import com.project.service.ProductService;
//commit
@RestController
@RequestMapping(value = "/product")
public class ProductAPI {
	@Autowired
	private ProductService productService;
	//

	@GetMapping(value = "/product/{productId}")
	public ResponseEntity<ProductDTO> getCustomer(@PathVariable Integer id) throws ProductException {
		ProductDTO customer = productService.getProduct(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@PostMapping(value = "/product")
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO product) throws ProductException {
		Integer productId = productService.addProduct(product);
		String successMessage = "inserted"+ productId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/product/{productId}")
	public ResponseEntity<String> updateProduct(@PathVariable Integer id, @RequestBody ProductDTO product)
			throws ProductException {
		productService.updateProduct(id, product.getName());
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	@DeleteMapping(value = "/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) throws ProductException {
		productService.deleteProduct(id);
		String successMessage = "Deleted";
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
}

