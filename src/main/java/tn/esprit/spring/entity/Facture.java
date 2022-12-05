package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Facture implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	
	private float montantFacture;
	
	private float montantRemise;
	
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	
	private boolean active;
	
	@ManyToOne
	@JoinColumn(name="clientId")
	@JsonIgnore
	private Client client;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "facture")
	private Set<DetailFacture> detailFactureList;
	

}
