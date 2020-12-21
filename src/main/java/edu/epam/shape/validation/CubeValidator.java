package edu.epam.shape.validation;

import edu.epam.shape.entity.Point;

public class CubeValidator {
    public static boolean isCubeValid(double side, Point point){
        boolean result = true;
        if(side<=0){
            result = false;
        }
        return result;
    }
}
