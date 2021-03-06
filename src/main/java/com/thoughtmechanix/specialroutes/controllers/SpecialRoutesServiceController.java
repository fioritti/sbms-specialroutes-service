package com.thoughtmechanix.specialroutes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtmechanix.specialroutes.model.AbTestingRoute;
import com.thoughtmechanix.specialroutes.services.AbTestingRouteService;

@RestController
@RequestMapping(value="v1/route/")
public class SpecialRoutesServiceController {
	
	@Autowired
	private AbTestingRouteService routeService;
	
	@RequestMapping(value="abtesting/{serviceName}",method = RequestMethod.GET)
	public AbTestingRoute abTestings(@PathVariable("serviceName") String serviceName ) {
		return routeService.getRoute(serviceName);
	}

}
