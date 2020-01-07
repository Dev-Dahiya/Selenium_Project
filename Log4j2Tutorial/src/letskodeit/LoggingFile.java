package letskodeit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFile {
	private static final Logger log = LogManager.getLogger(LoggingFile.class.getName());
	
	public static void main(String[] args) {
		log.trace("Trace message logged-1");
		log.debug("Debug message logged-1");
		log.info("Info message logged-1");
		log.error("Error message logged-1");
		log.fatal("Fatal message logged-1");
	}

}
