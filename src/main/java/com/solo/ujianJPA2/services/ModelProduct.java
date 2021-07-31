package com.solo.ujianJPA2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solo.ujianJPA2.entity.Product;
import com.solo.ujianJPA2.repository.ProductRepository;

@Service
public class ModelProduct implements ProductModelInterface {
	@Autowired
	ProductRepository productRepo;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return this.productRepo.findAll();
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		this.productRepo.save(product);
		return "Product Added";
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		this.productRepo.save(product);
		return "Product Updated";
	}

	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		this.productRepo.deleteById(Long.parseLong(id));
		return "Product Deleted";
	}

	public List<Product> getByKategoriProduct(String kategori) {
		// TODO Auto-generated method stub
		return this.productRepo.getByKategoriProduct(kategori);
	}

}
