package LambdaExpression;

public class MultiThreadingLambda {

	public static void main(String[] args) {
		
		RunnableDemo r=new RunnableDemo();
		Thread t =new Thread(r);
		t.start();
		Runnable ru=()->{for(int i=0;i<3;i++) {System.out.println(" lambda child  thread");}};
		Thread t1 =new Thread(ru);
		
		t1.start();
		for(int i=0;i<3;i++) {System.out.println("main  thread");}

	}

}
class RunnableDemo implements Runnable {

	
	public void run() {
		for(int i=0;i<3;i++) {System.out.println("child  thread");}
		
	}}
