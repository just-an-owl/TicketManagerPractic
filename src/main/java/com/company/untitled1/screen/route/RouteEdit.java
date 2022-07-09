package com.company.untitled1.screen.route;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Route;

@UiController("Route.edit")
@UiDescriptor("route-edit.xml")
@EditedEntityContainer("routeDc")
public class RouteEdit extends StandardEditor<Route> {
}