package it.andrea.balasso.web.application.core.dto;

import java.util.List;

public class QuestionSolutionDto {

    private Long id;

    private String questionSolution;

    private QuestionDto questionDto;

    private List<QuestionSolutionAcceptanceDto> questionSolutionAcceptanceDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionSolution() {
        return questionSolution;
    }

    public void setQuestionSolution(String questionSolution) {
        this.questionSolution = questionSolution;
    }

    public QuestionDto getQuestionDto() {
        return questionDto;
    }

    public void setQuestionDto(QuestionDto questionDto) {
        this.questionDto = questionDto;
    }

    public List<QuestionSolutionAcceptanceDto> getQuestionSolutionAcceptanceDtoList() {
        return questionSolutionAcceptanceDtoList;
    }

    public void setQuestionSolutionAcceptanceDtoList(List<QuestionSolutionAcceptanceDto> questionSolutionAcceptanceDtoList) {
        this.questionSolutionAcceptanceDtoList = questionSolutionAcceptanceDtoList;
    }
}
