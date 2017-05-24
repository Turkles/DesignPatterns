package com.designpatterns.chain_of_responsibility;

/**
 * Created by Filip on 24.05.2017.
 */
public abstract class Deliver {
    Deliver nextDeliver;

    public void setNextDeliver(Deliver nextDeliver) {
        this.nextDeliver = nextDeliver;
    }

    abstract void handlerRequest(Cargo cargo);
}
