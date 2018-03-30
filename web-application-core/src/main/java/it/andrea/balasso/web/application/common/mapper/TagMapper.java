package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.TagDbo;
import it.andrea.balasso.web.application.common.dto.TagDto;
import it.andrea.balasso.web.application.common.entity.Tag;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {

    TagDbo dto2dbo(TagDto tagDto);

    Tag dbo2entity(TagDbo tagDbo);

    TagDbo entity2dbo(Tag tag);

    TagDto dbo2dto(TagDbo tagDbo);

}
