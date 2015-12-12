/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.movieapp.business;

import java.util.List;

/**
 *
 * @author Maxime Stierli <maxime.stierli@he-arc.ch>
 */
public class Movie {
    private Long id;
    private String name;
    private String producer;
    private List<Person> people;

    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void addPerson(Person person){
        this.people.add(person);
    }
    
    public int countPeople(){
        return people.size();
    }
}
