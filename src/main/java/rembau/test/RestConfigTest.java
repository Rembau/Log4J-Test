package rembau.test;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RestConfigTest {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String args[]) throws FileNotFoundException {
        PropertyConfigurator.configure(new FileInputStream("G:\\idea\\github\\Log4J-Test\\src\\main\\resources\\log4jRest.properties"));
        logger = LoggerFactory.getLogger(Test.class);
        logger.info("org new");

    }
}
