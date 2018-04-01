package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.QuestionSolutionAcceptanceDbo;
import it.andrea.balasso.web.application.common.dbo.QuestionSolutionDbo;

public interface IQuestionSolutionDao {

    QuestionSolutionDbo insertOrUpdateSolutionToQuestion(QuestionSolutionDbo questionSolutionDto);

    QuestionSolutionAcceptanceDbo insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDto);

}
