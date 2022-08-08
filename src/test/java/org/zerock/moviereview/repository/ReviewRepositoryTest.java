package org.zerock.moviereview.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.moviereview.entity.Member;
import org.zerock.moviereview.entity.Movie;
import org.zerock.moviereview.entity.Review;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReviewRepositoryTest {

    @Autowired ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews() {

        IntStream.rangeClosed(1, 200).forEach(i -> {

            Long mno = (long)(Math.random() * 100) + 1;

            Long mid = (long)(Math.random() * 100) + 1;

            Member member = Member.builder().mid(mid).build();

            Movie movie = Movie.builder().mno(mno).build();

            Review review = Review.builder()
                    .member(member)
                    .movie(movie)
                    .grade((int)(Math.random() * 5) + 1)
                    .text("review..." + i)
                    .build();

            reviewRepository.save(review);
        });
    }
}