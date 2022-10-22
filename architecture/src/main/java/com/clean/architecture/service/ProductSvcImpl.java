package com.clean.architecture.service;

import com.clean.architecture.form.ProductForm;
import com.clean.architecture.model.ProductModel;
import com.clean.architecture.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSvcImpl implements ProductSvc {

    private final ProductRepository productRepo;

    @Autowired
    public ProductSvcImpl(ProductRepository productRepo){
        this.productRepo = productRepo;
    }

    @Override
    public ProductModel create(ProductForm form) {

        return productRepo.save(product(form));
    }

    @Override
    public List<ProductModel> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductModel findById(Long id) {
        Optional<ProductModel> opt = productRepo.findById(id);

        return opt.orElse(null);
    }

    private ProductModel product(ProductForm form){
        ProductModel product = new ProductModel();
        product.setProductName(form.getProductName());
        product.setPrice(form.getPrice());

        return product;

    }

}
