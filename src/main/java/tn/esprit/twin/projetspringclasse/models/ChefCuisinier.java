package tn.esprit.twin.projetspringclasse.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class ChefCuisinier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    // Relation ManyToMany
    @ManyToMany
    @JoinTable(
            name = "chef_menu",
            joinColumns = @JoinColumn(name = "chef_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private Set<Menu> menus;

    // getters & setters
    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        this.typeChef = typeChef;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
