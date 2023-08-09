package com.loonycorn;

public class EntryPoint {

    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.format("App is running in %s mode.\n", this.mode);
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