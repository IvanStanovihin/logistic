package ru.stanovihin.model;

import ru.stanovihin.model.database.OrderList;

public class RouteResponse {

    private OrderList[]groupedRoutes;

    public RouteResponse(OrderList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }

    public OrderList[] getGroupedRoutes() {
        return groupedRoutes;
    }

    public void setGroupedRoutes(OrderList[] groupedRoutes) {
        this.groupedRoutes = groupedRoutes;
    }
}
