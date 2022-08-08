package org.zerock.moviereview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.moviereview.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
