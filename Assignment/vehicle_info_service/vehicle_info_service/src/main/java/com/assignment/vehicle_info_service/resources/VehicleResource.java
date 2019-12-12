package com.assignment.vehicle_info_service.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.vehicle_info_service.models.Vehicle;

@RestController
@RequestMapping("/vehicles")
public class VehicleResource {
	
	@RequestMapping("/{vin}")
	public Vehicle getVehicleInfo(@PathVariable("vin") String vin) {
		return new Vehicle(vin, "4556g65");
	}
}
