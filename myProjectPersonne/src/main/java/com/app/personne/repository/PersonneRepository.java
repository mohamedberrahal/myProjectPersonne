package com.app.personne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.personne.model.Personne;

public interface PersonneRepository   extends  JpaRepository<Personne, Long>{

}
