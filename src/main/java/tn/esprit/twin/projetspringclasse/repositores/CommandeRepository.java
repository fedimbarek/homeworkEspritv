package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
