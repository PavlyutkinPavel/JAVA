package com.patterns.singleton;

//class for Singleton
public class Belaz {
    public int cost;
    public double weight;

    private static Belaz belaz;

    private Belaz(int cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public static Belaz createBelaz(int cost, double weight){
        if(belaz == null){
            belaz = new Belaz(cost, weight);
        }
        return belaz;
    }
}