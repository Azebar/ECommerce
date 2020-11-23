package javaestonia1ecommercebe.demo.services;

import javaestonia1ecommercebe.demo.dtos.ProductInDTO;
import javaestonia1ecommercebe.demo.dtos.ProductOutDto;
import javaestonia1ecommercebe.demo.entities.Product;
import javaestonia1ecommercebe.demo.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    final ProductRepository repository;

    public Iterable<Product> getAllProducts(){
        return repository.findAll();
    }

    public ProductOutDto save(ProductInDTO productInDTO) {
        Product product = new Product();
        product.setName(productInDTO.getName());
        product.setDescription(productInDTO.getDescription());
        product.setPrice(productInDTO.getPrice());
        product.setRating(productInDTO.getRating());
        repository.save(product);
        return ProductOutDto.builder()
                .rating(product.getRating())
                .price(product.getPrice())
                .name(product.getName())
                .description(product.getDescription())
                .build();
    }
}
