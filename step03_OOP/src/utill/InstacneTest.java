package utill;

public class InstacneTest {

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.c.b.a.no);
		/*
		 * d.c.b.a.no d = D ��ü d.c = C��ü d.c.b = B ��ü d.c.b.a. = A ��ü d.c.b.a.no = A��ü��
		 * no ����
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
