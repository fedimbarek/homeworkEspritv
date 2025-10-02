package tn.esprit.twin.projetspringclasse.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.twin.projetspringclasse.models.Client;
import tn.esprit.twin.projetspringclasse.repositores.ClientRepository;

import java.util.List;

public class ClientService implements IClientService{


    private ClientRepository clientRepo;

    @Override
    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void deleteClient(Client client) {

    }

    @Override
    public void deleteClient(Long id) {
clientRepo.deleteById(id);
    }

    @Override
    public List<Client> addClient(List<Client> clients) {
        return clientRepo.saveAll(clients);
    }

    @Override
    public List<Client> FindparID(Client client) {
        return List.of();
    }

    @Override
    public List<Client> FindparID(Long idClient) {
        return clientRepo.findById(idClient).orElse();
    }
}
