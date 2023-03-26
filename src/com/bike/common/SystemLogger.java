
package com.bike.common;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;


public class SystemLogger {
    public static void initLogger(){
        try {
        String path = SystemVariableList.LOGGER_BASE_URL;
            PatternLayout patternLayout = new PatternLayout("%-5p %d{yyyy-MM-dd HH:mm:ss} %F %C %m %n");
            RollingFileAppender appender = new RollingFileAppender(patternLayout, path);
            appender.setMaxFileSize("10MB");
            appender.setName("bikeLogger");
            appender.activateOptions();
            Logger.getRootLogger().addAppender(appender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    
}
