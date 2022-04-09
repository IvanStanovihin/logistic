package ru.stanovihin;

public class MainOffline {

//    public static void main(String ... args){
//        ArrayList<GeographyPoint>pointsFromFile = ru.stanovihin.PointExtractor
//                .getPointFromFile("src/main/resources/test_map_point.txt");
//        double [][] distanceMatrix = getDistanceMatrix(pointsFromFile);
//        printMatrix(distanceMatrix, pointsFromFile);
//    }
//
//    public static String getDistance(GeographyPoint point1, GeographyPoint point2){
//        OkHttpClient client = new OkHttpClient();
//        String distance = null;
//        try {
//            ru.stanovihin.RouteUrl routeUrl = new ru.stanovihin.RouteUrl(point1, point2);
//            String strGetUrl = routeUrl.getUrl();
//            Request request = new Request.Builder().url(strGetUrl).get().build();
//            Response response = client.newCall(request).execute();
//            distance = ru.stanovihin.RouteResponseParser.getDistance(response.body().string());
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }
//        return distance;
//    }
//
//    public static double[][] getDistanceMatrix(ArrayList<GeographyPoint>geographyPoints){
//        int matrixSize = geographyPoints.size();
//        double[][]distanceMatrix = new double[matrixSize][matrixSize];
//        for (int i = 0; i < matrixSize; i++){
//            for (int j = 0; j < matrixSize; j++) {
//                if (i == j) {
//                    distanceMatrix[i][j] = 0;
//                } else {
//                    String distance = getDistance(geographyPoints.get(i), geographyPoints.get(j));;
//                    distanceMatrix[i][j] = Float.parseFloat(distance);
//                }
//            }
//        }
//        return distanceMatrix;
//    }
//
//    public static double calculateDistance(GeographyPoint pointFirst, GeographyPoint pointSecond){
//        double latitude1 = pointFirst.getLatitude();
//        double longitude1 = pointFirst.getLongitude();
//        double latitude2 = pointSecond.getLatitude();
//        double longitude2 = pointSecond.getLongitude();
//        double latSqrt = Math.pow((latitude2 - latitude1), 2);
//        double longSqrt = Math.pow((longitude2 - longitude1), 2);
//        double distance = Math.sqrt(latSqrt + longSqrt);
//        return distance >= 0 ? distance : distance * -1;
//    }
//
//    public static void printMatrix(double[][]matrix, ArrayList<GeographyPoint>points){
//        int matrixSize = matrix.length;
//        for (int i = 0; i < matrixSize; i++){
//            System.out.println("От точки " + points.get(i).getAddress() + " до: ");
//            for (int j = 0; j < matrixSize; j++) {
//                if (i == j){
//                    continue;
//                }else {
//                    System.out.println("\u0009" + points.get(j).getAddress() + " расстояние=" + (int)matrix[i][j] + " км");
//                }
//            }
//        }
//    }

}
