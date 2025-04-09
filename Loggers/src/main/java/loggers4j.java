import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class loggers4j {

    // Correct way to initialize the logger in Log4j 2.x
    static Logger logger = LogManager.getLogger(loggers4j.class);

    public static void main(String[] args) {
        // Basic configuration for console output with DEBUG level
        Configurator.setRootLevel(org.apache.logging.log4j.Level.DEBUG);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
