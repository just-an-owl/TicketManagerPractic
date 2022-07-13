package com.company.untitled1.screen.ticket;

import com.company.untitled1.app.TicketManager;
import io.jmix.ui.Dialogs;
import io.jmix.ui.component.Button;
import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
public class TicketEdit extends StandardEditor<Ticket> {
    @Autowired
    private Dialogs dialogs;

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
            if(!TicketManager.checkTicket(this.getEditedEntity().getTrip(), this.getEditedEntity().getDepartureDate(), this.getEditedEntity().getArrivalDate())){
                dialogs.createMessageDialog().withCaption("Ошибка добавления билета").withMessage("В выбранной поездке билет на данный промежуток времени уже существует. Проверьте дату и времени отъезда и прибытия.").show();
            }
            else{
                this.closeWithCommit();
            }
    }
}