package train;



public class TrainSchedule {
	private Schedule schedule[];
	
	
	public TrainSchedule(Schedule[] schedule) {
		this.schedule = schedule;
	}

	public void printSchedule() {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("--------------------------------------");
		System.out.println("#  Code      Station        Arr.   Dep.");
		System.out.println("--------------------------------------");
		
		for (Schedule x : schedule) {
			x.printSchedule();
		}
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schedule schedule[] = {
				new Schedule(1,"YPR","Yasvantpur Jn","","23.40"),
				new Schedule(2,"GTL","Gautakal Jn","03.45","03.50"),
				new Schedule(3,"SC","Secundrabad Jn","08.55","09.10"),
				new Schedule(4,"BPQ","Balharshah Jn","13.30","13.35"),
				new Schedule(5,"HBJ","Habibganj Jn","21.20","21.25"),
				new Schedule(6,"JHS","Jhansi Jn","01.15","01.20"),
				new Schedule(7,"DEE","Delhi S Rohilla","07.00","23.40")
				};
		TrainSchedule trainSchedule = new TrainSchedule(schedule);
		trainSchedule.printSchedule();
	}

}
