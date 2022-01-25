
import java.util.PriorityQueue;
import java.util.Random;

public class CPUModeling{
	public static void main(String[] args) {
		
		initializeQueue(10);

		
	}
	
	public static void initializeQueue(int size) {
		
		PriorityQueue<InitializeJob> j = new PriorityQueue<InitializeJob>();
		Random random=new Random();
		
		for(int i = 0; i<size; i++) {
			int n = (int)(1+random.nextInt(100));
			int p = (int)(random.nextInt(40)-20);
			
			InitializeJob job = new InitializeJob(n, p);

			j.add(job);
			
		}
		
		for (int i = 0; i < size; i++) {
			InitializeJob job = j.remove();
			System.out.println("Job length = " + job.getJobLen() + " priority = " + job.getPriority());
			for (int k = 0; k < job.getJobLen(); k++) {
				System.out.println("Job " + job.getPriority() + " Slice = " + k);
			}
		}
		
	}
}