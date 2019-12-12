package com.assignment.vehicle_catalog_service.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.assignment.vehicle_catalog_service.models.CatalogItem;
import com.assignment.vehicle_catalog_service.models.Status;
import com.assignment.vehicle_catalog_service.models.Vehicle;


@RestController
@RequestMapping("/catalog")
public class VehicleCatalogResource {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		RestTemplate restTemplate = new RestTemplate();
		
				List<Status>statuses = Arrays.asList(
				new Status("fr343", false),
				new Status("k7fj7", true)
				);
		
		return statuses.stream().map(status ->{
			Vehicle vehicle = restTemplate.getForObject("http://localhost:8082/vehicles/"+status.getVin(), Vehicle.class);
			return new CatalogItem("Test", "d",vehicle.getVin(),vehicle.getRegNo(),status.isStatus());
		})
				.collect(Collectors.toList());
		
	}

}
