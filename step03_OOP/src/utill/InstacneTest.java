package utill;

public class InstacneTest {

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.c.b.a.no);
		/*
		 * d.c.b.a.no d = D °´Ã¼ d.c = C°´Ã¼ d.c.b = B °´Ã¼ d.c.b.a. = A °´Ã¼ d.c.b.a.no = A°´Ã¼ÀÇ
		 * no º¯¼ö
		 */

	}

}

class A {
	int no = 20;

	A() {
		System.out.println("A");

	}
}

class B {
	A a = new A();

	B() {
		System.out.println("B");
	}
}

class C {
	B b = new B();

	C() {
		super();
		System.out.println("C");
	}
}

class D {
	C c = new C();

	D() {
		System.out.println("D");
	}
}
