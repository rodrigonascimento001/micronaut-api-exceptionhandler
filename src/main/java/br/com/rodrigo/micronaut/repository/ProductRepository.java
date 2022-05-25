package br.com.rodrigo.micronaut.repository;


import br.com.rodrigo.micronaut.model.Product;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;

import java.util.List;

@JdbcRepository(dialect = Dialect.MYSQL)
public interface ProductRepository extends PageableRepository<Product, Long> {
    List<Product> findAll();
}
