package com.company.untitled1.app;

import com.company.untitled1.entity.Ticket;
import com.company.untitled1.entity.Trip;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TicketManager {
    @Autowired
    private DataManager dataManager;

    public static boolean checkTicket(Trip trip, LocalDateTime start, LocalDateTime stop) {
        for (Ticket i : trip.getTickets()
        ) {
            if (start.getDayOfYear() >= i.getDepartureDate().getDayOfYear() &&
                    i.getArrivalDate().getDayOfYear() >= start.getDayOfYear() &&
                    i.getDepartureDate().getHour() <= start.getHour() &&
                    i.getDepartureDate().getMinute() < start.getMinute() &&
                    i.getArrivalDate().getHour() >= start.getHour() &&
                    i.getArrivalDate().getMinute() > start.getMinute()) {
                return false;
            }
            if (i.getDepartureDate().getDayOfYear() <= stop.getDayOfYear() &&
                    i.getDepartureDate().getHour() <= stop.getHour() &&
                    i.getDepartureDate().getMinute() < stop.getMinute() &&
                    i.getArrivalDate().getDayOfYear() >= stop.getDayOfYear() &&
                    i.getArrivalDate().getHour() >= stop.getHour() &&
                    i.getArrivalDate().getMinute() > stop.getMinute()) {
                return false;
            }

        }
        return true;
    }
}