package com.clean.architecture.service;

import com.clean.architecture.form.ProductForm;
import com.clean.architecture.model.ProductModel;

import java.util.List;


public interface ProductSvc {


    ProductModel create(ProductForm form);

    List<ProductModel> getAll();

    ProductModel findById(Long id);

}

