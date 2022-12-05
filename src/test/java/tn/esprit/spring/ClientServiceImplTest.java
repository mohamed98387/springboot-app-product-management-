package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceImplTest {
	@Autowired
	ClientService clientService;
	//@Test
//public void testAddClient() {
	//Client client = new Client();
//	client.setPrenom("mohamed");
//	client.setNom("lajmi");
//	client.setPassword("123456");
//	try {
//		client.setDateNaissance(new SimpleDateFormat("dd/MM/yyyy").parse("26/01/1995"));
//		Client SavedClient = clientService.addClient(client);
		
	//	assertThat(SavedClient).isNotNull();
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

	
	
	//clientService.deleteClient(SavedClient.getIdClient());
		
		

//	}
	@Test
	public void testGetClientWith() {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setPrenom("mohamed");
		client.setNom("lajmi");
		client.setPassword("123456789");
		try {
			client.setDateNaissance(new SimpleDateFormat("dd/MM/yyyy").parse("27/01/1995"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Client SavedClient = clientService.addClient(client);
		assertNotNull(SavedClient);
		log.info("client added");
	//	clientService.deleteClient(SavedClient.getIdClient());
	//	assertNotNull(SavedClient);
		//List<Client> listClient = new ArrayList<Client>();
		//try {
		//	listClient = clientService.getClientWithDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1995"),
	/*				new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1995"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(listClient.size()>0);

		clientService.deleteClient(SavedClient.getIdClient());
		Client c = clientService.retrieveClient(SavedClient.getIdClient());
		assertNull(c);*/

		



	}

	
		
	

}
