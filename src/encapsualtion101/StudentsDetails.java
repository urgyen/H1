package encapsualtion101;

public class StudentsDetails {

	// state

	private int age;
	private int id;
	// ABC
	private String name;

	private double feesPayable;
	private double grade;

	// Getters and setters
	// Methods

	// age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 100) {
			this.age = age;
		} else {
			System.out.println("Print valid age");
		}
	}

	// id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// fees
	public double getFeesPayable() {
		return feesPayable;
	}

	// fees 5000; principal
	public void setFeesPayable(double feesPayable) {

		if (feesPayable > 5000) {
			this.feesPayable = feesPayable;
			System.out.println("Go to Principals");
		} else {
			this.feesPayable = feesPayable;
		}

	}

	// grade
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
