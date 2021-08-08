package Thread;

class R {
	int n;
	synchronized int get() {
		System.out.println("Got: "+n);
		return n;
	}

	synchronized void put(int n) {
		this.n=n;
		System.out.println("Put: "+n);
	}
}//end of class q

class P implements Runnable{
	R r;
	P(R r)
	{
		this.r=r;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i=0;
		while(i<10) {r.put(i++);}
	}
}//end of producer
	
class C implements Runnable{
	R r;
	C(R r)
	{
		this.r=r;
		Thread t=new Thread(this, "Consumer");
		t.setDaemon(true);
		t.start();
	}
	public void run() {
		while(true) {r.get();}
	}
}//end of consumer

public class ProducerConsumerwithoutwaitN {

public static void main(String[] args) {
	R r = new R();
	new P(r);
	new C(r);
}//end of main

}//end of public class