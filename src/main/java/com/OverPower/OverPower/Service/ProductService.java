package com.OverPower.OverPower.Service;

import java.util.List;

import com.OverPower.OverPower.Model.Products;
import com.OverPower.OverPower.Repository.ProductRepository;

public class ProductService {

    private ProductRepository productRepository;

    public Products createProduct(Products product) {.
        return productRepository.save(product);

    }

    public List<Products> listProducts() {
        return productRepository.findAll();
    }

    public Optional<Products> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Long id, Products productUpdate) {
        return ProductRepository.findById(id)
            .map(existingProduct -> {
                existingProduct.setCategory(productUpdate.getCategory());
                existingProduct.setPrice(productUpdate.getPrice());
                existingProduct.setQuantity(productUpdate.getQuantity());
                return productRepository.save(existingProduct);
            })
            .orElse(null);
    }

}
