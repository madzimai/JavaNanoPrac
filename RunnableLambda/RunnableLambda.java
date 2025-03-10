class Demo implements Runnable {
	@Override
	public void run() {
		System.out.println("run method called");
		}
	}

public class RunnableLambda {
	public static void main (String[] args){

	Thread thread = new Thread(new Demo());
	thread.start();

	Runnable run = () ->{
	System.out.println("run method called using lambda");
	};

	Thread trLambda = new Thread(run);
	trLambda.start();


	}

}
