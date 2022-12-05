package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.service.FactureService;

@RestController
@Api(tags = "invoice management")
@RequestMapping("/facture")
public class FactureRestController {

	@Autowired
	FactureService factureService;
	
	
	
	
	// http://localhost:8089/SpringMVC/facture/retrive-invoice-by-client-id/1
	@GetMapping("/retrive-invoice-by-client-id/{client-id}")
	@ApiOperation("get invoice by client id")
	@ResponseBody
	public List<Facture> getInvoiceByClientId(@PathVariable("client-id") Long id) {

		return this.factureService.getFactureByClient(id);
	}

}
