package rembau.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws FileNotFoundException {
        logger.info("..");

        Logger org = LoggerFactory.getLogger("org");
        org.info("org");
        Logger rembau = LoggerFactory.getLogger("org.rembau");
        rembau.info("org.rembau");
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
            Test.logger.error("", e);
        }
        Test.logger.debug("1111");
	}
}
