package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.DetailComposant;

public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long> {
}
