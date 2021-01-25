package com.company.model;

public enum ClothingSize {
    S("Small"), M("Medium"), L("Large");

    private String description;

    ClothingSize(String description){
        this.description = description;
    }

    public String toString(){
        return this.description;
    }
}
