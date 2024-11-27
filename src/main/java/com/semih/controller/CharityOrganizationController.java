package com.semih.controller;

import com.semih.dto.request.CharityOrganizationRequest;
import com.semih.dto.response.CharityOrganizationResponse;
import com.semih.service.CharityOrganizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api")
public class CharityOrganizationController {

    private final CharityOrganizationService charityOrganizationService;

    public CharityOrganizationController(CharityOrganizationService charityOrganizationService) {
        this.charityOrganizationService = charityOrganizationService;
    }

    @GetMapping(path="/getCharityOrganization")
    public CharityOrganizationResponse getCharityOrganizationFindByName(@RequestParam String name) {
       return charityOrganizationService.getCharityOrganizationFindByName(name);
    }

    @GetMapping(path="/listCharityOrganization")
    public List<CharityOrganizationResponse> findAllCharityOrganization() {
        return charityOrganizationService.findAllCharityOrganization();
    }

    @PostMapping(path="/saveCharityOrganization")
    public void saveCharityOrganization(@RequestBody CharityOrganizationRequest charityOrganizationRequest) {
        charityOrganizationService.saveCharityOrganization(charityOrganizationRequest);
    }

    @PutMapping(path="/updateCharityOrganization/{name}")
    public void updateCharityOrganization(@RequestBody CharityOrganizationRequest charityOrganizationRequest,@PathVariable String name) {
        charityOrganizationService.updateCharityOrganization(charityOrganizationRequest,name);
    }

    @DeleteMapping(path="/deleteCharityOrganizationFindById/{id}")
    public void deleteCharityOrganizationById(@PathVariable Long id) {
        charityOrganizationService.deleteCharityOrganizationById(id);
    }

    @DeleteMapping(path="/deleteCharityOrganizationFindByName/{name}")
    public String deleteCharityOrganizationByName(@PathVariable(required = true) String name) {
        if(charityOrganizationService.deleteCharityOrganizationByName(name)) {
            return "Successfully deleted charity organization";
        }
        return "Failed to delete charity organization";
    }



}