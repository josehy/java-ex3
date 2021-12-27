package day13a;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//표준입출력 반복문 테스트합니다.
//표준입력 -> 프로그램 -> 파일시스템출력(바탕화면의 test.txt)
public class FIleOutputTest3 {

	public static void main(String[] args) {
		
		int b;
		System.out.println("저장할 내용을 입력하세요. ↓");
		//유니코드 : utf-8 3바이트
		//     자바 char 2바이트 : 한글,영문,기호 모두 2바이트 저장
		
		try {  
			int count=0;
			FileOutputStream fos = new FileOutputStream("C:\\Users\\tjdgu\\Desktop\\test.text");
			//종료하려면 enter 입력하고 바로 ctrl+z 입력합니다.
			while((b=System.in.read())!=-1) { 
//버퍼에서 가져올때에는 입력한 문자를 utf-8로 한글 3바이트, 아스키코드1바이트
				//System.out.println((char)b); //문자인코딩 못합니다.니
				count++;
				fos.write(b);
				//System.out.write(b);  //문자기반의 메소드 출력
			}
			System.out.println(":::" + count + "바이트 입력! :::");
			
		} catch (IOException e) { //FileNotFoundException의 상위클래스 타입으로 catch
			System.out.println("입력 오류 : "+e.getMessage());
			e.printStackTrace();  //오류내용 추적하여 출력
		}
		
	}

}
