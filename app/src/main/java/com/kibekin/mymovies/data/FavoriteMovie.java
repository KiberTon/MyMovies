package com.kibekin.mymovies.data;

import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "favorite_movie")
public class FavoriteMovie extends Movie {
    public FavoriteMovie(int id, int voteCount, String title, String originalTitle, String overView, String posterPath, String bigPosterPath, String backDropPath, double voteAverage, String releaseDate) {
        super(id, voteCount, title, originalTitle, overView, posterPath, bigPosterPath, backDropPath, voteAverage, releaseDate);
    }

    @Ignore
    public FavoriteMovie(Movie movie) {
        super(movie.getId(), movie.getVoteCount(), movie.getTitle(), movie.getOriginalTitle(), movie.getOverView(), movie.getPosterPath(), movie.getBigPosterPath(), movie.getBackDropPath(), movie.getVoteAverage(), movie.getReleaseDate());
    }
}

