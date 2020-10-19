package com.chd.mio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chd.mio.entity.Visiteur;
@RepositoryRestResource
public interface VisiteurRepository extends JpaRepository<Visiteur, Long>{

}
