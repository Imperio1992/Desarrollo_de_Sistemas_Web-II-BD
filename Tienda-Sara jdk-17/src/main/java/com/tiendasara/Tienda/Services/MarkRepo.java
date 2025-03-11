package com.tiendasara.Tienda.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiendasara.Tienda.Models.Mark;

public interface MarkRepo extends JpaRepository<Mark, Integer>{
    
}