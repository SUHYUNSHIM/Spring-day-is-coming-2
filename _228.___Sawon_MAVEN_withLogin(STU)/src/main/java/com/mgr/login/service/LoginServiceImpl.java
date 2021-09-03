package com.mgr.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.login.dao.TelLoginDAO;
import com.mgr.login.vo.TelLoginVO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private TelLoginDAO dao;

	@Override
	public boolean memberInsert(TelLoginVO vo) throws Exception {
		boolean flag = dao.memberInsert(vo);
		return flag;
	}

	@Override
	public TelLoginVO memberMypage(TelLoginVO vo) throws Exception {
		TelLoginVO vo2 = dao.memberMypage(vo);
		return vo2;
	}

	@Override
	public boolean memberDelete(TelLoginVO vo) throws Exception {
		boolean flag = dao.memberDelete(vo);
		return flag;
	}

	@Override
	public TelLoginVO memberlogin(TelLoginVO vo) throws Exception {
		TelLoginVO vo2 = dao.memberlogin(vo);
		return vo2;
	}

	@Override
	public boolean memberUpdate(TelLoginVO vo) throws Exception {
		boolean flag = dao.memberUpdate(vo);
		return flag;
	}

	
	
}
