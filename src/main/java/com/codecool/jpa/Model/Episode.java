package com.codecool.jpa.Model;

import javax.persistence.*;

@Entity(name = "Episodes")
public class Episode {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    private String overview;
    @ManyToOne
    private Season season;

    public Episode() {

    }

    public Episode(String title, String overview, Season season) {
        this.title = title;
        this.overview = overview;
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

}
