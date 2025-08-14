package test7;

public class Patient {
	String name ;
	String id  ;
	int age ;
	String diagnosis;
	

public Patient(String name, String id, int age, String diagnosis) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.diagnosis = diagnosis;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", id=" + id + ", age=" + age + ", diagnosis=" + diagnosis + "]\n";
}
}