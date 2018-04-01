package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dao.IQuestionSolutionDao;
import it.andrea.balasso.web.application.common.dbo.QuestionSolutionAcceptanceDbo;
import it.andrea.balasso.web.application.common.dbo.QuestionSolutionDbo;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionDto;
import it.andrea.balasso.web.application.common.mapper.QuestionSolutionAcceptanceMapper;
import it.andrea.balasso.web.application.common.mapper.QuestionSolutionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionSolutionService implements IQuestionSolutionService {

    private final QuestionSolutionMapper questionSolutionMapper;

    private final QuestionSolutionAcceptanceMapper questionSolutionAcceptanceMapper;

    private final IQuestionSolutionDao questionSolutionDao;

    @Autowired
    public QuestionSolutionService(QuestionSolutionMapper questionSolutionMapper,
                                   QuestionSolutionAcceptanceMapper questionSolutionAcceptanceMapper, IQuestionSolutionDao questionSolutionDao) {
        this.questionSolutionMapper = questionSolutionMapper;
        this.questionSolutionAcceptanceMapper = questionSolutionAcceptanceMapper;
        this.questionSolutionDao = questionSolutionDao;
    }

    @Override
    public QuestionSolutionDto insertOrUpdateSolutionToQuestion(QuestionSolutionDto questionSolutionDto) {
        QuestionSolutionDbo questionSolutionDbo = questionSolutionMapper.dto2dbo(questionSolutionDto);
        questionSolutionDbo = questionSolutionDao.insertOrUpdateSolutionToQuestion(questionSolutionDbo);
        return questionSolutionMapper.dbo2dto(questionSolutionDbo);
    }

    @Override
    public QuestionSolutionAcceptanceDto insertOrUpdateQuestionSolutionAcceptance(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto) {
        QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDbo = questionSolutionAcceptanceMapper.dto2dbo(questionSolutionAcceptanceDto);
        questionSolutionAcceptanceDbo = questionSolutionDao.insertOrUpdateQuestionSolutionAcceptance(questionSolutionAcceptanceDbo);
        return questionSolutionAcceptanceMapper.dbo2dto(questionSolutionAcceptanceDbo);
    }
}
