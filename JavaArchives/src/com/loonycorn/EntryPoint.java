package com.loonycorn;

import org.apache.logging.log4j.Logger; // interface Logger
import org.apache.logging.log4j.LogManager; // class LogManager

public class EntryPoint {

    private String mode;
    private static Logger logger;

    public EntryPoint(String mode) {
        this.mode = mode;

        System.setProperty("log4j.configurationFile",
                "/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/java-archive-jar-building-java-archives/JavaArchives/resources/log4j2.properties");
        this.logger = LogManager.getLogger(EntryPoint.class);

    }

    public void printMode() {
        logger.info("App is running in " + this.mode + " mode.\n");
    }

    public static void main(String[] args) {

        EntryPoint ep = new EntryPoint("DEV");

        ep.printMode();

    }
}

// Building a JAR file:
// https://docs.oracle.com/javase/tutorial/deployment/jar/build.html

// Setting the JAR entry point:
// https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html

// Specification version
// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Package.html#getSpecificationVersion()

// https://logging.apache.org/log4j/2.x/download.html