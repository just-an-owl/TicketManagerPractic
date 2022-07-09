package com.company.untitled1.screen.trip;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Trip;

@UiController("Trip.browse")
@UiDescriptor("trip-browse.xml")
@LookupComponent("tripsTable")
public class TripBrowse extends StandardLookup<Trip> {
}