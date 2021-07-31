package com.solo.ujianJPA2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solo.ujianJPA2.entity.Product;
import com.solo.ujianJPA2.services.ModelProduct;
import com.solo.ujianJPA2.entity.Response;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ModelProduct modelProduct;
	
	@GetMapping("/")
	public ResponseEntity<Response> getAll() {
		Response respon = new Response();
		
		respon.setStatusCode(200);
		respon.setMessage("Berhasil mendapatkan product");
		
		respon.setData(this.modelProduct.getAllProduct());
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(respon);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Response> addProduct(@RequestBody Product product) {
		Response respon = new Response();
		
		respon.setStatusCode(200);
		respon.setMessage("Berhasil menambahkan product");
		
		respon.setData(this.modelProduct.addProduct(product));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(respon);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Response> updateProduct(@RequestBody Product product, @PathVariable String id) {
		Response respon = new Response();
		
		respon.setStatusCode(200);
		respon.setMessage("Berhasil update product");
		
		product.setId(Long.parseLong(id));
		respon.setData(this.modelProduct.updateProduct(product));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(respon);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<Response> deleteProduct(@PathVariable String id) {
		Response respon = new Response();
		
		respon.setStatusCode(200);
		respon.setMessage("Berhasil delete product");
		
		respon.setData(this.modelProduct.deleteProduct(id));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(respon);
	}
	
	@GetMapping("/{kategori}")
	public ResponseEntity<Response> getByKategori(@PathVariable String kategori) {
		Response respon = new Response();
		
		respon.setStatusCode(200);
		respon.setMessage("Berhasil mendapatkan product berdasarkan ketegori");
		
		respon.setData(this.modelProduct.getByKategoriProduct(kategori));
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(respon);
	}
}
