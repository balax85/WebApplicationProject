package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.CompanyDbo;

import java.util.List;

public interface ICompanyDao {

    CompanyDbo insertOrUpdateCompany(CompanyDbo companyDto);

    CompanyDbo getCompany(Long id);

    List<CompanyDbo> findCompanies(String name, String country, String address);

}
