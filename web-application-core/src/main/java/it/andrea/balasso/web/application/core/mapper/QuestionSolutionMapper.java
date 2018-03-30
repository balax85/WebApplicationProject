package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.QuestionSolutionDbo;
import it.andrea.balasso.web.application.core.dto.QuestionSolutionDto;
import it.andrea.balasso.web.application.core.entity.QuestionSolution;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionSolutionMapper {

    QuestionSolutionDbo dto2dbo(QuestionSolutionDto questionSolutionDto);

    QuestionSolution dbo2entity(QuestionSolutionDbo questionSolutionDbo);

    QuestionSolutionDbo entity2dbo(QuestionSolution questionSolution);

    QuestionSolutionDto dbo2dto(QuestionSolutionDbo questionSolutionDbo);

}
