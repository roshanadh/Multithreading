import java.util.*;

public class MultithreadingDemo {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int threadCounter = 0;
		int index;

		System.out.println("Multithreading in Java Demo");

		do{
			System.out.println("Currently active threads: " + Thread.activeCount());
			System.out.println("Enter starting index for the thread:");

			index = Integer.parseInt(input.next());

			threadCounter++;

			new ServerThread(new Thread(), "Thread" + threadCounter, index).start();

		}while(index != 0);

		System.out.println("Exited loop");
	}
}
