package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.FieldDbo;
import it.andrea.balasso.web.application.common.dto.FieldDto;
import it.andrea.balasso.web.application.common.entity.Field;
import org.mapstruct.Mapper;

@Mapper
public interface FieldMapper {

    FieldDbo dto2dbo(FieldDto departmentDto);

    Field dbo2entity(FieldDbo departmentDbo);

    FieldDbo entity2dbo(Field department);

    FieldDto dbo2dto(FieldDbo departmentDbo);

}
