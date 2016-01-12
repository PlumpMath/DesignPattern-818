package SingleTon;

public class InnerSingleTon {
	
	private InnerSingleTon(){
		
	}
	
	private static class SingleTonFactory{
		private static InnerSingleTon instance=new InnerSingleTon();
	}
	
	public static InnerSingleTon getInstance(){
		return SingleTonFactory.instance;
	}

	
	public Object readResolve(){
		return getInstance();
	}
	

}
