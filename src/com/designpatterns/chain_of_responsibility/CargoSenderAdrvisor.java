package com.designpatterns.chain_of_responsibility;

/**
 * Created by Filip on 24.05.2017.
 */
public class CargoSenderAdrvisor {

    private Deliver firstDeliver = new PolishPost();

    public CargoSenderAdrvisor() {
        Courier courier = new Courier();
        OurTransportCourier ourTransportCourier = new OurTransportCourier();
        Plane plane = new Plane();
        Ship ship = new Ship();

        firstDeliver.setNextDeliver(courier);
        courier.setNextDeliver(ourTransportCourier);
        ourTransportCourier.setNextDeliver(plane);
        plane.setNextDeliver(ship);
        ship.setNextDeliver(null);

    }

    public void adviseSendingWay( Cargo cargo ) {
        firstDeliver.handlerRequest(cargo);

    }
}
