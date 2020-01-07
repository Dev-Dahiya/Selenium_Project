package log4j2tutorial19;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());

	public static void main(String[] args) {
		log.trace("Trace message");
		log.debug("Debug message");
		log.info("Info message");
		log.warn("Warn message");
		log.error("Error message");
		log.fatal("Fatal message");
	}

}
