package com.example.listdvmmatch.ressources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.listdvmmatch.bdd.model.ListReceveurModel;
import com.example.listdvmmatch.repository.ListReceveurRepository;

@RestController
@RequestMapping("/greffeur")
public class ListReceveurRessource {

	@Autowired
	private ListReceveurRepository listReceveurRepository;

//	@CrossOrigin
//	@GetMapping(value="/{greffeur}")
//	public List<ListReceveurModel> findAllByGreffeur(@PathVariable final String greffeur) {
//		return listReceveurRepository.findAllByGreffeur(greffeur);
//	}
	
	@CrossOrigin
	@GetMapping(value="/{greffeur}")
	public ResponseEntity<List<ListReceveurModel>> findAllByGreffeur(@PathVariable final String greffeur) {
		List<ListReceveurModel> out = listReceveurRepository.findAllByGreffeur(greffeur);
		if(out.isEmpty()) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(out, HttpStatus.OK);	}
}

//@GetMapping(value="/{greffeur}")
//private  ResponseEntity<List<ListReceveurModel>> findAllByGreffeur(@PathVariable String greffeur) {
//    List<ListReceveurModel> receveurs = ListReceveurRepository.findAllByGreffeur(greffeur);
//    if (CollectionUtils.isEmpty(receveurs)) {
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//    return new ResponseEntity<>(receveurs, HttpStatus.OK);
//}
//}