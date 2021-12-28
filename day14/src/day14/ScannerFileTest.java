package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) {
	
		
		String fname = "C:\\Users\\tjdgu\\Desktop\\프린트테스트.txt";
		File file = new File(fname);
		
		try {
			Scanner fsc = new Scanner(file); //지정된 File 객체에서 문자열을 읽어옵니다.
			
			System.out.println(fsc.nextLine());  //라인(줄) 단위로 읽어 옵니다.
			System.out.println(fsc.nextLine());  //라인(줄) 단위로 읽어 옵니다.
			while(fsc.hasNext()) {
				System.out.println(fsc.nextLine());
			}
			fsc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
