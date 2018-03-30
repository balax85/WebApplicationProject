package it.andrea.balasso.web.application.core.service;

import it.andrea.balasso.web.application.core.dto.InterviewDto;

import java.util.List;

public interface IInterviewService {

    InterviewDto insertOrUpdateInterview(InterviewDto interviewDto);

    List<InterviewDto> getInterviews();

}
