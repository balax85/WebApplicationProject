package it.andrea.balasso.web.application.common.dbo;

public class QuestionSolutionAcceptanceDbo {

    private Long id;

    private QuestionSolutionDbo questionSolutionDbo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionSolutionDbo getQuestionSolutionDbo() {
        return questionSolutionDbo;
    }

    public void setQuestionSolutionDbo(QuestionSolutionDbo questionSolutionDbo) {
        this.questionSolutionDbo = questionSolutionDbo;
    }
}
