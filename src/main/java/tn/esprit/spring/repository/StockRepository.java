package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Stock;
@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {
	Stock findByLibelleStock(String s);
	@Query("SELECT s FROM Stock s ")
	List<Stock> retrieveStock();
}
