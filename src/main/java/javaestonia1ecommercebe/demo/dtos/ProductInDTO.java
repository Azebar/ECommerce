package javaestonia1ecommercebe.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInDTO {

    String name;
    Integer price;
    Integer rating;
    String description;
    String picture;
}
