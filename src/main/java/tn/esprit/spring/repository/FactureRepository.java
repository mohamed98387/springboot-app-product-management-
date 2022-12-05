package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Facture;
@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
	@Query(value="SELECT * FROM Facture f WHERE f.client_id = :idClient" ,nativeQuery = true)
	List<Facture> getFactureByClient(@Param("idClient") Long id );
}
