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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);
    private static final String PATH = "data//data.txt";

    public List<String> readShopFromFile(String path) throws DataReaderException {
        List<String> fileData;
        try {
            try {
                fileData = Files.readAllLines(Path.of(path), StandardCharsets.UTF_8);
            } catch (FileNotFoundException e){
                fileData = Files.readAllLines(Path.of(PATH), StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new DataReaderException(e);
        }
        return fileData;
    }
}

