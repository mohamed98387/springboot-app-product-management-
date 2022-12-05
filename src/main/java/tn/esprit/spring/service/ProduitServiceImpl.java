package tn.esprit.spring.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService  {

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	StockService stockService;
	
	
	@Autowired
	RayonService rayonService;
	
	@Autowired
	DetailProduitService detailProduitService;
	@Autowired
	FournisseurService fournisseurService;
	@Override
	public List<Produit> retrieveAllProduits() {
		
		return (List<Produit>) produitRepository.findAll();
	}

	@Transactional
	public Produit addProduit(Produit p, Long idStock, Long idRayon) {
		// TODO Auto-generated method stub
		p.setRayon(rayonService.retrieveRayon(idRayon));
		p.setStock(stockService.retrieveStock(idStock));
		DetailProduit d = detailProduitService.addDetailProduit(p);
		p.setDetailProduit(d);
		return produitRepository.save(p);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		
		return produitRepository.findById(id).orElse(null);
	}
	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}
	@Override
	public Produit assignProduitToStock(Long idProduit, Long idStock) {
		Stock s = stockService.retrieveStock(idStock);
		Produit p = retrieveProduit(idProduit);
		p.setStock(s);
		return updateProduit(p);
	}
	@Override
	public Produit unassignProduitToStock(Long idProduit) {
		//Stock s = stockService.retrieveStock(idStock);
		Produit p = retrieveProduit(idProduit);
		p.setStock(null);
		return updateProduit(p);
	}
	
	@Override
	public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

		 Fournisseur s = fournisseurService.retriveFournisseur(fournisseurId);
		Produit p = retrieveProduit(produitId);
		Set<Fournisseur> mySet = new HashSet<Fournisseur>();
		mySet.add(s);
		p.setFournisseur(mySet);
		this.updateProduit(p);

	}
}
