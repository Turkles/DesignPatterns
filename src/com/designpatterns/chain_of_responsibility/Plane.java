package com.designpatterns.chain_of_responsibility;

/**
 * Created by Filip on 24.05.2017.
 */
class Plane extends Deliver {
    double maxWeight = 100;

    @Override
    void handlerRequest(Cargo cargo) {
        if (cargo.weight <= maxWeight) {
            System.out.println("Paczka zostanie dostarczona przez samaolot!");
        } else {
            super.nextDeliver.handlerRequest(cargo);
        }
    }
}