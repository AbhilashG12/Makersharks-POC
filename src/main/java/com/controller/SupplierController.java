package com.controller;

import com.model.Supplier;
import com.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam Supplier.NatureOfBusiness natureOfBusiness,
            @RequestParam Supplier.ManufacturingProcess manufacturingProcess,
            @RequestParam int page,
            @RequestParam int size) {
        List<Supplier> suppliers = supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
        return ResponseEntity.ok(suppliers);
    }
}
