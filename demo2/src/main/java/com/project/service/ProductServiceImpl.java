package com.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.ProductDTO;
import com.project.entity.Products;
import com.project.exception.ProductException;
import com.project.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service(value = "productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	
		@Autowired
		private ProductRepository productRepository;
		@Override
		public ProductDTO getProduct(Integer id) throws ProductException {
			Optional<Products> optional = productRepository.findById(id);
			Products product = optional.orElseThrow(() -> new ProductException("Service.CUSTOMER_NOT_FOUND"));
			ProductDTO prod2 = new ProductDTO();
			prod2.setId(product.getId());
			prod2.setName(product.getName());
			prod2.setPrice(product.getPrice());
			prod2.setCategory(product.getCategory());
			return prod2;
		}
		
		
		@Override
		public Integer addProduct(ProductDTO product) throws ProductException  {
			Products productEntity = new Products();
			productEntity.setId(product.getId());
			productEntity.setName(product.getName());
			productEntity.setPrice(product.getPrice());
			productEntity.setCategory(product.getCategory());
			Products productEntity2 = productRepository.save(productEntity);
			return productEntity2.getId();
		}
		
		@Override
		public void updateProduct(Integer id, String name) throws ProductException {
			Optional<Products> product = productRepository.findById(id);
			Products p = product.orElseThrow(() -> new ProductException("Service.PRODUCT_NOT_FOUND"));
			p.setName(name);
		}
		
		@Override
		public void deleteProduct(Integer id) throws ProductException {
			Optional<Products> product = productRepository.findById(id);
			product.orElseThrow(() -> new ProductException("Service.PRODUCT_NOT_FOUND"));
			productRepository.deleteById(id);
		}
	}


