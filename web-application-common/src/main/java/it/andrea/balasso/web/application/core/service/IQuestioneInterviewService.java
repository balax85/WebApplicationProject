package it.andrea.balasso.web.application.core.service;

import it.andrea.balasso.web.application.core.dto.QuestionCommentDto;

public interface IQuestioneInterviewService {

    QuestionCommentDto addCommentToQuestion(QuestionCommentDto questionCommentDto);

}
