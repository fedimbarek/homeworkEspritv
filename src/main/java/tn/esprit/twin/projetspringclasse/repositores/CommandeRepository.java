package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import tn.esprit.twin.projetspringclasse.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    List<Commande> findByClientId(Long idClient);
    List<Commande> findByClientIdAndDateCommandeBetween(Long idClient, Date dateDebut, Date dateFin);
    List<Commande> findByDateCommandeBetweenOrderByNoteDesc(Date dateDebut, Date dateFin);
}

