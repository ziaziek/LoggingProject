package logging;

import java.net.URL;
import org.apache.log4j.PropertyConfigurator;


public class LogPc  {

	public static LoggerCustom Pclog=  LoggerCustom
			.getLogger("ResultsGrabberLog");
	
	public static final String pattern = "[%-4r] [%d{ISO8601}] [%t] [%c] [%l] [%-5p] [- %m]%n";

       public static void logConfigure(Class<?> reference) {
        URL ul = reference.getResource("../log4j.properties");
        PropertyConfigurator.configure(ul);
    }
}
