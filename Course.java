public class Course {

	public String name;
	public int id;
	public float hours;

	public void addmoodle() {
		System.out.println("Course Name: " + name);
		System.out.println("Hours per week: " + (hours / 26)); // assuming a semester has 26 weeks
	}
}