package it.andrea.balasso.web.application.core.dbo;

import java.util.List;

public class QuestionDbo {

    private Long id;

    private String question;

    private QuestionTagDbo questionTagDbo;

    private InterviewDbo interviewDbo;

    private List<QuestionTagDbo> questionTagDboList;

    private List<QuestionComment> questionCommentList;

    private List<QuestionSolutionDbo> questionSolutionDboList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuestionTagDbo getQuestionTagDbo() {
        return questionTagDbo;
    }

    public void setQuestionTagDbo(QuestionTagDbo questionTagDbo) {
        this.questionTagDbo = questionTagDbo;
    }

    public InterviewDbo getInterviewDbo() {
        return interviewDbo;
    }

    public void setInterviewDbo(InterviewDbo interviewDbo) {
        this.interviewDbo = interviewDbo;
    }

    public List<QuestionTagDbo> getQuestionTagDboList() {
        return questionTagDboList;
    }

    public void setQuestionTagDboList(List<QuestionTagDbo> questionTagDboList) {
        this.questionTagDboList = questionTagDboList;
    }

    public List<QuestionComment> getQuestionCommentList() {
        return questionCommentList;
    }

    public void setQuestionCommentList(List<QuestionComment> questionCommentList) {
        this.questionCommentList = questionCommentList;
    }

    public List<QuestionSolutionDbo> getQuestionSolutionDboList() {
        return questionSolutionDboList;
    }

    public void setQuestionSolutionDboList(List<QuestionSolutionDbo> questionSolutionDboList) {
        this.questionSolutionDboList = questionSolutionDboList;
    }
}
