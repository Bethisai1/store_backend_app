package com.ecommerce.store.service.impl;

import com.ecommerce.store.dto.ProductResponse;
import com.ecommerce.store.model.Product;
import com.ecommerce.store.repository.ProductRepository;
import com.ecommerce.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private static final String BASE_URL =
            "";

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponse> getAllProducts() {

        List<Product> products = productRepository.findAll();

        return products.stream().map(p ->
                new ProductResponse(
                        p.getItemId(),
                        p.getItemName(),
                        p.getUnitPrice(),
                        BASE_URL + p.getImage()
                )
        ).collect(Collectors.toList());
    }
}