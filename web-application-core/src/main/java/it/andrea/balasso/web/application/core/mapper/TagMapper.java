package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.TagDbo;
import it.andrea.balasso.web.application.core.dto.TagDto;
import it.andrea.balasso.web.application.core.entity.Tag;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {

    TagDbo dto2dbo(TagDto tagDto);

    Tag dbo2entity(TagDbo tagDbo);

    TagDbo entity2dbo(Tag tag);

    TagDto dbo2dto(TagDbo tagDbo);

}
