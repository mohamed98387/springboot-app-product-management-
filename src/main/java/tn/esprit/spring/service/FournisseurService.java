package tn.esprit.spring.service;

import tn.esprit.spring.entity.Fournisseur;

public interface FournisseurService {
	Fournisseur addFournisseur(Fournisseur fournisseur);

	Fournisseur retriveFournisseur(Long id);
}
