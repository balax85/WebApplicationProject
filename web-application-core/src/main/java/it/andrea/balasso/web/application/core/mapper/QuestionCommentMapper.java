package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.QuestionCommentDbo;
import it.andrea.balasso.web.application.core.dto.QuestionCommentDto;
import it.andrea.balasso.web.application.core.entity.QuestionComment;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionCommentMapper {

    QuestionCommentDbo dto2dbo(QuestionCommentDto questionCommentDto);

    QuestionComment dbo2entity(QuestionCommentDbo questionCommentDbo);

    QuestionCommentDbo entity2dbo(QuestionComment questionComment);

    QuestionCommentDto dbo2dto(QuestionCommentDbo questionCommentDbo);

}
