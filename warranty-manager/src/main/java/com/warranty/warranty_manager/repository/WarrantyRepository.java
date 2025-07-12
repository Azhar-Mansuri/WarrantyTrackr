package com.warranty.warranty_manager.repository;

import com.warranty.warranty_manager.model.ProductWarranty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WarrantyRepository extends JpaRepository<ProductWarranty,Long>
{
    List<ProductWarranty> findByExpiryDateAfter(LocalDate today);
    List<ProductWarranty> findByExpiryDateBefore(LocalDate today);
    List<ProductWarranty> findByExpiryDateBetween(LocalDate start, LocalDate end);
}
