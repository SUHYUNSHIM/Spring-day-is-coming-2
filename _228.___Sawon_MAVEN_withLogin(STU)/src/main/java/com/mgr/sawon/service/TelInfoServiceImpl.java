package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.sawon.dao.TelInfoDAO;
import com.mgr.sawon.vo.TelInfoVO;

//@Controller 나 dao의 내용을 service가 맡아 business logic 차원에서 확장성 있는 작업을 하게 한다. 인터페이스 형식 == 확장성, 유연성
//business logic 상세 작업 
@Service("TelInfoService")  //bean 객체 자동 등록
public class TelInfoServiceImpl implements TelInfoService{	
	//나의 위치는 package com.mgr.sawon.service.
	//root-context.xml에 com.mgr.sawon을 component-scan

	@Autowired //property, 생성자 ref를 대신하여 사용한 것. 자동 의존성 주입DI. 그러므로 setter, constructor 문장을 생략하게 만드는 것.
	private TelInfoDAO telinfoDAO; //telinfoDAO를 스프링에 등록. 즉 bean 객체에서 ref로 객체 인자 전달한것과 같은 효과
	//TelInfoDAO telinfoDAO = new TelInfoDAO(); 이런 식으로 객체를 생성할 필요가 없다. 결합도 문제 해결.
	//넘겨 받을 때 setter injection, constructor injection을 요구하는 데 이것을 생략가능하다.
	
	
	@Override
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException {
		
		return telinfoDAO.getAllTelinfo(vo1);
	}

	@Override
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		return telinfoDAO.getTelinfo(vo1);
	}

	@Override
	public int updateTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.updateTelinfo(vo1);
		return c;
	}

	@Override
	public int insertTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.insertTelinfo(vo1);
		return c;
	}

	@Override
	public int deleteTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.deleteTelinfo(vo1);
		return c;
	}
	
}
