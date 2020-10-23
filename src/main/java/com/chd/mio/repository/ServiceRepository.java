package com.chd.mio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.chd.mio.entity.Service;
@CrossOrigin("*")
@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long>{
	@RestResource(path = "/selectedServices")
	public List<Service> findByLibelleContains(String mc);
	
	@RestResource(path = "/rechercher")
	@Query("select s from Service s where s.libelle like :x")
	public List<Service> chercher(@Param("x") String mc);
	

}
