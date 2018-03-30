package it.andrea.balasso.web.application.core.dbo;

public class CompanyFieldDbo {

    private Long id;

    private FieldDbo fieldDbo;

    private CompanyDbo companyDbo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FieldDbo getFieldDbo() {
        return fieldDbo;
    }

    public void setFieldDbo(FieldDbo fieldDbo) {
        this.fieldDbo = fieldDbo;
    }

    public CompanyDbo getCompanyDbo() {
        return companyDbo;
    }

    public void setCompanyDbo(CompanyDbo companyDbo) {
        this.companyDbo = companyDbo;
    }
}
