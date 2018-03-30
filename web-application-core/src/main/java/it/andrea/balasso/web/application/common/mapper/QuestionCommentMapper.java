package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.QuestionCommentDbo;
import it.andrea.balasso.web.application.common.dto.QuestionCommentDto;
import it.andrea.balasso.web.application.common.entity.QuestionComment;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionCommentMapper {

    QuestionCommentDbo dto2dbo(QuestionCommentDto questionCommentDto);

    QuestionComment dbo2entity(QuestionCommentDbo questionCommentDbo);

    QuestionCommentDbo entity2dbo(QuestionComment questionComment);

    QuestionCommentDto dbo2dto(QuestionCommentDbo questionCommentDbo);

}
