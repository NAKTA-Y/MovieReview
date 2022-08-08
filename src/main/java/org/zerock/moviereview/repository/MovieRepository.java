package org.zerock.moviereview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.moviereview.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
