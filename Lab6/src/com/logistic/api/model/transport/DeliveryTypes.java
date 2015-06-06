package com.logistic.api.model.transport;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public enum DeliveryTypes {
    SEA(10, 2.5), AIR(50, 25.2), LAND(18, 1.26);

    private int speed;
    private double costPerMile;

    private DeliveryTypes(int speed, double costPerMile) {
        this.speed = speed;
        this.costPerMile = costPerMile;
    }

    public int getSpeed() {
        return speed;
    }

    public double getCostPerMile() {
        return costPerMile;
    }
}