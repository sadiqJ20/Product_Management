package com.cartApplication.bestStore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartApplication.bestStore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>  {

}
