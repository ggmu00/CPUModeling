public class InitializeJob implements Comparable<InitializeJob> {
	
	private int jobLen = 0;
	private int priority = 0;
	
	public InitializeJob() {
		//this.jobLen = jobLen;
		//this.priority = priority;
	}
	
	public InitializeJob(int length, int priority) {
		this.jobLen = length;
		this.priority = priority;
	}

	//set job length
	public void setJobLen(int len) {
		this.jobLen = len;
	}
	//get job length
	public int getJobLen() {
		return this.jobLen;
	}
	//set priority for job
	public void setPriority(int p) {
		
		this.priority = p;
	}
	//get priority for job
	public int getPriority() {
		return this.priority;
	}

	@Override
	public int compareTo(InitializeJob job) {
		if(this.priority > job.priority) {
			return 1;
		}else if(this.priority < job.priority) {
			return -1;
		}
		return 0;
	}
}
