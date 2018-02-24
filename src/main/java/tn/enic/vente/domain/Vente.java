package tn.enic.vente.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String libelle;

	@JsonIgnore
	@ManyToOne
	private Vendeur vendeur;

	public Vente() {
		// TODO Auto-generated constructor stub
	}

	public Vente(String libelle, Vendeur vendeur) {
		super();
		this.libelle = libelle;
		this.vendeur = vendeur;
	}

	public Long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

}
