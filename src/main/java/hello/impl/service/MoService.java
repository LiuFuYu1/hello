package hello.impl.service;

import java.util.List;

import hello.impl.domain.Movie;

public interface MoService {

	List selects();

	void addMovie(Movie movie, Integer[] tids);
}
