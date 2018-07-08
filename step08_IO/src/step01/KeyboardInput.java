/* �н� ����
 * 1. �ǽð� Ű����� �Է��� �����͸� �ǽð� �ܼ�â�� ���
 * 2. ���� ���
 * 		Ű���� �Է�(System.in) -> ���� -> �ֿܼ� ��� (System.out)
 * 		1. �ǽð� : �ݺ���
 * 		2. read/write (�а� ������ִ� ��)
 * 		3. ������ ���� ���� ����
 * 			- String ������ ���� ���� ����
 * 			- �� ���� null
 * 			- readLine() : Line ������ read
 * 3. IO�� ���� performance�� ����� ���� API�� ����
 * 		1. �ӵ��� ���
 * 			- BufferedReader/BufferedWriter (2 byte�� �����)
 * 			- �ý��� ���� �ϵ���� ��� ���� �޸� ���
 * 			- ��� �Ŀ� �ڵ�� �ڿ� ��ȯ �ʼ�
 * 		2. �ɼ�
 * 4. �������� ���� ����
 * 			- ��� API�� �ݵ�� �ڿ� ��ȯ���� �����͸� �޸𸮰� ������ ���·�
 * 			�������� ����� �� �� ���� ����
 * 			��? ���� �޸� ũ�⸸ŭ �����Ͱ� �������� ������ 
 * 			���� �޸𸮿� �����͸� �����ϰ� �ִ� ��Ȳ
 * 			��, ���� �����ŭ �����Ͱ� ������ �ִٸ� �ڵ� ���(autoflush)
 * 			���� ������ �ս� ������ ���� auto flush ����� �޼ҵ� �ڵ�
 */

package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KeyboardInput {
	//step03 - file�κ��� read�ؼ� ���
	
	//split �޼ҵ带 �̿��ؼ�, data�� �ִ� �������� ������ ������ Ȯ���غ���
	public static void main(String[] args) {
		//read ��ü
		BufferedReader in = null;

		
		//data.txt ���Ͽ� 2byte�� ���
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("data.txt"));
			out = new BufferedWriter(new FileWriter("newData.txt")); //Buffering����� ���鼭 2byte ��� ���� ����(�ʱ�ȭ)
			String data = in.readLine();
			while(data != null) {
				//System.out.println(data);
				out.write(data);
				out.newLine();
				System.out.println(data);
				data = in.readLine();
				out.flush();//������ �ս��� ���ؼ� �������� ������ ��� ����
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	//step02 : Ű���� -> data.txt ���Ϸ� ���
	/*public static void main(String[] args) {
		//read ��ü
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//data.txt ���Ͽ� 2byte�� ���
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter(new FileWriter("data.txt")); //Buffering����� ���鼭 2byte ��� ���� ����(�ʱ�ȭ)
			String data = in.readLine();
			while(data != null) {
				//System.out.println(data);
				out.write(data);
				out.newLine();
				data = in.readLine();
				out.flush();//������ �ս��� ���ؼ� �������� ������ ��� ����
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	
	
	//step01 : Ű���� -> �ܼ�â�� ���
	/*public static void main(String[] args) {
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));
		try {
			String data = in.readLine();
			while(data != null) {
				System.out.println(data);
				data = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
}
