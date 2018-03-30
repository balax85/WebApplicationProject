package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.QuestionSolutionAcceptanceDbo;
import it.andrea.balasso.web.application.core.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.core.entity.QuestionSolutionAcceptance;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionSolutionAcceptanceMapper {

    QuestionSolutionAcceptanceDbo dto2dbo(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto);

    QuestionSolutionAcceptance dbo2entity(QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDbo);

    QuestionSolutionAcceptanceDbo entity2dbo(QuestionSolutionAcceptance questionSolutionAcceptance);

    QuestionSolutionAcceptanceDto dbo2dto(QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDbo);

}
