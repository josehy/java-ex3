package day13.test;
/*[[처리조건]]

1. 사용자가 정수 1개를 입력합니다. 단, 정수 값의 자리수는 상관 없습니다.

2. 입력된 정수의 각 자리 수를 더합니다.  10으로 나눈 나머지 값과 10으로 나눈 몫을 각각 저장하여 반복활용합니다.

3. 2번의 결과를 실행 결과와 같이 출력합니다.

4. 실행결과 출력을 위한 문자열 저장은 StringBuilder 클래스를 사용합니다.

5. 클래스 이름은 MySolution1 으로 합니다. 그외의 변수명 등 식별자는 임의로 하세요.


[[실행화면]]

정수 1개 입력 >>>   467943

실행결과 9+7+6+4 = 26


[[제출방법]]작성한 코드와 실행 결과를 캡쳐하여 이미지로 업로드 합니다.
           샘플데이터는 위의 실행결과와 동일하게 합니다.
1. 변수활용  - 10점

2. 사용자 입력 - 5점

3. StringBuilder 클래스 - 5점

4. 연산 -10점

5. 실행결과 완성 - 5점 */
import java.util.Scanner;

public class MySolution1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.print("정수 1개 입력 >>>");
		int num = sc.nextInt();
		
		int result;
		int sum = 0;
		do {
			result=num%10;
			sum += result;
			num /= 10;
			sb.append(result);
			if(num==0) sb.append("="); else sb.append("+");
		}while(num!=0);

		sb.append(sum);
		System.out.println(sb);
		
		sc.close();
		
		String temp="";
		temp=temp+3+"=";
	}

}
