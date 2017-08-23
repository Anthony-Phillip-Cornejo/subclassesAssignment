
public class WorkTesterAuto {
	
	public static void main(String[] args) {
		// template Work work# = new Work(name,length,priority)
	
		//woah lets make soem work to do (this is all actual work i gotta get done, interestingly enough...)
		Work work1 = new Work("Scholarship Search" , 60, 1);
		Work work2 = new Work("Do Dishes", 5, 3);
		Homework hw1 = new Homework("Math Notes", 30, 2, "Math", "E18");
		Homework hw2 = new Homework("Subclass Demo", 138, 1, "Awesome Class", "E15");
		ExtraWork ew1 = new ExtraWork("Run 3 Miles", 19, 3, "Excercize", "Kalani High School");
		
		//alrighty now lets go and report some info
		work1.reportWorkSummary();
		System.out.println();
		hw1.reportWorkSummary();
		System.out.println();
		ew1.reportWorkSummary();
		System.out.println();
		
		/*
		 * now lets change it up!! and by "it" I mean some data... woop woop... its
		 * its 12:35 and the backlog of work from just 1 day is insane :V
		 */
		hw2.setClassType("AP Computer Science");
		System.out.println("The assignment " + hw2.reportName() + " is now in class " + hw2.reportClassType());
		System.out.println();
		ew1.setLocation("Kapiolani Park");
		System.out.println("The assignment " + ew1.reportName() + " will now take place in " + ew1.reportLocation());
		System.out.println();
		}
	}
