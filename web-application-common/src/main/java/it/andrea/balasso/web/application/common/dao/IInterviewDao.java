package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.InterviewDbo;

import java.util.List;

public interface IInterviewDao {

    InterviewDbo insertOrUpdateInterview(InterviewDbo interviewDto);

    List<InterviewDbo> getInterviews();

}
