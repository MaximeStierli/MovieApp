/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.bean;

import ch.hearc.ig.odi.movieapp.business.Movie;
import ch.hearc.ig.odi.movieapp.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Bean lié à la page personMovieList.xhtml qui affiche la liste des films
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "movieBean")
@RequestScoped
public class MovieBean {

    //injection de la classe Services
    @Inject Services services;
    
    public MovieBean() {
    }
    
    /**
     * Retourne une liste de films
     * @return Une liste de films
     */
    public List<Movie> getMovies(){
        return services.getMoviesList();
    }
}
