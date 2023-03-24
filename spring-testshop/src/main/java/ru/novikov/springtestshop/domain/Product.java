package ru.novikov.springtestshop.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    private static final String SEQ_NAME = "product-seq";

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME,sequenceName = SEQ_NAME, allocationSize = 1)
    private Long Id;
    private String title;
    private String descriptions;
    private String organizations;
    private BigDecimal price;
    private BigDecimal quantity;
    private String discount;
    private String reviews;
    private String keywords;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "products_specifications",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "specification_id"))
    private List<Specifications> specifications;
    private String evaluations;




}
