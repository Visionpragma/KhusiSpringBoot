package com.visionpragma.khusiharmony.service;

import com.visionpragma.khusiharmony.model.Tenant;
import com.visionpragma.khusiharmony.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TenantServiceImpl implements TenantService{

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public Tenant saveTenant(Tenant tenant){
        return tenantRepository.save(tenant);
    }


}