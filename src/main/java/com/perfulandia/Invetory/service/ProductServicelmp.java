package com.perfulandia.Invetory.service;

import com.perfulandia.Invetory.entities.Product;
import com.perfulandia.Invetory.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class ProductServicelmp implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServicelmp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.getReferenceById(id);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(Product product){
        Optional<Product> product_found = productRepository.findById(product.getId());
        if(product_found.isPresent()){
            return productRepository.save(product);
        }
        else{
            throw new EntityNotFoundException("producto no encontrado");
        }
    }

}
