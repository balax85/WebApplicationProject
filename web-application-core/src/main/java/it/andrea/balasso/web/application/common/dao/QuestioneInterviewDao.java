package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.QuestionCommentDbo;
import org.springframework.stereotype.Repository;

@Repository
public class QuestioneInterviewDao implements IQuestioneInterviewDao {

    @Override
    public QuestionCommentDbo addCommentToQuestion(QuestionCommentDbo questionCommentDto) {
        return null;
    }
}
