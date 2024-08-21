package com.repository;


import com.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.PageRequest;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess manufacturingProcess, Pageable pageable);
}