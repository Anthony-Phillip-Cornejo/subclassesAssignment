public class Homework extends Work {
	
	private String classType;
	private String classRoom;
	
	public Homework(String name, int length, int priority,String classT, String classR) {
		super(name, length, priority);
		classType = classT;
		classRoom = classR;
	}
	
	public String reportClassType() {
		return classType;
	}
	
	public String reportClassRoom() {
		return classRoom;
	}

	public void setClassType(String classT) {
		classType = classT;
	}
	
	public void setClassRoom(String classR) {
		classRoom = classR;
	}

}
