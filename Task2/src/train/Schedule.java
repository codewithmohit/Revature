package train;

public class Schedule {
	private int serial;
	private String code;
	private String station;
	private String arr;
	private String dep;
	
	public Schedule(int serial,String code,String station,String arr,String dep) {
		this.serial = serial;
		this.code = code;
		this.station =station;
		this.arr = arr;
		this.dep = dep;
	}
	public void printSchedule() {
		System.out.printf("%d %2s %17s %8s %11s\n",serial,code,station,
				arr,dep);
	}
}
