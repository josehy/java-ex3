package jcpdev;

import dao.BuyDao;
import vo.BuyVo;

public class BuyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)BuyVo 객체를 생성하세요. - 임의값으호 초기화
		BuyVo vo = new BuyVo(0,"","",3,null);
		
		//2)BuyDao의 insert를 위의 객체로 실행/
		BuyDao buy = BuyDao.getInstance();
		buy.insert(vo);
		
		System.out.println("프로그램 종료!!!");
	}

}
