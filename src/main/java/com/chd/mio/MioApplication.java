package com.chd.mio;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chd.mio.entity.Service;
import com.chd.mio.entity.Vigile;
import com.chd.mio.entity.Visite;
import com.chd.mio.entity.Visitee;
import com.chd.mio.entity.Visiteur;
import com.chd.mio.repository.ServiceRepository;
import com.chd.mio.repository.VigileRepository;
import com.chd.mio.repository.VisiteRepository;
import com.chd.mio.repository.VisiteeRepository;
import com.chd.mio.repository.VisiteurRepository;

@SpringBootApplication
public class MioApplication implements CommandLineRunner {
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private VigileRepository vigileRepository;
	@Autowired
	private VisiteRepository visiteRepository;
	@Autowired
	private VisiteeRepository visiteeRepository;
	@Autowired 
	private VisiteurRepository visiteurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MioApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
	}

}
