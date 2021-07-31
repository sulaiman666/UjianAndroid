package com.solo.ujianJPA2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.solo.ujianJPA2.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query(value = "Select * FROM product WHERE kategori_produk = ?1", nativeQuery = true)
	public List<Product> getByKategoriProduct(String kategori);
}
