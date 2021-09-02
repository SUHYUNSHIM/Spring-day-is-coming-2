package com.suhyun.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhyun.sawon.dao.TelInfoDAO;
import com.suhyun.sawon.vo.TelInfoVO;

//jsp servlet에서 @controller나 dao의 내용을 service가 맡아
//business logic 차원에서 확장성 있는 작업을 하게 한다.


//business logic 상세 작업. 
//즉, root-context.xml에 com.suhyun.sawon을 component-scan
//따라서 bean 객체 자동 등록.
@Service("TelInfoService") 
public class TelInfoServiceImpl implements TelInfoService{
	
	@Autowired
	private TelInfoDAO telinfoDAO; // new로 객체 새로 만들필요 없음.(non-spring의 경우). 결합도 문제 해결
	//필드를 객체로 처리.
	//즉 bean 객체에서 ref로 객체 인자 전달한 것과 같은 효과이다. 
	//넘겨받을 때 setter injection, constructor injection이 요구. 이것을 생략 가능하다.
	

	//인터페이스가 아니라 real처리. 구현
	@Override
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {		
		return telinfoDAO.getAllTelinfo(vo1);
	}

	@Override
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {		
		return telinfoDAO.getTelinfo(vo1);
	}

	@Override
	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {		
		telinfoDAO.updateTelinfo(vo1);
		
	}

	@Override
	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {		
		telinfoDAO.insertTelinfo(vo1);
		
	}

	@Override
	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {		
		 telinfoDAO.deleteTelinfo(vo1);
		
	}
	

}
