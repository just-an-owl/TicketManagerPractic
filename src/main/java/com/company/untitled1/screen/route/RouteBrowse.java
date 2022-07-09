package com.company.untitled1.screen.route;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Route;

@UiController("Route.browse")
@UiDescriptor("route-browse.xml")
@LookupComponent("routesTable")
public class RouteBrowse extends StandardLookup<Route> {
}