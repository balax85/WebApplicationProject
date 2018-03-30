package it.andrea.balasso.web.application.common.dto;

import java.util.Date;
import java.util.List;

public class InterviewDto {

    private Long id;

    private Date interviewDate;

    private String interviewType;

    private PositionDto positionDto;

    private List<QuestionDto> questionDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(String interviewType) {
        this.interviewType = interviewType;
    }

    public PositionDto getPositionDto() {
        return positionDto;
    }

    public void setPositionDto(PositionDto positionDto) {
        this.positionDto = positionDto;
    }

    public List<QuestionDto> getQuestionDtoList() {
        return questionDtoList;
    }

    public void setQuestionDtoList(List<QuestionDto> questionDtoList) {
        this.questionDtoList = questionDtoList;
    }
}
