package javaestonia1ecommercebe.demo.repositories;

import javaestonia1ecommercebe.demo.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
