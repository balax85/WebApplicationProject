package it.andrea.balasso.web.application.common.controller;

import it.andrea.balasso.web.application.common.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionDto;
import it.andrea.balasso.web.application.common.service.IQuestioneInterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question/solution")
public class QuestionSolutionController {

    private final IQuestioneInterviewService questioneInterviewService;

    @Autowired
    public QuestionSolutionController(IQuestioneInterviewService questioneInterviewService) {
        this.questioneInterviewService = questioneInterviewService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public QuestionSolutionDto insertOrUpdateSolutionToQuestion(@RequestBody QuestionSolutionDto questionSolutionDto) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public QuestionSolutionAcceptanceDto insertOrUpdateQuestionSolutionAcceptance(@RequestBody QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto) {
        return null;
    }
}
