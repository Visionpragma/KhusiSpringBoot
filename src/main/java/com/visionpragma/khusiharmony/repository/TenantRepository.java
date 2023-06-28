package com.visionpragma.khusiharmony.repository;

import com.visionpragma.khusiharmony.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,Integer> {
}
