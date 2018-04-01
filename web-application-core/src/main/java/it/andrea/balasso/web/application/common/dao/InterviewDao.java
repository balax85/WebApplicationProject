package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.InterviewDbo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InterviewDao implements IInterviewDao {

    @Override
    public InterviewDbo insertOrUpdateInterview(InterviewDbo interviewDto) {
        return null;
    }

    @Override
    public List<InterviewDbo> getInterviews() {
        return null;
    }
}
