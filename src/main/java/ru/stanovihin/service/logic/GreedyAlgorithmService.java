package ru.stanovihin.service.logic;

import ru.stanovihin.model.database.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GreedyAlgorithmService {

    private Set<Integer>visitedPoints;
    private double summaryDistance = 0;

    public GreedyAlgorithmService(){
        this.visitedPoints = new HashSet<>();
        visitedPoints.add(0);
    }

    public ArrayList<Order> calculateRoute(Order[] rawOrders, double[][]distanceMatrix){
        ArrayList<Order>sortedOrders = new ArrayList<Order>();
        sortedOrders.add(rawOrders[0]);
        int counter = 0;
        int index = 0;
        while (counter < rawOrders.length - 1){
            double []distances = distanceMatrix[index];
            int minDistanceIndex = getMinDistanceIndex(distances);
            index = minDistanceIndex;
            summaryDistance += distances[minDistanceIndex];
            visitedPoints.add(minDistanceIndex);
            sortedOrders.add(rawOrders[minDistanceIndex]);
            counter++;
        }
        return sortedOrders;
    }

    private int getMinDistanceIndex(double[]distances){
        int minDistanceIndex = -1;
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < distances.length; i++){
            if (!visitedPoints.contains(i) && distances[i] < minDistance && distances[i] != 0){
                minDistance = distances[i];
                minDistanceIndex = i;
            }
        }
        System.out.println("\n\nMin distance index: " + minDistanceIndex + "; From matrix: ");
        Arrays.stream(distances).forEach(d -> System.out.print(d + " "));
        return minDistanceIndex;
    }

    public Set<Integer> getVisitedPoints() {
        return visitedPoints;
    }

    public void setVisitedPoints(Set<Integer> visitedPoints) {
        this.visitedPoints = visitedPoints;
    }

    public double getSummaryDistance() {
        return summaryDistance;
    }

    public void setSummaryDistance(double summaryDistance) {
        this.summaryDistance = summaryDistance;
    }
}
