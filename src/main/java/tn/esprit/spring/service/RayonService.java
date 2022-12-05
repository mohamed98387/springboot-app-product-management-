package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;

public interface RayonService {
	List<Rayon> retrieveAllRayons();
Rayon addRayon(Rayon r);

	

	Rayon retrieveRayon(Long id);
}
