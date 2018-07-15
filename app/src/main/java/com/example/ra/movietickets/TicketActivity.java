
package com.example.ra.movietickets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketActivity {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("poster")
    @Expose
    private String poster;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("released")
    @Expose
    private Boolean released;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("director")
    @Expose
    private String director;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getReleased() {
        return released;
    }

    public void setReleased(Boolean released) {
        this.released = released;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
