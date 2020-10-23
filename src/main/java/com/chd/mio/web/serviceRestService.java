package com.chd.mio.web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chd.mio.entity.Service;
import com.chd.mio.repository.ServiceRepository;
@CrossOrigin("*")
@RestController
public class serviceRestService {
	@Autowired
	private ServiceRepository serviceRepository;
	
	public serviceRestService(ServiceRepository serviceRepository) {
		this.serviceRepository=serviceRepository;
	}
	
	@RequestMapping(value = "/tServices", method = RequestMethod.GET)
	public List<Service> getTservice(){
		return serviceRepository.findAll();
	}
	
	
	
	

	
}
