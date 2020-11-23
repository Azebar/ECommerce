package javaestonia1ecommercebe.demo.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductOutDto {

    String name;
    Integer price;
    Integer rating;
    String description;
}
