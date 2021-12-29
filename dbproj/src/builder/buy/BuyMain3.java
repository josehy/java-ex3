package builder.buy;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import dao.BuyDao;
import dao.ProductDao;
import vo.BuyVo;
import vo.ProductVo;

public class BuyMain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BuyDao2 buy_dao = BuyDao2.getInstance();
		ProductDao p_dao = ProductDao.getInstance();
		
		System.out.println("::: 상품 구매 :::");
		System.out.println("상품 리스트 입니다.");
		for(ProductVo vo : p_dao.getList())
			System.out.println(vo);
		
		System.out.print("구매 고객 아이디 입력>>");
		String id = sc.nextLine();
		System.out.println("고객님 환영합니다~!!");
		System.out.print("구매 상품 코드 입력.~!!");
		String pcode = sc.nextLine();
		System.out.print("구매 수량 입력 >>>");
		int quan = Integer.parseInt(sc.nextLine());   
		//Integer.parseInt()로 기억합시다. sc.nextInt(); 는 엔터처리문제
		
		//배송날짜는 1)현재날짜 + 3일  2)사용자가 원하는 날짜
		LocalDate delivery = LocalDate.now().plusDays(3);
		System.out.print("배송날짜" +delivery +"입니다.");
		
		//LocalDate 타입을 java.sql.Date vo2 타입으로 변경합니다.
		Date d_date = Date.valueOf(delivery);
		
		//2)
		System.out.println("배송희망날짜 입력(yyyy-mm-dd) >>> ");
		d_date = Date.valueOf(sc.nextLine());
		
		BuyVo2 vo2 = BuyVo2.builder().custom_id(id)
				.pcode(pcode).quantity(quan)
				.del_date(d_date).build();
		buy_dao.insert(vo2);
		
		System.out.println("주문내역확인 : " + vo2);
		System.out.println("구매 완료되었습니다.감사합니다.");
		System.out.println("프로그램 종료!!!");
	}

}
