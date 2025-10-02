package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Composant;

public interface ComposontRepository extends JpaRepository<Composant, Long> {
}
