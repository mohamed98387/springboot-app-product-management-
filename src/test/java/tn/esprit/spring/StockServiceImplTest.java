package tn.esprit.spring;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.service.StockService;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StockServiceImplTest {
@Autowired
StockService stockService;
@Autowired
StockRepository stockRepository;
@Test
public void testAddStock() {
	//double recuperation
List<Stock> stocks = stockService.retrieveAllStocks();
int expected=stocks.size();
Stock s = new Stock();
s.setLibelleStock("stock test");
s.setQte(30);
s.setQteMin(300);
Stock savedStock= stockService.addStock(s);
assertEquals(expected+1, stockService.retrieveAllStocks().size());
log.info("stock added");
assertNotNull(savedStock.getLibelleStock());
stockService.deleteStock(savedStock.getIdStock());
System.out.println("-------------------------------");
//sans double recuperation
Stock s2 = new Stock();
s2.setLibelleStock("stock test two");
s2.setQte(30);
s2.setQteMin(300);
Stock savedStocktwo= stockService.addStock(s2);
assertThat(savedStocktwo).isNotNull();
Stock stocktwo = stockRepository.findByLibelleStock("stock test two");
assertThat(stocktwo.getLibelleStock()).isEqualTo("stock test two");

stockService.deleteStock(savedStocktwo.getIdStock());
assertNull(stockRepository.findByLibelleStock("stock test two"));
}}