package com.perfulandia.Invetory.repositories;


import com.perfulandia.Invetory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}