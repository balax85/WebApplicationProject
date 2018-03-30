package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.DepartmentDbo;
import it.andrea.balasso.web.application.common.dto.DepartmentDto;
import it.andrea.balasso.web.application.common.entity.Department;
import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentDbo dto2dbo(DepartmentDto departmentDto);

    Department dbo2entity(DepartmentDbo departmentDbo);

    DepartmentDbo entity2dbo(Department department);

    DepartmentDto dbo2dto(DepartmentDbo departmentDbo);
}
