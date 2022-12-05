package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.enume.CategorieClient;
import tn.esprit.spring.enume.Profession;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class DetailFacture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDetailFacture;
	
	private int qte;
	
	private float prixTotal;
	
	private int pourcentageRemise;
	
	private float montantRemise;
	
	@ManyToOne
	@JoinColumn(name="factureId")
	private Facture facture;
	
	@ManyToOne
	
	@JoinColumn(name="produitId")
	private Produit produit;

	

	
}
