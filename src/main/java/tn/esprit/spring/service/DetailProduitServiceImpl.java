package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.DetailProduitRepository;

@Service
public class DetailProduitServiceImpl implements DetailProduitService{
	@Autowired
	DetailProduitRepository detailProduitRepository;

	@Transactional
	public DetailProduit addDetailProduit(Produit p) {
		p.getDetailProduit().setDateCreation(new Date());
		p.getDetailProduit().setDateDerniereModification(null);
		return detailProduitRepository.save(p.getDetailProduit());

	}

	@Override
	public DetailProduit updateDetailProduct(DetailProduit u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletedetailProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DetailProduit retrieveDetailProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetailProduit> retrieveAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
