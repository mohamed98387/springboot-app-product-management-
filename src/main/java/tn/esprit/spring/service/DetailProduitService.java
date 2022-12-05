package tn.esprit.spring.service;



import java.util.List;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;

public interface DetailProduitService {

	DetailProduit addDetailProduit(Produit detailProduit);
	DetailProduit updateDetailProduct(DetailProduit u);
	void deletedetailProduct(Long id);
	DetailProduit retrieveDetailProduct(Long id);
	List<DetailProduit> retrieveAllProducts();

	
}
