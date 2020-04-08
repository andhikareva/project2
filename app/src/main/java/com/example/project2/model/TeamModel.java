package com.example.project2.model;

import java.sql.RowId;

public class TeamModel {

    private int logo;
    private String name;
    private String row;

    public TeamModel(int logo, String name, String row) {
        this.logo = logo;
        this.name = name;
        this.row = row;
    }

    public int getLogo() {return logo;}
    public void setLogo(int logo) { this.logo = logo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRow() { return row; }
    public void setRow(String row) { this.row = row; }
}
