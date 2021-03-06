/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.business;

import ch.hearc.ig.odi.movieapp.exception.UniqueException;
import java.util.HashMap;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private HashMap<Long,Movie> movies;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<Long, Movie> getMovies() {
        return movies;
    }
    
    public void addMovie(Movie movie) throws UniqueException{
        this.movies.put(movie.getId(),movie);
        //Ajoute la personne au film également.
        movie.addPerson(this);
    }
    
    public int countMovies(){
        return movies.size();
    }
}
