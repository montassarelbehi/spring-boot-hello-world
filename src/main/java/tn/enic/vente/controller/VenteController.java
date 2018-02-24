package tn.enic.vente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enic.vente.domain.Vente;
import tn.enic.vente.service.VenteService;

@RequestMapping("/vente")
@RestController
public class VenteController {

	@Autowired
	private VenteService service;

	@RequestMapping("/getVenteByVendeur/{id}")
	public List<Vente> getVenteByVendeur(@PathVariable("id") Long id) {

		return service.getVenteByVendeur(id);
	}
}
