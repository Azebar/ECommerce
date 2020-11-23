package javaestonia1ecommercebe.demo.controllers;

import javaestonia1ecommercebe.demo.dtos.ProductInDTO;
import javaestonia1ecommercebe.demo.dtos.ProductOutDto;
import javaestonia1ecommercebe.demo.entities.Product;
import javaestonia1ecommercebe.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    final ProductService service;

    @GetMapping("/all")
    List<ProductOutDto> getAllProducts(){
        List<ProductOutDto> productOutDtos = new ArrayList<>();
        Iterable<Product> productIterable = service.getAllProducts();
        productIterable.forEach(product -> {
            ProductOutDto dto = ProductOutDto.builder()
                    .description(product.getDescription())
                    .name(product.getName())
                    .price(product.getPrice())
                    .rating(product.getRating())
                    .build();
            productOutDtos.add(dto);
        });
        return productOutDtos;
    }

    @PostMapping("/create")
    ProductOutDto createProduct(@RequestBody ProductInDTO productInDTO) {
        return service.save(productInDTO);
    }
}
