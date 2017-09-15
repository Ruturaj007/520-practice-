package HW1_520;

public class APM 
{
	String name;
	String degree;
	String uni;
	int year;
	static int seed=1;
	int id;
	
	public static int getSeed() {
		return seed;
	}

	public static void setSeed(int seed) {
		APM.seed = seed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public  APM()
	{
		
	}
		
	public APM(String name, String degree, String uni, int year) {
		super();
		this.id = seed++;
		this.name = name;
		this.degree = degree;
		this.uni = uni;
		this.year = year;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
