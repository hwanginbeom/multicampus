/*학습내용
 * 1. 주요API
 * 		1.java.util
 * 		2.ArrayList - 동적 배열과 흡사
 * 			-첫 생성시 10 개의 메모리 생성
 * 			-11번째 데이터 넣으면 10개가 추가 생성
 * 			-21번째 데이터를 넣으면 10개가 추가 생성  
 * 		3.메소드
 * 			1.데이터 저장 : add(Object o)
 * 			2.데이터 삭제 : remove(int index)
 * 			3.데이터 반환 : Object get(int index) 
 * 			4.데이터 개수 : :size()
 * 
 */

package step01.util; // ********* java.lang 뺴고는 모두 import 해야된다
 
import java.util.ArrayList;

public class Step01ListTest {

	public static void main(String[] args) {
		//String들 만 저장 가능함 동적 메모리의 배열 형태 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());  // 0
		//데이터 저장
		list.add("황인범");  //0번째 자동저장
		list.add("김한림");	//1번째 자동저장
		list.add("서영상");
		list.add("서영상");

		System.out.println(list.size()); // 3
		
		//index로 1에 저장된 데이터 반환 및 출력
		System.out.println(list.get(1)); // 김한림
		
		//데이터 삭제
		list.remove(1);
		System.out.println(list.size()); //2
		System.out.println(list.get(1));// 서영상
		
		System.out.println(list);
		

	}

}
