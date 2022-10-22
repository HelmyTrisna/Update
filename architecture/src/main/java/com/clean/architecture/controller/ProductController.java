package com.clean.architecture.controller;
import com.clean.architecture.form.ProductForm;
import com.clean.architecture.model.ProductModel;
import com.clean.architecture.service.ProductSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")


public class ProductController {

    private final ProductSvc productSvc;

    @Autowired
    public ProductController(ProductSvc productSvc){
        this.productSvc = productSvc;

    }

    @PostMapping
    public ProductModel create(@RequestBody ProductForm form){
        return productSvc.create(form);
    }

    @GetMapping
    public List<ProductModel> getAll(){
        return productSvc.getAll();
    }

    @GetMapping(value = "{id}")
    public ProductModel getById(@PathVariable Long id){
        return productSvc.findById(id);
    }
}


