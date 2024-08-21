package com.model;

public class Supplier {

    public enum NatureOfBusiness {
        SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE
    }

    public enum ManufacturingProcess {
        MOULDING, THREE_D_PRINTING, CASTING, COATING
    }

    private Long id;
    private String companyName;
    private String website;
    private String location;
    private NatureOfBusiness natureOfBusiness;
    private ManufacturingProcess manufacturingProcess;

    // Default constructor
    public Supplier() {
    }

    // Parameterized constructor
    public Supplier(Long id, String companyName, String website, String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess) {
        this.id = id;
        this.companyName = companyName;
        this.website = website;
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.manufacturingProcess = manufacturingProcess;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public ManufacturingProcess getManufacturingProcess() {
        return manufacturingProcess;
    }

    public void setManufacturingProcess(ManufacturingProcess manufacturingProcess) {
        this.manufacturingProcess = manufacturingProcess;
    }
}
