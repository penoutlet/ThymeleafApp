package com.samjones.ThymeleafCrud.repositories;

import com.samjones.ThymeleafCrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
