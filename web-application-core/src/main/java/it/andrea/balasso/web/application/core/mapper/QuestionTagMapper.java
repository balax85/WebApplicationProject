package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.QuestionTagDbo;
import it.andrea.balasso.web.application.core.dto.QuestionTagDto;
import it.andrea.balasso.web.application.core.entity.QuestionTag;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionTagMapper {

    QuestionTagDbo dto2dbo(QuestionTagDto questionTagDto);

    QuestionTag dbo2entity(QuestionTagDbo questionTagDbo);

    QuestionTagDbo entity2dbo(QuestionTag questionTag);

    QuestionTagDto dbo2dto(QuestionTagDbo questionTagDbo);

}
