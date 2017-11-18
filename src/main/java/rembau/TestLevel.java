package rembau;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLevel {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("rembau.test");
        logger.info("..");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
            logger.error("", e);
        }
        logger.debug("1111");
	}
}
