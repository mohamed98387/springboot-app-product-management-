package tn.esprit.spring.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import tn.esprit.spring.entity.Client;

public interface ClientService {
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	//List <Client> getClientWithDate(Date d1 ,Date d2);

	List<Client> getClientWithDate(String d1, String d2) throws ParseException;
}
