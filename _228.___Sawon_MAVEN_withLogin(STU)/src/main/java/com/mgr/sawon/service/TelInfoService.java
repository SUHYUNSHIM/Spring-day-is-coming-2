package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mgr.sawon.vo.TelInfoVO;

public interface TelInfoService { //interface - > impl. controller에서 처리할 내용을 service로 보내서 처리하고, 다시 controller로
	//return 하려고
					//객체 단위로
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException; //전체출력
	
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException; //객체로 처리. 객체가 타입이다.
	
	public int updateTelinfo(TelInfoVO vo1) throws SQLException;
	
	public int insertTelinfo(TelInfoVO vo1) throws SQLException;
	
	public int deleteTelinfo(TelInfoVO vo1) throws SQLException;
}
