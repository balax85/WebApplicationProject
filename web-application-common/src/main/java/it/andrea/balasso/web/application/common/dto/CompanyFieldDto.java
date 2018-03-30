package it.andrea.balasso.web.application.common.dto;

public class CompanyFieldDto {

    private Long id;

    private FieldDto fieldDto;

    private CompanyDto companyDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FieldDto getFieldDto() {
        return fieldDto;
    }

    public void setFieldDto(FieldDto fieldDto) {
        this.fieldDto = fieldDto;
    }

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }
}
