package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduit;
	
	private String code;
	
	private String libelle;
	
	private float prixUnitaire;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "produit")
	
	private Set<DetailFacture> detailFactureList;
	
	
	@OneToOne
	@JoinColumn(name="detailProduitId")
	private DetailProduit detailProduit;
	
	@ManyToOne
	@JoinColumn(name="stockId")
	@JsonIgnore
	private Stock stock;
	
	@ManyToOne
	@JoinColumn(name="rayonId")
	@JsonIgnore
	private Rayon rayon;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
@JsonIgnore
	private Set <Fournisseur> fournisseur;
	
	


}
