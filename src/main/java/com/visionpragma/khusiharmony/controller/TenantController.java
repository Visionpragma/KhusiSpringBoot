package com.visionpragma.khusiharmony.controller;

import com.visionpragma.khusiharmony.model.Tenant;
import com.visionpragma.khusiharmony.service.TenantService;
import com.visionpragma.khusiharmony.service.TenantServiceImpl;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/tenant")
@CrossOrigin

public class TenantController {
    @Autowired
    private TenantService tenantService;

    @PostMapping("/add")
    public String add(@RequestBody Tenant tenant){
        tenantService.saveTenant(tenant);
                return "New tentat is added";
    }

}
