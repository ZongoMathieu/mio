package com.chd.mio.web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chd.mio.entity.Vigile;

import com.chd.mio.repository.VigileRepository;
@RestController
public class VigileRestService {
	@Autowired
	private VigileRepository vigileRepository;
	
	@RequestMapping(value = "/vigiles", method = RequestMethod.GET)
	public List<Vigile> getVigile(){
		return vigileRepository.findAll();
	}
	
	

}
