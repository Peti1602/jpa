package com.codecool.jpa.Model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Shows")
public class Show {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String overview;
    private List<String> actors;
    @OneToMany(mappedBy = "show")
    private List<Season> seasons;

    private Show() {

    }

    public Show(String title, Category category, String overview, List<String> actors) {
        this.title = title;
        this.category = category;
        this.overview = overview;
        this.actors = actors;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

}
