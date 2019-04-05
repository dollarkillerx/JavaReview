package com.testlist;

public class GetSet {
    private String name;
    private int age;
    private double weight;
    private String species;

    public GetSet(String name,int age,double weight,String species){
        this.setName(name);
        this.setAge(age);
        this.setSpecies(species);
        this.setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
