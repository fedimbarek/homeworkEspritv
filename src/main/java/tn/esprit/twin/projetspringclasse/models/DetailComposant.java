package tn.esprit.twin.projetspringclasse.models;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDetailComposant;
    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @OneToOne(mappedBy = "detailComposant") // fait référence au champ dans Composant
    private Composant composant;


    public Long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public TypeComposant getTypeComposant() {
        return typeComposant;
    }

    public void setTypeComposant(TypeComposant typeComposant) {
        this.typeComposant = typeComposant;
    }
}
