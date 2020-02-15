package com.anuja.rentcloud.profileservice.services.servicesImpl;

import com.anuja.rentcloud.commons.model.Vehicle;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;
import com.anuja.rentcloud.profileservice.repository.VehicleRepository;
import com.anuja.rentcloud.profileservice.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle getVehiclebyId(Long id) throws CustomizedExceptions {
        Vehicle vehicleById = vehicleRepository.getVehicleById(id);
        if (vehicleById == null) {
            throw new CustomizedExceptions("No vehicle found");
        }
        return vehicleById;
    }

    @Override
    public Vehicle save(Vehicle vehicle) throws CustomizedExceptions {
        if (vehicleRepository.getVehicleById(vehicle.getId()) != null) {
            throw new CustomizedExceptions("Vehicle exists");
        }
        return vehicleRepository.save(vehicle);
    }
}
