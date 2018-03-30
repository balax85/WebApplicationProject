package it.andrea.balasso.web.application.core.dto;

import java.util.List;

public class CompanyDto {

    private Long id;

    private String name;

    private String country;

    private String city;

    private String address;

    private List<CompanyFieldDto> companyFieldDtoList;

    private List<DepartmentDto> departmentDtoList;

    private List<PositionDto> positionDtoList;

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

    public List<CompanyFieldDto> getCompanyFieldDtoList() {
        return companyFieldDtoList;
    }

    public void setCompanyFieldDtoList(List<CompanyFieldDto> companyFieldDtoList) {
        this.companyFieldDtoList = companyFieldDtoList;
    }

    public List<DepartmentDto> getDepartmentDtoList() {
        return departmentDtoList;
    }

    public void setDepartmentDtoList(List<DepartmentDto> departmentDtoList) {
        this.departmentDtoList = departmentDtoList;
    }

    public List<PositionDto> getPositionDtoList() {
        return positionDtoList;
    }

    public void setPositionDtoList(List<PositionDto> positionDtoList) {
        this.positionDtoList = positionDtoList;
    }
}
