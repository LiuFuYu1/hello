package hello.impl.VO;

import hello.impl.domain.Movie;

public class MovieVO extends Movie{

	private String tname;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "MovieVO [tname=" + tname + "]";
	}

	 
	
}
