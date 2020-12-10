package edu.epam.shape.reader;

import edu.epam.shape.exception.CubeFactoryException;
import edu.epam.shape.exception.DataReaderException;
import edu.epam.shape.parser.impl.CubeParse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);
    private static final String PATH = "src//main//resources//data.txt";

    public List readShopFromFile(String url) throws DataReaderException {
        List file = new ArrayList<String>();
        try {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(url));
            } catch (FileNotFoundException e){
                reader = new BufferedReader(new FileReader(PATH));
            }
            String read;
            while ((read = reader.readLine()) != null) {
                file.add(read);
            }
        } catch (IOException e) {
            throw new DataReaderException(e);
        }
        try {
            return new CubeParse().parse(file);
        } catch (CubeFactoryException e) {
            throw new DataReaderException(e);
        }
    }
}

