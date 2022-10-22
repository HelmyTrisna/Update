package com.clean.architecture.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "product")
@NoArgsConstructor

public class ProductModel extends BaseDao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private Double price;

}
