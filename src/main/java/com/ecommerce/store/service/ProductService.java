package com.ecommerce.store.service;

import com.ecommerce.store.dto.ProductResponse;
import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();
}