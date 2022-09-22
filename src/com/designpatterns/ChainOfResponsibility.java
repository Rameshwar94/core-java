package com.designpatterns;

abstract class Logger{
	public static int OUTPUTINFO=1;
	public static int ERRORINFO=2;
	public static int DEBUGINFO=3;
	int levels;
	Logger nextLevelLogger;
	public Logger getNextLevelLogger() {
		return nextLevelLogger;
	}
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}
	public void logMessage(int levels,String msg) {
		if(this.levels<=levels) {
			displayLogInfo(msg);
		}
		if(nextLevelLogger!=null) {
			nextLevelLogger.logMessage(levels, msg);
		}
	}
	protected abstract void displayLogInfo(String msg);
}
class ConsoleBasedLogger extends Logger{
	
	public ConsoleBasedLogger(int levels) {
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("console log info:  "+msg);
		
	}
	
}
class ErrorBasedLogger extends Logger{
	public ErrorBasedLogger(int levels) {
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error Log Info : "+msg);
	}
}
 
class DebugBasedLogger extends Logger{
	public DebugBasedLogger(int levels) {
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Debug Log Info : "+msg);
		
	}
}
public class ChainOfResponsibility {
	static Logger doChaining() {
		Logger consoleLogger=new ConsoleBasedLogger(Logger.OUTPUTINFO);	
		Logger errorLogger=new ErrorBasedLogger(Logger.ERRORINFO);
		Logger debugLogger=new DebugBasedLogger(Logger.DEBUGINFO);
		return consoleLogger;
		
	}
	public static void main(String[] args) {
		
	}

}
