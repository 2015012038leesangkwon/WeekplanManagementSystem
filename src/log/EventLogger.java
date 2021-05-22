package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler fh;
	
	LogManager lm;
	Logger logger;
	public EventLogger(String filename) {
		try {
			lm = LogManager.getLogManager();
			logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fh = new FileHandler(filename);
			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}
