package com.tugas.ignagungaaw1600872.movielist;

public class Movie {
    private String name, sinopsis, photo;
    private Integer durasi,score;

    public Movie (String name,String sinopsis,String photo,Integer durasi,Integer score){
        this.name = name;
        this.sinopsis = sinopsis;
        this.photo = photo;
        this.durasi = durasi;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Integer getDurasi() {
        return durasi;
    }

    public void setDurasi(Integer durasi) {
        this.durasi = durasi;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String remarks) {
        this.sinopsis = remarks;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
