package com.tiendasara.Tienda.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiendasara.Tienda.Models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}