package sub4;

public class Doctor extends Person{
	private String speciality;

	public Doctor(String name, int age, String speciality) {
		super(name, age);
		this.speciality = speciality;
	}
	public void introduce() {
		super.work();
		System.out.println("의사이고 전공은"+this.speciality+ "입니다");
	}

}
