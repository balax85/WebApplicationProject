package it.andrea.balasso.web.application.common.dbo;

import java.util.List;

public class PositionDbo {

    private Long id;

    private String position;

    private CompanyDbo companyDbo;

    private DepartmentDbo departmentDbo;

    private List<InterviewDbo> interviewDboList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public CompanyDbo getCompanyDbo() {
        return companyDbo;
    }

    public void setCompanyDbo(CompanyDbo companyDbo) {
        this.companyDbo = companyDbo;
    }

    public DepartmentDbo getDepartmentDbo() {
        return departmentDbo;
    }

    public void setDepartmentDbo(DepartmentDbo departmentDbo) {
        this.departmentDbo = departmentDbo;
    }

    public List<InterviewDbo> getInterviewDboList() {
        return interviewDboList;
    }

    public void setInterviewDboList(List<InterviewDbo> interviewDboList) {
        this.interviewDboList = interviewDboList;
    }
}
