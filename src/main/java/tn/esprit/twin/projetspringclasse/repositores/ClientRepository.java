package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{
}
