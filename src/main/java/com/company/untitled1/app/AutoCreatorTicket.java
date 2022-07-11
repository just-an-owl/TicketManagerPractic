package com.company.untitled1.app;

import com.company.untitled1.entity.Halt;
import com.company.untitled1.entity.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FluentValuesLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoCreatorTicket {
    @Autowired
    private DataManager dataManager;

    public void checkAndCreateTicket(Halt start, Halt stop){
       // Route testRoute = dataManager.loadValues("select* from(select * from Route on(Route.halts.Id="+start.getId().toString()+"))on(Route.halts.Id="+stop.getId().toString()+")").properties("Route").list().stream().map(e -> e.<Route>getValue("")).findFirst();
    }
}