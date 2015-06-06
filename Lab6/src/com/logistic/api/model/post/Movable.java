package com.logistic.api.model.post;

import java.awt.*;

/**
 * Created by AnatoliyKapustin on 06.06.2015.
 */
public interface Movable {
    void moveTo(Point point);
    boolean canMoveTo(Point point);
    Point getPosition();
}
