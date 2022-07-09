package com.company.untitled1.screen.passenger;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Passenger;

@UiController("Passenger.browse")
@UiDescriptor("passenger-browse.xml")
@LookupComponent("passengersTable")
public class PassengerBrowse extends StandardLookup<Passenger> {
}