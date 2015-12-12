/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.bean;

import ch.hearc.ig.odi.movieapp.business.Person;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Bean lié à la page personMovieList.xhtml qui affiche la liste des personnes
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "personBean")
@RequestScoped
public class PersonBean {
    //injection de la classe Services
    @Inject Services services;
    
    public PersonBean() {
    }
    
    /**
     * Retourne une liste de personnes
     * @return Une liste de personnes
     */
    public List<Person> getCustomers(){
        return services.getPeopleList();
    }
}
