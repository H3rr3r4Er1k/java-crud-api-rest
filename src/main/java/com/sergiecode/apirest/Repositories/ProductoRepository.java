package com.sergiecode.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiecode.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
