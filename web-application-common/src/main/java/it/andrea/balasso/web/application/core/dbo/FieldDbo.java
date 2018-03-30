package it.andrea.balasso.web.application.core.dbo;

import java.util.List;

public class FieldDbo {

    private Long id;

    private String field;

    private List<CompanyFieldDbo> companyFieldDboList;

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

    public List<CompanyFieldDbo> getCompanyFieldDboList() {
        return companyFieldDboList;
    }

    public void setCompanyFieldDboList(List<CompanyFieldDbo> companyFieldDboList) {
        this.companyFieldDboList = companyFieldDboList;
    }
}
