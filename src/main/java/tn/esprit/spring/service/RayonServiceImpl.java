package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.RayonRepository;
@Service
public class RayonServiceImpl implements RayonService{
	@Autowired
	RayonRepository rayonRepository;

	@Override
	public Rayon addRayon(Rayon r) {
		// TODO Auto-generated method stub
		return rayonRepository.save(r);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		// TODO Auto-generated method stub
		return rayonRepository.findById(id).orElse(null);
	}

	@Override
	public List<Rayon> retrieveAllRayons() {
		// TODO Auto-generated method stub
		 return (List<Rayon>) rayonRepository.findAll();
	}
	
	
	

}
