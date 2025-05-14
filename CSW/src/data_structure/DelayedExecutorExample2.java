package MultiThreading;

import java.util.concurrent.CompletableFuture;

public class DelayedExecutorExample2 {

	public static void main(String[] args) {
		CompletableFuture<Void> future=CompletableFuture.supplyAsync(()->{
			try {
				System.out.println("in side completableFuture");
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return"Task completed";
	}).thenAccept(result->{
		System.out.println("result"+result));
	});
	System.out.println("waitaing for the task to complete");
	for(int i=1;i<=10;i++) {
		try {
			System.out.println("in main method");
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	future.join();
}

}
