package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.QuestionSolutionAcceptanceDbo;
import it.andrea.balasso.web.application.common.dto.QuestionSolutionAcceptanceDto;
import it.andrea.balasso.web.application.common.entity.QuestionSolutionAcceptance;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionSolutionAcceptanceMapper {

    QuestionSolutionAcceptanceDbo dto2dbo(QuestionSolutionAcceptanceDto questionSolutionAcceptanceDto);

    QuestionSolutionAcceptance dbo2entity(QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDbo);

    QuestionSolutionAcceptanceDbo entity2dbo(QuestionSolutionAcceptance questionSolutionAcceptance);

    QuestionSolutionAcceptanceDto dbo2dto(QuestionSolutionAcceptanceDbo questionSolutionAcceptanceDbo);

}
