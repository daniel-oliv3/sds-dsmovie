package com.sapup3.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapup3.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
