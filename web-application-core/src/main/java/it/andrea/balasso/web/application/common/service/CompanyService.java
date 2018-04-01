package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dto.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {

    @Override
    public CompanyDto insertOrUpdateCompany(CompanyDto companyDto) {
        return null;
    }

    @Override
    public CompanyDto getCompany(Long id) {
        return null;
    }

    @Override
    public List<CompanyDto> findCompanies(String name, String country, String address) {
        return null;
    }
}
