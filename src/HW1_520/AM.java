package HW1_520;

import java.util.Date;

public class AM 
{
   static int seed=1;
   int id;
   public String job;
   Date date;
   
public static int getSeed() {
	return seed;
}
public static void setSeed(int seed) {
	AM.seed = seed;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getJob() {
	return job;
}
public void setName(String job) {
	this.job = job;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public AM(String job) {
	super();
	this.id = seed++;
	this.job = job;
	date =new Date();
}
   

}
