package interfaces;

public class Utils { // arac
	
	public static void runLoggers(Logger [] loggers, String message) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
		
	}

	// loggerlar ve mesajlar degisebilir.
}

// static: program calistiginde ilk kez calistinda bellekte bir kez newlenir. oradan devam eder.(uygulama durana kadar)
// obje referenaslari da bellek icin pahalidir. o yuzden, her yerde cagirdigimizin referansini bellekte saklamamizda sikinti yok.
// ama mesela customer'i static yaparsak, bosuna bellek siser. o yuzden kullan at yapariz. 


// JAVA DA DIS BIR CLASS STATIC YAPILMIYOR. CLASSIN ICERISINE YEPYENI BIR CLASS OLUSTURULURSA, ONU STATIC YAPABILIRZ. AMA UST CLASS
// YAPILMAZ. => cokomelli bilgi. :)