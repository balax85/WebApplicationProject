package it.andrea.balasso.web.application.common.dto;

import java.util.List;

public class QuestionDto {

    private Long id;

    private String question;

    private QuestionTagDto questionTagDto;

    private InterviewDto interviewDto;

    private List<QuestionTagDto> questionTagDtoList;

    private List<QuestionCommentDto> questionCommentList;

    private List<QuestionSolutionDto> questionSolutionDtoList;

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

    public QuestionTagDto getQuestionTagDto() {
        return questionTagDto;
    }

    public void setQuestionTagDto(QuestionTagDto questionTagDto) {
        this.questionTagDto = questionTagDto;
    }

    public InterviewDto getInterviewDto() {
        return interviewDto;
    }

    public void setInterviewDto(InterviewDto interviewDto) {
        this.interviewDto = interviewDto;
    }

    public List<QuestionTagDto> getQuestionTagDtoList() {
        return questionTagDtoList;
    }

    public void setQuestionTagDtoList(List<QuestionTagDto> questionTagDtoList) {
        this.questionTagDtoList = questionTagDtoList;
    }

    public List<QuestionCommentDto> getQuestionCommentList() {
        return questionCommentList;
    }

    public void setQuestionCommentList(List<QuestionCommentDto> questionCommentList) {
        this.questionCommentList = questionCommentList;
    }

    public List<QuestionSolutionDto> getQuestionSolutionDtoList() {
        return questionSolutionDtoList;
    }

    public void setQuestionSolutionDtoList(List<QuestionSolutionDto> questionSolutionDtoList) {
        this.questionSolutionDtoList = questionSolutionDtoList;
    }
}
