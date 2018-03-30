package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.QuestionDbo;
import it.andrea.balasso.web.application.core.dto.QuestionDto;
import it.andrea.balasso.web.application.core.entity.Question;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapper {

    QuestionDbo dto2dbo(QuestionDto questionDto);

    Question dbo2entity(QuestionDbo questionDbo);

    QuestionDbo entity2dbo(Question question);

    QuestionDto dbo2dto(QuestionDbo questionDbo);

}
