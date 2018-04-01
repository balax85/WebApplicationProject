package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.QuestionCommentDbo;

public interface IQuestioneInterviewDao {

    QuestionCommentDbo addCommentToQuestion(QuestionCommentDbo questionCommentDto);

}
