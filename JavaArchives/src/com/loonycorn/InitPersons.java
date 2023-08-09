package com.loonycorn;

import org.apache.logging.log4j.Logger; // interface Logger
import org.apache.logging.log4j.LogManager; // class LogManager

public class InitPersons {

    public static void main(String[] args) {

        System.setProperty("log4j.configurationFile",
                "/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/java-archive-jar-building-java-archives/JavaArchives/resources/log4j2.properties");
        Logger logger = LogManager.getLogger(EntryPoint.class);

        Employee alice = new Employee("Alice", 1, "admin");
        Employee bob = new Employee("Bob", 2, "admin");

        logger.info("Initialized employees: "
                + alice.getName() + ", " + bob.getName());
    }
}
