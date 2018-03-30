package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.CompanyFieldDbo;
import it.andrea.balasso.web.application.core.dto.CompanyFieldDto;
import it.andrea.balasso.web.application.core.entity.CompanyField;
import org.mapstruct.Mapper;

@Mapper
public interface CompanyFieldMapper {

    CompanyFieldDbo dto2dbo(CompanyFieldDto companyFieldDto);

    CompanyField dbo2entity(CompanyFieldDbo companyFieldDbo);

    CompanyFieldDbo entity2dbo(CompanyField companyField);

    CompanyFieldDto dbo2dto(CompanyFieldDbo companyFieldDbo);

}
