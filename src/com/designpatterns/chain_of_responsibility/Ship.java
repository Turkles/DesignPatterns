package com.designpatterns.chain_of_responsibility;

/**
 * Created by Filip on 24.05.2017.
 */
public class Ship extends Deliver {
    @Override
    void handlerRequest(Cargo cargo) {

        System.out.println("Paczka jest olbrzymia, dostarczy ja statek");
    }


}
