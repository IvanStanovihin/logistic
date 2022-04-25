package ru.stanovihin;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ru.stanovihin.model.GeographyPoint;

import java.io.IOException;
import java.util.ArrayList;

public class MainOffline {
//
//    public static void main(String ... args){
////        ArrayList<GeographyPoint> pointsFromFile = ru.stanovihin.PointExtractor
////                .getPointFromFile("src/main/resources/test_map_point.txt");
////        double [][] distanceMatrix = getDistanceMatrix(pointsFromFile);
////        printMatrix(distanceMatrix, pointsFromFile);
//    }





    public static double calculateDistance(GeographyPoint pointFirst, GeographyPoint pointSecond){
        double latitude1 = pointFirst.getLatitude();
        double longitude1 = pointFirst.getLongitude();
        double latitude2 = pointSecond.getLatitude();
        double longitude2 = pointSecond.getLongitude();
        double latSqrt = Math.pow((latitude2 - latitude1), 2);
        double longSqrt = Math.pow((longitude2 - longitude1), 2);
        double distance = Math.sqrt(latSqrt + longSqrt);
        return distance >= 0 ? distance : distance * -1;
    }

    public static void printMatrix(double[][]matrix, ArrayList<GeographyPoint>points){
        int matrixSize = matrix.length;
        for (int i = 0; i < matrixSize; i++){
            System.out.println("От точки " + points.get(i).getAddress() + " до: ");
            for (int j = 0; j < matrixSize; j++) {
                if (i == j){
                    continue;
                }else {
                    System.out.println("\u0009" + points.get(j).getAddress() + " расстояние=" + (int)matrix[i][j] + " км");
                }
            }
        }
    }

}
