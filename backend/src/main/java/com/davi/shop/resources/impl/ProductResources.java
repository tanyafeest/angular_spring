package com.davi.shop.resources.impl;

import com.davi.shop.dto.controller.ProductDTO;
import com.davi.shop.entities.product.Product;
import com.davi.shop.services.ProductService;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductResources {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAllPaged(
	    Pageable pageable) {
	return ResponseEntity.ok()
		.body(service.findAllPaged(pageable));
    }

    @GetMapping(value = "/search/category")
    public ResponseEntity<Page<Product>> findAllPaged(
	    @RequestParam("id") Long id,
	    Pageable pageable) {
	return ResponseEntity.ok()
		.body(service.findByCategoryId(id, pageable));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Page<Product>> seachByName(
	    @RequestParam("name") String name,
	    Pageable pageable0) {
	return ResponseEntity.ok()
		.body(service.findByName(name, pageable0));
    }

    @GetMapping(value = "/search/{id}")
    public ResponseEntity<ProductDTO> searchById(
	    @PathVariable @NotNull Long id,
	    Pageable pageable) {
	return ResponseEntity.ok().body(service.findById(id));
    }
}
