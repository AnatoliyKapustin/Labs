package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface DeliveryTransport {
    public DeliveryTypes getType();
    public PostOffice getStartPostOffice();
    public PostOffice getDestinationPostOffice();


}
