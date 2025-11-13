package com.innova.catalog_service.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByCode(String code);
}

// ProductEntity: What a product is (its data structure).
// ProductRepository: How to talk directly to the database for products (basic save, find, delete).
// ProductService: The smart brain that knows what to do with products (complex operations, business rules).
