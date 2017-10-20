package rembau.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("..");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
            logger.error("", e);
        }
        logger.debug("1111");
	}
}
