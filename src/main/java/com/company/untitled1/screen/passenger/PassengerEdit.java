package com.company.untitled1.screen.passenger;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Passenger;

@UiController("Passenger.edit")
@UiDescriptor("passenger-edit.xml")
@EditedEntityContainer("passengerDc")
public class PassengerEdit extends StandardEditor<Passenger> {
}