package com.quang.tttn.repository;

import com.quang.tttn.model.entity.DistributorWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributorWarehouseRepository extends JpaRepository<DistributorWarehouse, Long> {

}