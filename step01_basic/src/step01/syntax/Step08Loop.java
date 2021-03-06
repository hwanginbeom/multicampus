/*학습내용
 * 1.반복문
 * 		1.for : 반복 횟수가 명확할 떄 주로 사용
 * 				 조건식이 true인 경우만 실행
 * 		2.while : 무한 루프 , 반복 횟수가 불 명확 할 때
 * 				  조건식이 true인 경우만 실행
 * 		3.do~while :  반복 횟수가 불 명확 할 떄 주로 사용, 무조건 1번 이상 실행 해야 할 경우 권장
 * 
 */

package step01.syntax;

public class Step08Loop {
	//for - 1~5 출력 , 키보드의 tab 과 동일한 키보드 "\t"
	/* 1~5 까지 가변적인 데이터 보유하게 되는 변수
	 * 1~1 씩 증가하는 로직
	 * 변수 값이 5와 비교해서 6이라면 종료 ... 즉 조건식
	 * for( 초기식 ; 조건식 ; 증감식 ){
	 * 		조건식이 true 인 경우 실행되는 블록
	 * }
	 */
	public static void forTest() {
		for( int i=1; i <= 5 ; i++ ) { //i=i+1; 동일한 문장
			System.out.print( i+"\t" );
		}
	}
	
	public static void forTest2() {
		for( int i=1; i <= 5 ; i++ ) { //i=i+1; 동일한 문장
			System.out.print( '*'+"\t" );
		}
	}
	
	//반복하는 수 만큼 데이터 적재(누적 , 저장)해서 출력
	public static void forTest3() {
		char star = '*';
		String star2 = "";
		int a =5;
		for( int i=1 ; i<=5 ; i++ ) { //i=i+1; 동일한 문장
			for(int j=0 ; j<a ; j++) {
				System.out.print(star);
			}
			a--;
			
			System.out.println();
		}
	}
	
	public static void forTest4() {
		char star = '*';
		for( int lineCount=1 ; lineCount<=5 ; lineCount++ ) { //i=i+1; 동일한 문장
			for(int starCount=5 ; starCount>=lineCount ; starCount--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	
	//문자열에 쌓아서 스타를출력해라
	public static void forTest5() {
		char star = '*';
		String star2 = "";
		for( int lineCount=1 ; lineCount<=5 ; lineCount++ ) { //i=i+1; 동일한 문장
			for(int starCount=5 ; starCount>=lineCount ; starCount--) {
				star2=star2+star;
			}
			System.out.println(star2);
			star2 = ""; // 초기화

		}
	}
	
	//while 
	public static void whileTest() {
		int no = 1 ;  //초기식
		while(no <6 ) {  //조건식 
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
//		System.out.println("\n-----2. *찍기");
//		forTest2();
//		System.out.println("\n-----3. *찍기");
//		forTest3();
//		System.out.println("\n-----4. * 거꾸로 찍기");
//		forTest4();
//		System.out.println("\n-----5. * 거꾸로 찍기");
//
//		forTest5();
		
		whileTest();
		doWhileTest();

	}

}
