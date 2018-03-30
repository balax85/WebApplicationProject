package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {

    CompanyDto insertOrUpdateCompany(CompanyDto companyDto);

    CompanyDto getCompany(Long id);

    List<CompanyDto> findCompanies(String name, String country, String address);

}
