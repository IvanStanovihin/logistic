package ru.stanovihin;

import ru.stanovihin.model.GeographyPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PointExtractor {

    public static ArrayList<GeographyPoint>getPointFromFile(String filePath){
        ArrayList<GeographyPoint>readPoints = new ArrayList<>();
        Path pathForFile = Paths.get(filePath);
        try(BufferedReader reader = Files.newBufferedReader(pathForFile)){
            String readLine;
            while((readLine = reader.readLine()) != null){
                GeographyPoint pointFromFile = parseStringToPoint(readLine);
                readPoints.add(pointFromFile);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return readPoints;
    }

    public static GeographyPoint parseStringToPoint(String readFileLine){
        String[] lineParams = readFileLine.split(";");
        String address = lineParams[0].trim();
        float latitude = Float.parseFloat(lineParams[1].trim());
        float longitude = Float.parseFloat(lineParams[2].trim());
        GeographyPoint readPoint = new GeographyPoint(address, latitude,longitude);
        return readPoint;
    }
}
