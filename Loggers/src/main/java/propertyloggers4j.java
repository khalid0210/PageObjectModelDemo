import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import java.nio.file.Paths;

public class propertyloggers4j {
    static Logger logger;

    public static void main(String[] args) {
        // Load the log4j2.properties file programmatically
        String log4jConfigFile = Paths.get("log4j.properties").toAbsolutePath().toString();
        Configurator.initialize(null, log4jConfigFile);

        logger = LogManager.getLogger(propertyloggers4j.class);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}

