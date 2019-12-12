package com.assignment.status_data_service.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.status_data_service.models.Status;

@RestController
@RequestMapping("/statusdata")
public class StatusResource {
	@RequestMapping("/{vehicleId}")
	public Status getStatus(@PathVariable("vehicleId") String vehicleId) {
		return new Status(vehicleId, true);
	}
}