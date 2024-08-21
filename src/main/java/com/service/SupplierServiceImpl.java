package com.service;


import com.model.Supplier;
import com.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findSuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess manufacturingProcess, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Supplier> supplierPage = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcess, pageable);
        return supplierPage.getContent(); // Extract the list of suppliers from the Page object
    }
}