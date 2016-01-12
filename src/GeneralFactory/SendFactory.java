package GeneralFactory;

public class SendFactory {
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender StaticSms(){
		return new SmsSender();
	}

}
