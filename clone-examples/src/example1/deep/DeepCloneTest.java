package example1.deep;

public class DeepCloneTest {
	
	public static void main(String[] args) {
		Student student = new Student();
		Address address = new Address();
		address.setStreet("JCR 2nd Main");
		address.setCity("Bangalore");
		
		student.setName("Sharvesh");
		student.setGender("Male");
		student.setRollNo("26");
		student.setAddress(address);
		
		try {
			Student student2 = (Student)student.clone();
			System.out.println(student==student2);
			System.out.println(student.getAddress()==student2.getAddress());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
