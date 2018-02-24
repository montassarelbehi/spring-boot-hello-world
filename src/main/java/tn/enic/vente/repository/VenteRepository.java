package tn.enic.vente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enic.vente.domain.Vendeur;
import tn.enic.vente.domain.Vente;

public interface VenteRepository extends JpaRepository<Vente, Long> {

	public List<Vente> findByVendeur(Vendeur vendeur);

}
