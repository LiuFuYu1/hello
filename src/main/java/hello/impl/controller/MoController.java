package hello.impl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.impl.domain.Movie;
import hello.impl.service.MoService;

@Controller
public class MoController {

	@Resource
	private MoService moService;
	
	@RequestMapping("selects")
	public String selects(Model model) {
	List selects =	moService.selects();
		model.addAttribute("selects", selects);
		return "selects";
	}
	
	@RequestMapping("add")
	public String add(Model model) {
		
		return "insert";
	}
	
	
	@RequestMapping("insert")
	public boolean addMovie(Movie movie,Integer [] tids) {
		try {
			moService.addMovie(movie,tids);
			return true;
		} catch (Exception e) {
		e.printStackTrace();
		return false;
		
		}
	}
	
}
