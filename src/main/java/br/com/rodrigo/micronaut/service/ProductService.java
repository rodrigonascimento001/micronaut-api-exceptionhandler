package br.com.rodrigo.micronaut.service;


import br.com.rodrigo.micronaut.exception.CustomException;
import br.com.rodrigo.micronaut.model.Product;
import br.com.rodrigo.micronaut.repository.ProductRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ProductService {

    private final ProductRepository repository;

    public ProductService( ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product){
        Product save = repository.save(product);
        return save;
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(long id){
        return repository.findById(id).orElseThrow(()-> new CustomException("Resource not found"));
    }
}
