package it.andrea.balasso.web.application.core.dbo;

import java.util.List;

public class CompanyDbo {

    private Long id;

    private String name;

    private String country;

    private String city;

    private String address;

    private List<CompanyFieldDbo> companyFieldDboList;

    private List<DepartmentDbo> departmentDboList;

    private List<PositionDbo> positionDboList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CompanyFieldDbo> getCompanyFieldDboList() {
        return companyFieldDboList;
    }

    public void setCompanyFieldDboList(List<CompanyFieldDbo> companyFieldDboList) {
        this.companyFieldDboList = companyFieldDboList;
    }

    public List<DepartmentDbo> getDepartmentDboList() {
        return departmentDboList;
    }

    public void setDepartmentDboList(List<DepartmentDbo> departmentDboList) {
        this.departmentDboList = departmentDboList;
    }

    public List<PositionDbo> getPositionDboList() {
        return positionDboList;
    }

    public void setPositionDboList(List<PositionDbo> positionDboList) {
        this.positionDboList = positionDboList;
    }
}
