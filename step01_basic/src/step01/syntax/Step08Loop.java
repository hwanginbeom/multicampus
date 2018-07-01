/*�н�����
 * 1.�ݺ���
 * 		1.for : �ݺ� Ƚ���� ��Ȯ�� �� �ַ� ���
 * 				 ���ǽ��� true�� ��츸 ����
 * 		2.while : ���� ���� , �ݺ� Ƚ���� �� ��Ȯ �� ��
 * 				  ���ǽ��� true�� ��츸 ����
 * 		3.do~while :  �ݺ� Ƚ���� �� ��Ȯ �� �� �ַ� ���, ������ 1�� �̻� ���� �ؾ� �� ��� ����
 * 
 */

package step01.syntax;

public class Step08Loop {
	//for - 1~5 ��� , Ű������ tab �� ������ Ű���� "\t"
	/* 1~5 ���� �������� ������ �����ϰ� �Ǵ� ����
	 * 1~1 �� �����ϴ� ����
	 * ���� ���� 5�� ���ؼ� 6�̶�� ���� ... �� ���ǽ�
	 * for( �ʱ�� ; ���ǽ� ; ������ ){
	 * 		���ǽ��� true �� ��� ����Ǵ� ����
	 * }
	 */
	public static void forTest() {
		for( int i=1; i <= 5 ; i++ ) { //i=i+1; ������ ����
			System.out.print( i+"\t" );
		}
	}
	
	public static void forTest2() {
		for( int i=1; i <= 5 ; i++ ) { //i=i+1; ������ ����
			System.out.print( '*'+"\t" );
		}
	}
	
	//�ݺ��ϴ� �� ��ŭ ������ ����(���� , ����)�ؼ� ���
	public static void forTest3() {
		char star = '*';
		String star2 = "";
		int a =5;
		for( int i=1 ; i<=5 ; i++ ) { //i=i+1; ������ ����
			for(int j=0 ; j<a ; j++) {
				System.out.print(star);
			}
			a--;
			
			System.out.println();
		}
	}
	
	public static void forTest4() {
		char star = '*';
		for( int lineCount=1 ; lineCount<=5 ; lineCount++ ) { //i=i+1; ������ ����
			for(int starCount=5 ; starCount>=lineCount ; starCount--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	
	//���ڿ��� �׾Ƽ� ��Ÿ������ض�
	public static void forTest5() {
		char star = '*';
		String star2 = "";
		for( int lineCount=1 ; lineCount<=5 ; lineCount++ ) { //i=i+1; ������ ����
			for(int starCount=5 ; starCount>=lineCount ; starCount--) {
				star2=star2+star;
			}
			System.out.println(star2);
			star2 = ""; // �ʱ�ȭ

		}
	}
	
	//while 
	public static void whileTest() {
		int no = 1 ;  //�ʱ��
		while(no <6 ) {  //���ǽ� 
			System.out.println(no+"\t");
		//	no = no +1;
			no++; //update
		}
		
	}
	
	//do_while
	
	public static void doWhileTest() {
		int no=1;
		do {
			System.out.println(no+"\t");
			no++;
		}while(no<6);
	}


	public static void main(String[] args) {
		
		
		
//		forTest();
//		System.out.println("\n-----2. *���");
//		forTest2();
//		System.out.println("\n-----3. *���");
//		forTest3();
//		System.out.println("\n-----4. * �Ųٷ� ���");
//		forTest4();
//		System.out.println("\n-----5. * �Ųٷ� ���");
//
//		forTest5();
		
		whileTest();
		doWhileTest();

	}

}