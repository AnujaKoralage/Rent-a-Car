package com.anuja.rentcloud.profileservice.repository;

import com.anuja.rentcloud.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository <Vehicle, Long> {
    public Vehicle getVehicleById(Long id);
}
