package com.chd.mio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chd.mio.entity.Visiteur;
@CrossOrigin("*")
@RepositoryRestResource
public interface VisiteurRepository extends JpaRepository<Visiteur, Long>{

}
