package day13a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//표준입출력 반복문 테스트합니다.
//파일시스템(바탕화면 prob1.txt -> 프로그램 -> 표준출력
public class FileIOTest5 {

	public static void main(String[] args) {
		System.out.println("작성자  : 조성현 - 실행시간 테스트합니다");
		int b;
		long start = System.currentTimeMillis();
		long end;
		byte[] buf = new byte[1024];
		//유니코드 : utf-8 3바이트
		//     자바 char 2바이트 : 한글,영문,기호 모두 2바이트 저장
		try {  
			System.out.println("바탕화면에서  hoya.jpg 파일을 다운로드 경로로 복사합니다...");
			int count=0;
			FileInputStream fis = new FileInputStream("C:\\Users\\tjdgu\\Desktop\\hoya.png");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\tjdgu\\Desktop\\hoya2.png");
			//prob1.txt 파일이 바탕화면에 없으면 FileNotFoundException 발생합니다.
			while((b=fis.read())!=-1) { //입력스트림을 파일로 변경합니다.
				
				count++;
				
				fos.write(b);
			}
			System.out.println(":::" + count + "바이트 입력! :::");
			System.out.println("바탕화면에 hoya.jpg 파일을 다운로드 경로로 복사 완료!!!.....");

		end = System.currentTimeMillis();
		System.out.println("실행 시간 :" +(end-start)+ "ms 소요되었습니다");
		fos.close(); fis.close();

		System.out.println("바탕화면에서  hoya2.jpg 파일을 다운로드 경로로[[1024바이트 buf 크기단위로]] 복사합니다...");
		count=0;
		fis = new FileInputStream("C:\\Users\\tjdgu\\Desktop\\hoya.png");
		fos = new FileOutputStream("C:\\Users\\tjdgu\\Desktop\\hoya3.png");
		start = System.currentTimeMillis();
		while((b=fis.read(buf))!= -1) {
			//read 메소드는 읽어온 바이트 크기를 return 합니다. - 마지막 실행때는 1024보다 작거나 같습니다.
			count+=b;
			fos.write(buf, 0, b);  //buf 배열의 0번 인덱스부터 읽어온 크기 b 만큼 fos 파일에 출력합니다.
		}		
		System.out.println(":::" + count + "바이트 복사되었습니다.! :::");
		end = System.currentTimeMillis();
		System.out.println("실행 시간 :" +(end-start)+ "ms 소요되었습니다");
		System.out.println("바탕화면에서  hoya2.jpg 파일을 다운로드 경로로[[1024바이트 buf 크기단위로]] 복사합니다...");
		
		fos.close();
		fis.close();
		} catch (IOException e) {
			System.out.println("입력 오류 : "+e.getMessage());
			e.printStackTrace();  //오류내용 추적하여 출력
		}
		
	}

}
