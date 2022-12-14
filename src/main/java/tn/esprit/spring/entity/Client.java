package tn.esprit.spring.entity;

import java.io.Serializable;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;

	private String nom;
	
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private String email;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	
	@Enumerated(EnumType.STRING)
	
	private Profession profession;
	
	@OneToMany(mappedBy = "client" ,cascade = CascadeType.ALL)
	
	private Set<Facture> factureList;


	



}
