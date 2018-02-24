package tn.enic.vente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enic.vente.domain.Vendeur;
import tn.enic.vente.domain.Vente;
import tn.enic.vente.repository.VendeurRepository;
import tn.enic.vente.repository.VenteRepository;

@Service
public class VenteService {

	@Autowired
	private VendeurRepository vendeurRepo;

	@Autowired
	private VenteRepository repository;

	public List<Vente> getVenteByVendeur(Long id) {

		Vendeur vendeur = vendeurRepo.findOne(id);
		return repository.findByVendeur(vendeur);

	}

}
