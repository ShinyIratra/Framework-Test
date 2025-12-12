package app.model;

import java.util.List;
import app.model.Departement;
import app.model.Employe;

public class Employe {
    private int id;
    private String name;
    private List<Departement> departements;

    public Employe() {
    }

    public Employe(int id, String name, List<Departement> departements) {
        this.id = id;
        this.name = name;
        this.departements = departements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departements=" + departements +
                '}';
    }
}