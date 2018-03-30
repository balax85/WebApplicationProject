package it.andrea.balasso.web.application.core.service;

import it.andrea.balasso.web.application.core.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.core.dto.QuestionSolutionDto;

public interface IQuestionSolutionService {

    QuestionSolutionDto insertOrUpdateSolutionToQuestion(QuestionSolutionDto questionSolutionDto);

    QuestionSolutionAcceptanceDto insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto);

}
