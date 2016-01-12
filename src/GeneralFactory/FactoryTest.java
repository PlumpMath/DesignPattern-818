package GeneralFactory;

public class FactoryTest {
	public static void main(String[] args){
		SendFactory factory=new SendFactory();
		Sender sender=factory.produceMail();
		sender.Send();
		Sender staticsender=SendFactory.StaticSms();
		
	}

}
