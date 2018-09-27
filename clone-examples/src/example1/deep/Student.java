package example1.deep;

public class Student implements Cloneable {

	private String rollNo;
	private String name;
	private String gender;
	private Address address;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student)super.clone();
		Address address = (Address) student.getAddress().clone();
		student.setAddress(address);
		return student;
	}

}
