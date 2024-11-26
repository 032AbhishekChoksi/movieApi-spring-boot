package com.abhishekchoksi.movieApi.repositories;

import com.abhishekchoksi.movieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
