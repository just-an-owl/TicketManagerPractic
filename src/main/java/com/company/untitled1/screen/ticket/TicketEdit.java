package com.company.untitled1.screen.ticket;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Ticket;

@UiController("Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
public class TicketEdit extends StandardEditor<Ticket> {
}