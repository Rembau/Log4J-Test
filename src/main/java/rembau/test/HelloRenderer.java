package rembau.test;

import org.apache.log4j.or.ObjectRenderer;

public class HelloRenderer implements ObjectRenderer {
    @Override
    public String doRender(Object o) {
        Hello hello = (Hello) o;
        return hello.getUser() + ": " + hello.getMessage();
    }
}