package com.example.listdvmmatch.ressources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.listdvmatch.model.Donneur;
import com.example.listdvmmatch.bdd.model.DonneurMoelleMatchModel;
import com.example.listdvmmatch.repository.DonneurMoelleMatchRepository;
import com.example.listdvmmatch.tools.Tools;

@RestController
@RequestMapping("/p_id")
public class DonneurMoelleMatchRessource {

	@Autowired
	private DonneurMoelleMatchRepository listdvmmatchRepository;
	
	@CrossOrigin
    @GetMapping(value="/{p_id}")
    public List<Donneur> findByp_id(@PathVariable final String p_id) { 
    	List<Donneur> listOut = new ArrayList<Donneur>();
    	List<DonneurMoelleMatchModel> listDonneur =  listdvmmatchRepository.findByIdPatient(Tools.concatId(p_id));
    	for(DonneurMoelleMatchModel donneurModel : listDonneur) {
    		Donneur out = new Donneur(donneurModel);
    		listOut.add(out);
    	}
    	return listOut; 
    }
}
