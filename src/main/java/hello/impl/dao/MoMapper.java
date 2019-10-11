package hello.impl.dao;

import java.util.List;

import hello.impl.domain.Movie;

public interface MoMapper {

	List selects();

	void addMovie(Movie movie);

	void addtype(Integer mid, Integer tid);
	
	
}
