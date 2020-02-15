package com.anuja.rentcloud.profileservice.services;

import com.anuja.rentcloud.commons.model.Vehicle;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;

public interface VehicleService {
    public Vehicle getVehiclebyId(Long id) throws CustomizedExceptions;
    public Vehicle save(Vehicle vehicle) throws CustomizedExceptions;
}
