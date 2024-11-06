package com.linhaus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linhaus.course.entities.Product;

/*
 * Essa anotação é opcional como ele já está herdando do JpaRepository
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}