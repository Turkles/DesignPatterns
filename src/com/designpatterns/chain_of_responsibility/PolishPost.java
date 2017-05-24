package com.designpatterns.chain_of_responsibility;

public class PolishPost extends Deliver {
    double acceptableWeight = 0.5;

    @Override
    void handlerRequest(Cargo cargo) {
        if (cargo.weight < acceptableWeight && cargo.address.equals("Poland")) {
            System.out.println("Paczka zostanie dostarczona przez Pocztę Polską");
        } else {
            super.nextDeliver.handlerRequest(cargo);
        }
    }
}
