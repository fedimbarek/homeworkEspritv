package tn.esprit.twin.projetspringclasse.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.twin.projetspringclasse.models.Menu;
import java.util.List;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByTypeMenuAndComposantsPrixGreaterThan(String typeMenu, Double prix);

}

