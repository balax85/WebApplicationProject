package it.andrea.balasso.web.application.common.service;

import it.andrea.balasso.web.application.common.dao.ICompanyDao;
import it.andrea.balasso.web.application.common.dbo.CompanyDbo;
import it.andrea.balasso.web.application.common.dto.CompanyDto;
import it.andrea.balasso.web.application.common.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {

    private final CompanyMapper companyMapper;

    private final ICompanyDao companyDao;

    @Autowired
    public CompanyService(CompanyMapper companyMapper, ICompanyDao companyDao) {
        this.companyMapper = companyMapper;
        this.companyDao = companyDao;
    }

    @Override
    public CompanyDto insertOrUpdateCompany(CompanyDto companyDto) {
        CompanyDbo companyDbo = companyMapper.dto2dbo(companyDto);
        companyDbo = companyDao.insertOrUpdateCompany(companyDbo);
        return companyMapper.dbo2dto(companyDbo);
    }

    @Override
    public CompanyDto getCompany(Long id) {
        CompanyDbo companyDbo = companyDao.getCompany(id);
        return companyMapper.dbo2dto(companyDbo);
    }

    @Override
    public List<CompanyDto> findCompanies(String name, String country, String address) {
        return null;
    }
}
