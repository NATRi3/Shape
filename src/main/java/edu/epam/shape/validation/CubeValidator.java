package edu.epam.shape.validation;

import edu.epam.shape.entity.impl.Cube;

public class CubeValidator {
    public static boolean isCubeValid(String[] str){
        boolean result = true;
        for(String s: str) {
            try {
                if(Double.parseDouble(str[0])<=0){
                    result = false;
                }
                double d = Double.parseDouble(s);
            } catch (NumberFormatException nfe) {
                result = false;
            }
        }
        return result;
    }
}
