package tn.esprit.spring.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.ClientServiceImplTest;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {
@Autowired
ClientRepository clientRepository;

@Override
public List<Client> retrieveAllClients() {
	List<Client> clients=	(List<Client>) clientRepository.findAll();
for(Client client:clients){
	log.info("client="+client);
}
	
	return clients;
	
}

@Override
public Client addClient(Client c) {
	
	return (Client) clientRepository.save(c)  ;
}

@Override
public void deleteClient(Long id) {

	clientRepository.deleteById(id);
}

@Override
public Client updateClient(Client c) {
	
	return (Client) clientRepository.save(c) ;
}

@Override
public Client retrieveClient(Long id) {

	return (Client) clientRepository.findById(id).orElse(null);
}

@Override
public List<Client> getClientWithDate(String d1, String d2) throws ParseException {
	// TODO Auto-generated method stub
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	Date date1 = d.parse(d1);
	Date date2 = d.parse(d2);
	return clientRepository.retrieveClientsByDateNaissance(date1,date2);
}

}
