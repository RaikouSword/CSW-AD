import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
public class DelayedExcecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture<Void> future=CompletableFuture.supplyAsync(()->{
			try {
				System.out.println("CompletableFuture -Executing the code block.");
				return "Completed Sucessfully";
				
			}catch(Exception e) {
				return "In catch Block";
			}
		},CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS)).thenAccept
		(result->System.out.println("in accept"+result));
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Excecuting for loop block: "+i+" seconds ");
			
		}
				
	}

}
