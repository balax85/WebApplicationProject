package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionDto;

public interface IQuestionSolutionService {

    QuestionSolutionDto insertOrUpdateSolutionToQuestion(QuestionSolutionDto questionSolutionDto);

    QuestionSolutionAcceptanceDto insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto);

}
