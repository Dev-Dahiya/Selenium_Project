package testpackage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ToFilleWithConfig {
	private static final Logger log = LogManager.getLogger(ToFilleWithConfig.class.getName());

	public static void main(String[] args) {
		log.trace("Trace message logged");
		log.debug("Debug message logged");
		log.info("Info message logged");
		log.error("Error message logged");
		log.fatal("Fatal message logged");

	}

}
