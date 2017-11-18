package rembau.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

public class Test1 {

    public static void main(String[] args) throws FileNotFoundException {

        Logger rembau = LoggerFactory.getLogger("org.rembau.test");
        rembau.info("org.rembau.test");

        Logger test = LoggerFactory.getLogger("org.rembau");
        test.info("org.rembau");

        Logger org = LoggerFactory.getLogger("org");
        org.info("org");

        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
