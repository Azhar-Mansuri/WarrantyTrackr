package com.warranty.warranty_manager.controller;

import com.warranty.warranty_manager.model.ProductWarranty;
import com.warranty.warranty_manager.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/warranty")
public class WarrantyController
{    @Autowired
    private WarrantyService service;

    @PostMapping("/add")
    public ProductWarranty add(@RequestBody ProductWarranty warranty)
    {
        return service.addWarranty(warranty);
    }

    @GetMapping("/all")
    public List<ProductWarranty> all()
    {
        return service.getAll();
    }

    @GetMapping("/active")
    public List<ProductWarranty> active()
    {
        return service.getActiveWarranties();
    }

    @GetMapping("/expired")
    public List<ProductWarranty> expired()
    {
        return service.getExpiredWarranties();
    }

    @GetMapping("/expiring-soon")
    public List<ProductWarranty> soon()
    {
        return service.getExpiringSoon();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        service.deleteWarranty(id);
    }
}
