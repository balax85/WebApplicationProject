package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.QuestionSolutionDbo;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionDto;
import it.andrea.balasso.web.application.common.entity.QuestionSolution;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionSolutionMapper {

    QuestionSolutionDbo dto2dbo(QuestionSolutionDto questionSolutionDto);

    QuestionSolution dbo2entity(QuestionSolutionDbo questionSolutionDbo);

    QuestionSolutionDbo entity2dbo(QuestionSolution questionSolution);

    QuestionSolutionDto dbo2dto(QuestionSolutionDbo questionSolutionDbo);

}
