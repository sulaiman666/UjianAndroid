package com.solo.ujianJPA2.services;

import java.util.List;

import com.solo.ujianJPA2.entity.Product;

public interface ProductModelInterface {
	public List<Product> getAllProduct();
	public String addProduct(Product product);
	public String updateProduct(Product product);
	public String deleteProduct(String id);
}
