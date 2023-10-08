package com.davi.shop.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.davi.shop.dto.controller.ProductCategoryDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/product-categories")
public interface ProductCategoryAPI {

    @GetMapping
    public ResponseEntity<Page<ProductCategoryDTO>> findAllPaged(
	    Pageable pageable);

}
