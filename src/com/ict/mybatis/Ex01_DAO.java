package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스
public class Ex01_DAO {
	// MyBatis에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss ;
	
	// 싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동커밋을 해야한다.
			ss = Ex01_DBService.getFactory().openSession() ;
		}
		return ss ;
	}
	
	// DB 처리하는 메서드들 => mapper.xml 을 호출하는 메서드
	// customer 테이블의 전체 내용 보기
	// select : 결과(resultType) 여러개인지 하나인지 구분
	//				parameter가 없는지, 하나인지, 두개 이상인지 구분
	
	// customer 테이블의 전체 내용 보기 : resultType - 여러개 - List<VO>
	//															parameter는 없다.
	public static List<Ex01_VO> getList() {
		List<Ex01_VO> list = null ;
		// getSession().selectList(mapper.xml의 namespace.id) ;
		list = getSession().selectList("customer.getSelectAll") ;
		return list ;
	} 
	
// customer 테이블의 특정 데이터 보기
	// select : 하나(VO 또는 int 또는 String...)
	//				파라미터 있음
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo = null ;
		vo = getSession().selectOne("customer.getSelectOne", custid) ;
		return vo ;
	}
	
	// count(*)
	// select
	// 파라미터 없음
	public static int getCnt() {
		int result = 0 ;
		result = getSession().selectOne("customer.getCount") ;
		return result ;
	}
	
	// insert, update, delete 는 결과 무조건 int
	// insert, update, delete 는 결과 무조건 커밋 해줘야한다.
	// insert, update, delete 는
	// 파라미터 타입 한개 일때 vo, int, String...
	//							두개 이상 일시 무조건 VO 만들어서 놓자.
	public static int getIns(Ex01_VO vo) {
		int result = 0 ;
		result = getSession().insert("customer.getInsert", vo) ;
		if (result>0) {
			ss.commit();
		}
		return result ;
	}
	
	public static int getDel(Ex01_VO vo) {
		int result = 0 ;
		result = getSession().delete("customer.getDelete", vo) ;
		if (result>0) {
			ss.commit();
		}
		return result ;
	}
	
	public static int getUP(Ex01_VO vo) {
		int result = 0 ;
		result = getSession().update("customer.getUpdate", vo) ;
		if (result>0) {
			ss.commit();
		}
		return result ;
	}
	
	
	
	
	
	
	
	
	
	
	
}
