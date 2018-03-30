package it.andrea.balasso.web.application.core.dto;

import java.util.List;

public class FieldDto {

    private Long id;

    private String field;

    private List<CompanyFieldDto> companyFieldDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<CompanyFieldDto> getCompanyFieldDtoList() {
        return companyFieldDtoList;
    }

    public void setCompanyFieldDtoList(List<CompanyFieldDto> companyFieldDtoList) {
        this.companyFieldDtoList = companyFieldDtoList;
    }
}
