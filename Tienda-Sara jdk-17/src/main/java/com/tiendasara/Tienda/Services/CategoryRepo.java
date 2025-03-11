package com.tiendasara.Tienda.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiendasara.Tienda.Models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
    
}