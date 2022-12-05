package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;
@Slf4j
@Service
public class FactureServiceImpl implements FactureService  {
	@Autowired
	FactureRepository factureRepository;
	@Autowired
	ClientService clientService;

	@Autowired
	ProduitService produitService;
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures=	(List<Facture>) factureRepository.findAll();
		for(Facture facture:factures){
			log.info("facture="+facture);
		}
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture facture = this.retrieveFacture(id);
		facture.setActive(false);
		this.factureRepository.save(facture);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return this.factureRepository.findById(id).orElse(null);
	}

	
	
	@Override
	public List<Facture> getFactureByClient(Long id) {
		// TODO Auto-generated method stub
		return factureRepository.getFactureByClient(id);
	}
	
	
}
