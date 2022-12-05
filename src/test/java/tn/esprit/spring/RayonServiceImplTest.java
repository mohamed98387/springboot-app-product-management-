package tn.esprit.spring;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.RayonService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RayonServiceImplTest {
@Autowired
RayonService rayonService;
@Test
public void testAddrayon() {
	List<Rayon> rayons = rayonService.retrieveAllRayons();
	int expected=rayons.size();
Rayon r = new Rayon();
r.setLibelle("rayon libelle");
r.setCode("1234");

Rayon savedRayon=rayonService.addRayon(r);
assertEquals(expected+1, rayonService.retrieveAllRayons().size());
log.info("rayon added");
assertNotNull(savedRayon.getLibelle());
//stockService.deleteStock(savedStock.getIdStock());
}}