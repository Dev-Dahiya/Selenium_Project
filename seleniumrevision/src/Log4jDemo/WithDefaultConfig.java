package Log4jDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WithDefaultConfig {
	
	private static final Logger log = LogManager.getLogger(WithDefaultConfig.class.getName());

	public static void main(String[] args) {
		log.debug("Debug message logged");
		log.error("Error message logged");
		log.fatal("Fatal message logged");

	}

}
