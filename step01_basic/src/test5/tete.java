package test5;

import step01.test.Test2;

public class tete{
	
	public String name = "Ȳ�ι�";
	public String city = "��õ";
	public int age = 27;
	
	public tete(){}
	
	public tete(String n , String c , int a) {
		name = "����";
		city = "����?";
		age = 21;
	}
	
	public int output() {
		return 5+3;
	}
	
	public int output(int a , int b) {
		return a+b;
	}
	
	public void output1(int a , int b, int c) {
		
	  System.out.println(100+200); 
	} // tete��ü�� ���� �ֱ� ������ void�� �� ������.
	
	
	
	public static void main(String[] args) {
		
		tete t1 = new tete();
		t1.name = "������";
		tete t2 = new tete( "a",  "b",25 );
		System.out.println(t1.name);
		System.out.println(t2.name);
		
		System.out.println(t1.output()); // ������ �̸�.�޼ҵ��
		System.out.println(t2.output(100,200));
		t2.output1(100,200,300);
		
		
		
		
	}
}