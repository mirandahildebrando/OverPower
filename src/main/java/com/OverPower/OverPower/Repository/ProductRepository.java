package com.OverPower.OverPower.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OverPower.OverPower.Model.Products;


@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {




}
