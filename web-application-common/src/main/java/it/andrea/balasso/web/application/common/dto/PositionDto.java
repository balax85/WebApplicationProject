package it.andrea.balasso.web.application.common.dto;

import java.util.List;

public class PositionDto {

    private Long id;

    private String position;

    private CompanyDto companyDto;

    private DepartmentDto departmentDto;

    private List<InterviewDto> interviewDtoList;

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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }

    public List<InterviewDto> getInterviewDtoList() {
        return interviewDtoList;
    }

    public void setInterviewDtoList(List<InterviewDto> interviewDtoList) {
        this.interviewDtoList = interviewDtoList;
    }
}
