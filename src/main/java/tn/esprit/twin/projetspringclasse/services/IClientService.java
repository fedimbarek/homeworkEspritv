package tn.esprit.twin.projetspringclasse.services;

import tn.esprit.twin.projetspringclasse.models.Client;
import tn.esprit.twin.projetspringclasse.models.Composant;

import java.util.List;

public interface IClientService {
    List<Client> findAll();

    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Client client);

    List<Client>addClient(List<Client> clients) ;

    List<Client>FindparID(Client client);
}
