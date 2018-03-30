package it.andrea.balasso.web.application.core.dbo;

import java.util.List;

public class QuestionSolutionDbo {

    private Long id;

    private String questionSolution;

    private QuestionDbo questionDbo;

    private List<QuestionSolutionAcceptanceDbo> questionSolutionAcceptanceDboList;

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

    public QuestionDbo getQuestionDbo() {
        return questionDbo;
    }

    public void setQuestionDbo(QuestionDbo questionDbo) {
        this.questionDbo = questionDbo;
    }

    public List<QuestionSolutionAcceptanceDbo> getQuestionSolutionAcceptanceDboList() {
        return questionSolutionAcceptanceDboList;
    }

    public void setQuestionSolutionAcceptanceDboList(List<QuestionSolutionAcceptanceDbo> questionSolutionAcceptanceDboList) {
        this.questionSolutionAcceptanceDboList = questionSolutionAcceptanceDboList;
    }
}
