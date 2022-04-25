package ru.stanovihin.rest.model;

public class RouteResponse {

    private OrdersList[]groupedRoutes;

    public RouteResponse(OrdersList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }

    public OrdersList[] getGroupedRoutes() {
        return groupedRoutes;
    }

    public void setGroupedRoutes(OrdersList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }
}
