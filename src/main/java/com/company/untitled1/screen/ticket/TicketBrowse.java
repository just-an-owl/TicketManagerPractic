package com.company.untitled1.screen.ticket;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Ticket;

@UiController("Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
public class TicketBrowse extends StandardLookup<Ticket> {
}