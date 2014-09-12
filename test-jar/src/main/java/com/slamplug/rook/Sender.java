package com.slamplug.rook;

import org.apache.log4j.Logger;

/**
 * Created by slamplug on 12/09/2014.
 */
public class Sender {

    private static Logger logger = Logger.getLogger(Sender.class.getName());

    public static void sendMessage(String message) {
        logger.info(message);
    }
}
