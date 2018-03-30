package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.QuestionCommentDto;

public interface IQuestioneInterviewService {

    QuestionCommentDto addCommentToQuestion(QuestionCommentDto questionCommentDto);

}
