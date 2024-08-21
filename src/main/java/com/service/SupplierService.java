package com.service;

import com.model.Supplier;
// import com.repository.SupplierRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

import java.util.List;
public interface SupplierService {
    List<Supplier> findSuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess manufacturingProcess, int page, int size);
}