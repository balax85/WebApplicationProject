package it.andrea.balasso.web.application.core.dbo;

import java.util.List;

public class DepartmentDbo {

    private Long id;

    private String department;

    private CompanyDbo companyDbo;

    private List<PositionDbo> positionDboList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public CompanyDbo getCompanyDbo() {
        return companyDbo;
    }

    public void setCompanyDbo(CompanyDbo companyDbo) {
        this.companyDbo = companyDbo;
    }

    public List<PositionDbo> getPositionDboList() {
        return positionDboList;
    }

    public void setPositionDboList(List<PositionDbo> positionDboList) {
        this.positionDboList = positionDboList;
    }
}
