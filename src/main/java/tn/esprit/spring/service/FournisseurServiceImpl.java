package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;
@Service
public class FournisseurServiceImpl implements FournisseurService {
	@Autowired
	FournisseurRepository fournisseurRepo;
	@Override
	public Fournisseur addFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return this.fournisseurRepo.save(fournisseur);
	}

	@Override
	public Fournisseur retriveFournisseur(Long id) {
		// TODO Auto-generated method stub
		return this.fournisseurRepo.findById(id).orElse(null);
	}

}
