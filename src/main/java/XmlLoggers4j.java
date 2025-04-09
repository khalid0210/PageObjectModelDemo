import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import java.nio.file.Paths;

public class XmlLoggers4j {
    static Logger logger = LogManager.getLogger(XmlLoggers4j.class);

    public static void main(String[] args) {
        // Load log4j2.xml configuration programmatically
        String configFilePath = Paths.get("log4j.xml").toAbsolutePath().toString();
        Configurator.initialize(null, configFilePath);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
