package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.InterviewDto;

import java.util.List;

public interface IInterviewService {

    InterviewDto insertOrUpdateInterview(InterviewDto interviewDto);

    List<InterviewDto> getInterviews();

}
