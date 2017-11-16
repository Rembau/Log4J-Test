package rembau.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jRendererTest {
    private final static Logger logger = LogManager.getLogger(Log4jRendererTest.class);

    public static void main(String args[]) {
        Hello hello = new Hello();
        hello.setUser("lin mao");
        hello.setMessage("hello");

        logger.info(hello);
    }
}
