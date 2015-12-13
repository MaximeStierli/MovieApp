/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.bean;

import ch.hearc.ig.odi.movieapp.business.Movie;
import ch.hearc.ig.odi.movieapp.business.Person;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Ce bean est lié à la page personDetails.xhtml qui affiche le détail d'une personne
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "personDetailsBean")
@RequestScoped
public class personDetailsBean {

    @Inject Services services;
    private Person person;
    
    
    public personDetailsBean() {
    }
    
    /**
     * Méthode qui reçoit la personne à afficher sur la page.
     * @param pers Le client à afficher
     * @return "show" si la personne est valide, "error" si le paramètre est null
     */
    public String showPerson(Person pers){
        if(pers != null){
            person = pers;
            return "show";
        }else{
            person = null;
            return "error";
        }
    }
    
    /**
     * Retourne les films de la personne, ou un ArrayList vide si la personne n'est pas valide
     * @return Les films de la personne
     */
    public List<Movie> getMovies(){
        if(person == null){
            return new ArrayList();
        }
        
        return new ArrayList(person.getMovies().values());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
