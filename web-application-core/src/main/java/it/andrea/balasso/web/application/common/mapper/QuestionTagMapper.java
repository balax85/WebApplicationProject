package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.QuestionTagDbo;
import it.andrea.balasso.web.application.common.dto.QuestionTagDto;
import it.andrea.balasso.web.application.common.entity.QuestionTag;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionTagMapper {

    QuestionTagDbo dto2dbo(QuestionTagDto questionTagDto);

    QuestionTag dbo2entity(QuestionTagDbo questionTagDbo);

    QuestionTagDbo entity2dbo(QuestionTag questionTag);

    QuestionTagDto dbo2dto(QuestionTagDbo questionTagDbo);

}
