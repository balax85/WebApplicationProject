package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.CompanyDbo;
import it.andrea.balasso.web.application.common.dto.CompanyDto;
import it.andrea.balasso.web.application.common.entity.Company;
import org.mapstruct.Mapper;

@Mapper
public interface CompanyMapper {

    CompanyDbo dto2dbo(CompanyDto companyDto);

    Company dbo2entity(CompanyDbo companyDbo);

    CompanyDbo entity2dbo(Company company);

    CompanyDto dbo2dto(CompanyDbo companyDbo);

}
