package step01;

public class EqualsTest {

	public static void main(String[] args) {
		peopleDTO p1 = new peopleDTO("정상만",26);
		peopleDTO p2 = new peopleDTO("정상만",26);
		peopleDTO p3 = new peopleDTO("서아영",25);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));


	}

}
