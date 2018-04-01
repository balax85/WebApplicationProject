package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.QuestionSolutionDbo;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionSolutionDao implements IQuestionSolutionDao {

    @Override
    public QuestionSolutionDbo insertOrUpdateSolutionToQuestion(QuestionSolutionDbo questionSolutionDto) {
        return null;
    }

    @Override
    public QuestionSolutionDbo insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionDbo questionSolutionAcceptanceDto) {
        return null;
    }
}
