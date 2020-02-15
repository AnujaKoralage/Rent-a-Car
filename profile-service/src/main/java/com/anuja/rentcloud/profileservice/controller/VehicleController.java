package com.anuja.rentcloud.profileservice.controller;

import com.anuja.rentcloud.commons.model.Vehicle;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;
import com.anuja.rentcloud.profileservice.services.CustomerService;
import com.anuja.rentcloud.profileservice.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping(value = "/{id}")
    public ResponseEntity getVehicleById(@PathVariable("id") Long id) {
        try {
            Vehicle vehiclebyId = vehicleService.getVehiclebyId(id);
            return new ResponseEntity(vehiclebyId, HttpStatus.OK);
        } catch (CustomizedExceptions customizedExceptions) {
            return new ResponseEntity<>("Vehicle dose not exists", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity saveVehicle(@RequestBody Vehicle vehicle){
        try {
            Vehicle save = vehicleService.save(vehicle);
            return new ResponseEntity(vehicle, HttpStatus.CREATED);
        } catch (CustomizedExceptions customizedExceptions) {
            customizedExceptions.printStackTrace();
            return new ResponseEntity("Duplicate vehicle", HttpStatus.BAD_REQUEST);
        }
    }

}
