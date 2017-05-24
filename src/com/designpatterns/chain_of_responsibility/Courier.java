package com.designpatterns.chain_of_responsibility;

public class Courier extends Deliver {
    double acceptableWeight = 20;

    @Override
    void handlerRequest(Cargo cargo) {
        if (cargo.weight < acceptableWeight && cargo.address.equals("Poland")) {
            System.out.println("Paczka zostanie dostarczona przez kuriera");
        } else {
            super.nextDeliver.handlerRequest(cargo);
        }
    }
}
