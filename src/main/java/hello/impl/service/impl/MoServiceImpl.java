package hello.impl.service.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.impl.dao.MoMapper;
import hello.impl.domain.Movie;
import hello.impl.service.MoService;
@Service
public class MoServiceImpl implements MoService{

	@Resource
	private MoMapper moMapper;

	@Override
	public List selects() {
		// TODO Auto-generated method stub
		return moMapper.selects();
	}

	@Override
	public void addMovie(Movie movie, Integer[] tids) {
		// TODO Auto-generated method stub
	    moMapper.addMovie(movie);
	    
	    for (Integer tid : tids) {
			moMapper.addtype(movie.getMid(),tid);
		}
	    
	    
	}

	
}
