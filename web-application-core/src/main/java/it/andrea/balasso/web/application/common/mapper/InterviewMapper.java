package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.InterviewDbo;
import it.andrea.balasso.web.application.common.dto.InterviewDto;
import it.andrea.balasso.web.application.common.entity.Interview;
import org.mapstruct.Mapper;

@Mapper
public interface InterviewMapper {

    InterviewDbo dto2dbo(InterviewDto interviewDto);

    Interview dbo2entity(InterviewDbo interviewDbo);

    InterviewDbo entity2dbo(Interview interview);

    InterviewDto dbo2dto(InterviewDbo interviewDbo);

}
