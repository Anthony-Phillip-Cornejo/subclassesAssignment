public class ExtraWork extends Work {

	private String workType;
	private String location;
	
	public ExtraWork(String name, int length, int priority, String workT, String loc) {
		super(name, length, priority);
		workType = workT;
		location = loc;
	}
	
	public String reportLocation() {
		return location;
	}
	
	public String reportWorkType() {
		return workType;
	}
	
	public void setLocation(String loc) {
		location = loc;
	}
	
	public void setWorkType(String workT) {
		workType = workT;
	}
	
}