package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.CompanyDbo;
import it.andrea.balasso.web.application.core.dto.CompanyDto;
import it.andrea.balasso.web.application.core.entity.Company;
import org.mapstruct.Mapper;

@Mapper
public interface CompanyMapper {

    CompanyDbo dto2dbo(CompanyDto companyDto);

    Company dbo2entity(CompanyDbo companyDbo);

    CompanyDbo entity2dbo(Company company);

    CompanyDto dbo2dto(CompanyDbo companyDbo);

}
