package test;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger  log = Logger.getLogger(Test.class.getName());
		System.out.println(Test.class);
		log.info("..");
	}
}
