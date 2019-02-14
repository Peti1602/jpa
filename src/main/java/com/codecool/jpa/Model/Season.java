package com.codecool.jpa.Model;

import javax.persistence.*;

@Entity(name = "Seasons")
public class Season {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    private String overview;
    @ManyToOne
    private Show show;

    private Season() {

    }

    public Season(String title, String overview) {
        this.title = title;
        this.overview = overview;
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

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

}
