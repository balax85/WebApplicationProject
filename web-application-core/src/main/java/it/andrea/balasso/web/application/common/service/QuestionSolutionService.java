package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionDto;
import org.springframework.stereotype.Service;

@Service
public class QuestionSolutionService implements IQuestionSolutionService {

    @Override
    public QuestionSolutionDto insertOrUpdateSolutionToQuestion(QuestionSolutionDto questionSolutionDto) {
        return null;
    }

    @Override
    public QuestionSolutionAcceptanceDto insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto) {
        return null;
    }
}
