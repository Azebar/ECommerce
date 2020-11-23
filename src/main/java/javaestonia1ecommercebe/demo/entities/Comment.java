package javaestonia1ecommercebe.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue
    Long id;
    String comment;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
}
