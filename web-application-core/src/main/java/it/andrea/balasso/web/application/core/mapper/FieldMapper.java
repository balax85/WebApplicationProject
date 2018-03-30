package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.FieldDbo;
import it.andrea.balasso.web.application.core.dto.FieldDto;
import it.andrea.balasso.web.application.core.entity.Field;
import org.mapstruct.Mapper;

@Mapper
public interface FieldMapper {

    FieldDbo dto2dbo(FieldDto departmentDto);

    Field dbo2entity(FieldDbo departmentDbo);

    FieldDbo entity2dbo(Field department);

    FieldDto dbo2dto(FieldDbo departmentDbo);

}
