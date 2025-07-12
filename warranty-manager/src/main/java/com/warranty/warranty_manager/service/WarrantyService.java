package com.warranty.warranty_manager.service;

import com.warranty.warranty_manager.model.ProductWarranty;
import com.warranty.warranty_manager.repository.WarrantyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WarrantyService
{
    @Autowired
    private WarrantyRepository repo;

    public ProductWarranty addWarranty(ProductWarranty warranty)
    {
        warranty.setExpiryDate(warranty.getPurchaseDate().plusMonths(warranty.getWarrantyMonths()));
        return repo.save(warranty);
    }
    public List<ProductWarranty> getAll()
    {
        return repo.findAll();
    }
    public List<ProductWarranty> getActiveWarranties()
    {
        return repo.findByExpiryDateAfter(LocalDate.now());
    }
    public List<ProductWarranty> getExpiredWarranties()
    {
        return repo.findByExpiryDateBefore(LocalDate.now());
    }
    public List<ProductWarranty> getExpiringSoon()
    {
        LocalDate today = LocalDate.now();
        LocalDate soon = today.plusDays(30);
        return repo.findByExpiryDateBetween(today,soon);
    }
    public void deleteWarranty(Long id)
    {
        repo.deleteById(id);
    }
}
