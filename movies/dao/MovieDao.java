package com.project.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.movies.entity.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {

}
