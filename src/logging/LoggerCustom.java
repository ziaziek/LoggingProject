/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

import org.apache.log4j.Level;
import org.apache.log4j.Priority;

/**
 * This class is awrapper for the standard org.log4j logger to avoid direct referencing to the log4j library
 * when a project references already to the LooggingProject. It is, however, possible to extends this class
 * and add new functionalities, if required.
 * @author Przemysław
 */
public class LoggerCustom extends org.apache.log4j.Logger {
    
    public LoggerCustom(String loggerName){
        super(loggerName);
    }
    
    @Override
    public void error(Object msg, Throwable t){
        super.error(msg, t);
    }
    
    @Override
    public void info(Object msg){
        super.log(Priority.INFO, msg);
    }
    
    @Override
    public void warn(Object msg){
        super.warn(msg);
    }
    
    @Override
    public void warn(Object msg, Throwable t){
        super.warn(msg, t);
    }
    public Level getLoggingLevel(){
        return super.getLevel();
    }
    
        public static LoggerCustom getLogger(String name){
            return new LoggerCustom(name);
    }
                
}
