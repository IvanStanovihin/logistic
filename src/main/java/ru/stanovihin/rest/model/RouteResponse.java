package ru.stanovihin.rest.model;

import ru.stanovihin.model.Order;

public class RouteResponse {

    private RouteList[]groupedRoutes;

    public RouteResponse(RouteList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }

    public RouteList[] getGroupedRoutes() {
        return groupedRoutes;
    }

    public void setGroupedRoutes(RouteList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }
}
