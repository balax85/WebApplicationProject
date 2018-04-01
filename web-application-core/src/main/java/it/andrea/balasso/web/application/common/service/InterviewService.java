package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dao.IInterviewDao;
import it.andrea.balasso.web.application.common.dbo.InterviewDbo;
import it.andrea.balasso.web.application.common.dto.InterviewDto;
import it.andrea.balasso.web.application.common.mapper.InterviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService implements IInterviewService {

    private final InterviewMapper interviewMapper;

    private final IInterviewDao interviewDao;

    @Autowired
    public InterviewService(InterviewMapper interviewMapper, IInterviewDao interviewDao) {
        this.interviewMapper = interviewMapper;
        this.interviewDao = interviewDao;
    }

    @Override
    public InterviewDto insertOrUpdateInterview(InterviewDto interviewDto) {
        InterviewDbo interviewDbo = interviewMapper.dto2dbo(interviewDto);
        interviewDbo = interviewDao.insertOrUpdateInterview(interviewDbo);
        return interviewMapper.dbo2dto(interviewDbo);
    }

    @Override
    public List<InterviewDto> getInterviews() {
        return null;
    }
}
