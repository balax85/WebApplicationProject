package it.andrea.balasso.web.application.core.controller;

import it.andrea.balasso.web.application.core.dto.InterviewDto;
import it.andrea.balasso.web.application.core.service.IInterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class InterviewController {

    private final IInterviewService interviewService;

    @Autowired
    public InterviewController(IInterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public InterviewDto insertOrUpdateInterview(@RequestBody InterviewDto interviewDto) {
        return interviewService.insertOrUpdateInterview(interviewDto);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InterviewDto> getInterviews() {
        return interviewService.getInterviews();
    }

}
