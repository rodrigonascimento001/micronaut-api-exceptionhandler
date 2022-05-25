package br.com.rodrigo.micronaut.model;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@MappedEntity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    @NotNull(message = "o campo name nao pode ser vazio")
    @Size(min = 3, max = 20, message = "o campo tem que ter o tamanho minimo de 3 e maximo de 20")
    private String name;

    @PositiveOrZero(message = "o campo preco tem que ser maior ou igual a zero")
    private BigDecimal price;

    public Product() {
    }

    public Product(long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
