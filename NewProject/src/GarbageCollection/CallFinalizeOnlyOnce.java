package GarbageCollection;



public class CallFinalizeOnlyOnce {
	static CallFinalizeOnlyOnce s;
	static CallFinalizeOnlyOnce a;
	public static void main(String[] args)throws Exception {
		CallFinalizeOnlyOnce f=new CallFinalizeOnlyOnce();
		
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		s=null;
		System.gc();
		Thread.sleep(5000);
		
		System.out.println("End of main thread");
	}
	public void finalize() {
		System.out.println("Finalize() method called");
		s=this;
		a=this;
	}
}
