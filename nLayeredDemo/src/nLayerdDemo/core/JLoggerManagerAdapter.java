package nLayerdDemo.core;

import nLayerdDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager= new JLoggerManager();
		manager.log(message);
	}

}


//adaptasyon : başkasının yaptigi service'leri sisteme adapte etmek.'
// adaptorum. kendisi benim interface'imi kullaniyor. ama orada kendi ismine, kend sablonuna uygun yapida (aslinda) jlogger'i cagırıyor.
// adaptasyon oldugu icin newlesek de sakinca yok. ama injekte de edebiliriz.

// product manage'a sen artık adaptorunu verebilirsin. diyor