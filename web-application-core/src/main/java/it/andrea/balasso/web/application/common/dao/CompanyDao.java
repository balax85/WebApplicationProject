package it.andrea.balasso.web.application.common.dao;

import it.andrea.balasso.web.application.common.dbo.CompanyDbo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDao implements ICompanyDao {

    @Override
    public CompanyDbo insertOrUpdateCompany(CompanyDbo companyDto) {
        return null;
    }

    @Override
    public CompanyDbo getCompany(Long id) {
        return null;
    }

    @Override
    public List<CompanyDbo> findCompanies(String name, String country, String address) {
        return null;
    }
}
