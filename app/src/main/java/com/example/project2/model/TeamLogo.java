package com.example.project2.model;

public class TeamLogo {
    private int face;
    private String name;
    private String posisi;
    private String nomor;

    public TeamLogo(int face, String name, String posisi, String nomor){
        this.face = face;
        this.name = name;
        this.posisi = posisi;
        this.nomor = nomor;
    }

    public TeamLogo(){}

    public int getFace() { return face; }

    public void setFace(int face) { this.face = face; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPosisi() { return posisi; }

    public void setPosisi(String posisi) { this.posisi = posisi; }

    public String getNomor() { return nomor; }

    public void setNomor(String nomor) { this.nomor = nomor; }
}
