package it.andrea.balasso.web.application.core.controller;

import it.andrea.balasso.web.application.core.dto.CompanyDto;
import it.andrea.balasso.web.application.core.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final ICompanyService companyService;

    @Autowired
    public CompanyController(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyDto insertOrUpdateCompany(@RequestBody CompanyDto companyDto) {
        return companyService.insertOrUpdateCompany(companyDto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyDto getCompany(@PathVariable(name = "id") Long id) {
        return companyService.getCompany(id);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyDto> findCompanies(@RequestParam(name = "name", required = false) String name,
                                 @RequestParam(name = "country", required = false) String country,
                                 @RequestParam(name = "address", required = false) String address) {
        return companyService.findCompanies(name, country, address);
    }

}
