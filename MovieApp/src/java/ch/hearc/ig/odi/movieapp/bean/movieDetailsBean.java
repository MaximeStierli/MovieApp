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
 * Ce bean est lié à la page movieDetails.xhtml qui affiche le détail d'un film
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
@Named(value = "movieDetailsBean")
@RequestScoped
public class movieDetailsBean {

    @Inject Services services;
    private Movie movie;
    
    
    public movieDetailsBean() {
    }
    
    /**
     * Méthode qui reçoit le film à afficher sur la page.
     * @param mov Le film à afficher
     * @return "show" si le film est valide, "error" si le paramètre est null
     */
    public String showMovie(Movie mov){
        if(mov != null){
            movie = mov;
            return "show";
        }else{
            movie = null;
            return "error";
        }
    }
    
    /**
     * Retourne les personnes du film, ou un ArrayList vide si le film n'est pas valide
     * @return Les personnes d'un film
     */
    public List<Person> getPeople(){
        if(movie == null){
            return new ArrayList();
        }
        
        return new ArrayList(movie.getPeople().values());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
