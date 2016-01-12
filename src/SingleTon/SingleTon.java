package SingleTon;

public class SingleTon {
	
	private static SingleTon instance=null;
	private SingleTon(){
		
	}
	
	public static SingleTon getInstance(){
		if(instance==null){
			synchronized(instance){
				instance=new SingleTon();
			}
			
		}
		return instance;
	}
/*	public static synchronized SingleTon getInstance(){
		if(instance==null){
			instance=new SingleTon();
		}
		return instance;
	}*/
	
	public Object readResolve(){
		return instance;
	}
	

}
