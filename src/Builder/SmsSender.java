package Builder;

public class SmsSender implements Sender {
	@Override 
	public void Send(){
		System.out.println("this is sms sender");
	}
	
	public void Recieve(){
		System.out.println("This is sms reciever");
	}

}