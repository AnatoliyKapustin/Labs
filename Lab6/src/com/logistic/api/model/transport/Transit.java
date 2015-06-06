package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface Transit {
    public PostOffice[] getTransitOffices();
    public double getPrice();
}
