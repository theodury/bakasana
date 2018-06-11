package com.example.listdvmmatch.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.listdvmmatch.bdd.model.MatchModel;
import com.example.listdvmmatch.repository.MatchRepository;


@RestController
@RequestMapping("/matchdvm")

public class MatchRessource {
	
	@Autowired
	private MatchRepository matchRepository;
	
	@CrossOrigin
    @PostMapping(value="/search")
    @ResponseBody
    public MatchModel rechercherdvm(@RequestBody final MatchModel matchparam) {
    	matchRepository.rechercherdvm(matchparam.getOrig(), matchparam.getPp_id());
    	return null;
    }
}
