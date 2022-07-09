package com.company.untitled1.screen.trip;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Trip;

@UiController("Trip.edit")
@UiDescriptor("trip-edit.xml")
@EditedEntityContainer("tripDc")
public class TripEdit extends StandardEditor<Trip> {
}