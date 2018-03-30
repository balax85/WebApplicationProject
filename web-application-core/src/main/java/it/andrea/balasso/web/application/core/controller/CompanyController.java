package it.andrea.balasso.web.application.core.controller;

import it.andrea.balasso.web.application.core.dto.CompanyDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyDto insertOrUpdateCompany(@RequestBody CompanyDto companyDto) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyDto get(@PathVariable(name = "id") Long id) {
        return null;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyDto> find(@RequestParam(name = "name", required = false) String name,
                                 @RequestParam(name = "country", required = false) String country,
                                 @RequestParam(name = "address", required = false) String address) {
        return null;
    }

}
