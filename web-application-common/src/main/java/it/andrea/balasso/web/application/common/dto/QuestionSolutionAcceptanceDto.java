package it.andrea.balasso.web.application.common.dto;

public class QuestionSolutionAcceptanceDto {

    private Long id;

    private QuestionSolutionDto questionSolutionDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionSolutionDto getQuestionSolutionDto() {
        return questionSolutionDto;
    }

    public void setQuestionSolutionDto(QuestionSolutionDto questionSolutionDto) {
        this.questionSolutionDto = questionSolutionDto;
    }
}
