package com.example.finalproject;

public class Food {
    public String name;
    public int kcal = 0;

    public Food(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", kcal=" + kcal +
                '}';
    }
}
