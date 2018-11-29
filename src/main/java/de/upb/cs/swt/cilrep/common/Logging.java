package de.upb.cs.swt.cilrep.common;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static Logger LOGGER;
    public static Logger getLogger(String className){
        LOGGER = Logger.getLogger(className);
        return LOGGER;
    }

    public static void log(String className, Level level, String message){
        Logging.getLogger(className).log(level, message);
    }
}
