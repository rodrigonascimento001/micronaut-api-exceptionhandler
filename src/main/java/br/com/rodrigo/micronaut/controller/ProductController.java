package br.com.rodrigo.micronaut.controller;

import br.com.rodrigo.micronaut.exception.CustomException;
import br.com.rodrigo.micronaut.model.Product;
import br.com.rodrigo.micronaut.service.ProductService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import jakarta.inject.Inject;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Controller
public class ProductController {
    @Inject
    ProductService service;

    public ProductController(ProductService productService) {
        this.service = productService;
    }

    @Get("/products/{id}")
    public Product findProductById(@Positive(message = "o id deve ser positivo") long id) throws CustomException {
        return service.findById(id);
    }

    @Get("/products")
    public List<Product> findAll(){
        return service.findAll();
    }

    @Post("/products")
    public Product create(@Valid Product product){
        return service.create(product);
    }
}
