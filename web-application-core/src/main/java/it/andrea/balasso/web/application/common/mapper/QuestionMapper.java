package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.QuestionDbo;
import it.andrea.balasso.web.application.common.dto.QuestionDto;
import it.andrea.balasso.web.application.common.entity.Question;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapper {

    QuestionDbo dto2dbo(QuestionDto questionDto);

    Question dbo2entity(QuestionDbo questionDbo);

    QuestionDbo entity2dbo(Question question);

    QuestionDto dbo2dto(QuestionDbo questionDbo);

}
