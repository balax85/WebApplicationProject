package it.andrea.balasso.web.application.core.dbo;

import java.util.Date;
import java.util.List;

public class InterviewDbo {

    private Long id;

    private Date interviewDate;

    private String interviewType;

    private PositionDbo positionDbo;

    private List<QuestionDbo> questionDboList;

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

    public PositionDbo getPositionDbo() {
        return positionDbo;
    }

    public void setPositionDbo(PositionDbo positionDbo) {
        this.positionDbo = positionDbo;
    }

    public List<QuestionDbo> getQuestionDboList() {
        return questionDboList;
    }

    public void setQuestionDboList(List<QuestionDbo> questionDboList) {
        this.questionDboList = questionDboList;
    }
}
