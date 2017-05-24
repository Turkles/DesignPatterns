package com.designpatterns.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip on 24.05.2017.
 */
public class OurTransportCourier extends Deliver {

    private List<String> countries;

    public OurTransportCourier() {
        countries = new ArrayList<>();
        countries.add("Poland");
        countries.add("Russia");
        countries.add("Slovenia");
        countries.add("Germany");
    }


    @Override
    void handlerRequest(Cargo cargo) {

        for (String country : countries) {
            if (country.equals(cargo.address)) {
                System.out.println("Paczka zostanie dostarczona przez nasz transport");
                return;
            }
        }
        super.nextDeliver.handlerRequest(cargo);
    }

}
