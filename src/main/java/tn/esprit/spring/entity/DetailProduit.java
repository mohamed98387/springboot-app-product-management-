package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.enume.CategorieClient;
import tn.esprit.spring.enume.CategorieProduit;
import tn.esprit.spring.enume.Profession;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class DetailProduit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDetailProduit;

	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private String dateDerniereModification;

	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
	
	@OneToOne(mappedBy = "detailProduit")
	private Produit produit;

	
	

}
