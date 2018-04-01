package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dao.IQuestioneInterviewDao;
import it.andrea.balasso.web.application.common.dbo.QuestionCommentDbo;
import it.andrea.balasso.web.application.common.dto.QuestionCommentDto;
import it.andrea.balasso.web.application.common.mapper.QuestionCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestioneInterviewService implements IQuestioneInterviewService {

    private final QuestionCommentMapper questionCommentMapper;

    private final IQuestioneInterviewDao questioneInterviewDao;

    @Autowired
    public QuestioneInterviewService(QuestionCommentMapper questionCommentMapper, IQuestioneInterviewDao questioneInterviewDao) {
        this.questionCommentMapper = questionCommentMapper;
        this.questioneInterviewDao = questioneInterviewDao;
    }

    @Override
    public QuestionCommentDto addCommentToQuestion(QuestionCommentDto questionCommentDto) {
        QuestionCommentDbo questionCommentDbo = questionCommentMapper.dto2dbo(questionCommentDto);
        questionCommentDbo = questioneInterviewDao.addCommentToQuestion(questionCommentDbo);
        return questionCommentMapper.dbo2dto(questionCommentDbo);
    }
}
