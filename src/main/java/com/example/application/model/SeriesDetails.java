package com.example.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeriesDetails
{
    @Id
    private int id;
    private String name;
    private int seasons;
    private int episodes;
    private int rating;

    public SeriesDetails(){
        super();
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

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SeriesDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seasons=" + seasons +
                ", episodes=" + episodes +
                ", rating=" + rating +
                '}';
    }
}
