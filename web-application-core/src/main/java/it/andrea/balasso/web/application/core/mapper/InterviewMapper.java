package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.InterviewDbo;
import it.andrea.balasso.web.application.core.dto.InterviewDto;
import it.andrea.balasso.web.application.core.entity.Interview;
import org.mapstruct.Mapper;

@Mapper
public interface InterviewMapper {

    InterviewDbo dto2dbo(InterviewDto interviewDto);

    Interview dbo2entity(InterviewDbo interviewDbo);

    InterviewDbo entity2dbo(Interview interview);

    InterviewDto dbo2dto(InterviewDbo interviewDbo);

}
