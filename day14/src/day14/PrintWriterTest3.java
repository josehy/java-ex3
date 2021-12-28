package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class PrintWriterTest3 {

	public static void main(String[] args) {
		//사용할 파일 객체 생성
		String fname = "C:\\Users\\tjdgu\\Desktop\\student2.txt";
		File file = new File(fname);
	    List<Student> stus = new ArrayList<>();
	    stus.add(new Student("모모",90,88,78));
	    stus.add(new Student("사나",90,88,78));
	    stus.add(new Student("정연",90,88,78));
	    stus.add(new Student("다현",90,88,78));
	    stus.add(new Student("미나",90,88,78));
	    stus.add(new Student("모모2",90,88,78));
	    
		try {
		PrintWriter fpw = new PrintWriter(file); //File 객체로 출력할 파일 지정합니다.
		//실제로는 반복형태로 코딩됩니다. 예)ArrayList 크기만큼 반복
		for(Student s : stus) {
			fpw.print(s);
			fpw.print(" ");
		}
		   fpw.close();
		   System.out.println("파일 출력이 완료되었습니다.");
		   
		}catch(FileNotFoundException e) {
			System.out.println("파일 경로명/파일명 확인하세요");
			e.printStackTrace();
		}
	}
}
