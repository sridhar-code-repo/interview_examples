package example1.shallow;

public class ShallowCloneTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Sharvesh");
		s1.setGender("Male");
		s1.setRollNo("26");
		Address address = new Address();
		address.setStreet("JCR 2nd Main");
		address.setCity("Bangalore");
		s1.setAddress(address);

		try {
			Student clone = (Student) s1.clone();
			System.out.println("s1 == clone : " + (s1 == clone));
			System.out.println("s1.name == clone.name : " + (s1.getName() == clone.getName()));
			s1.setName("Sharvesh S");
			System.out.println("s1.name == clone.name : " + (s1.getName() == clone.getName()));
			System.out.println("s1.address == clone.address : " + (s1.getAddress() == clone.getAddress()));
			s1.getAddress().setStreet("JCR 2nd Main, 1st Cross");
			System.out.println("s1.address == clone.address : " + (s1.getAddress() == clone.getAddress()));

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
