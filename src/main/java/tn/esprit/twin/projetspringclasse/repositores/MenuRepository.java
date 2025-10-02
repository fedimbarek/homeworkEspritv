package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
