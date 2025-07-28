package com.dos.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {

    private static final Logger lg = LogManager.getLogger();


    public static void debug(String msg){

        lg.debug(msg);
    }

    public static void info(String msg){

        lg.info(msg);
    }

    public static void error(String msg){

        lg.error(msg);
    }




}
