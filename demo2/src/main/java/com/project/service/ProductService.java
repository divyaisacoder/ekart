package com.project.service;




import com.project.dto.ProductDTO;

import com.project.exception.ProductException;

public interface ProductService {

	
	public ProductDTO getProduct(Integer id) throws ProductException;
	//public List<ProductDTO> getAllProduct() throws ProductException;;
	public Integer addProduct(ProductDTO product) throws ProductException;

	public void updateProduct(Integer id, String name) throws ProductException;
	
	public void deleteProduct(Integer id) throws ProductException;
}
