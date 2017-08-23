public class Work {
	
	private String workName;
	private int workLength; //in minutes
	private int priorityLevel; // 1 = high 2 = medium 3 = low
	private String priorityLevelString = "ERROR";
	
	public Work(String name, int length, int priority) {
		workName = name;
		workLength = length;
		priorityLevel = priority;

		if(priorityLevel == 1) { 
			priorityLevelString  = "low";
		} else if(priorityLevel == 2) {
			priorityLevelString = "medium";
		} else if(priorityLevel == 3) {
			priorityLevelString = "high";
		}
	}
	
	public String reportName() {
		return workName;
	}
	
	public String reportPriority() {
		return priorityLevelString;
	}
	
	public int reportLength() {
		return workLength;
	}
	
	public void reportWorkSummary() {
		System.out.println(workName + " will take about " + workLength + " minutes, and is of " + priorityLevelString + " priority.");
	}
	
}