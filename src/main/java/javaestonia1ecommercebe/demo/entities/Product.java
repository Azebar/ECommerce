package javaestonia1ecommercebe.demo.entities;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    Long id;
    String name;
    Integer price;
    Integer rating;
    String description;
    String picture;
    @OneToMany(mappedBy = "product")
    List<Comment> comments;
}
