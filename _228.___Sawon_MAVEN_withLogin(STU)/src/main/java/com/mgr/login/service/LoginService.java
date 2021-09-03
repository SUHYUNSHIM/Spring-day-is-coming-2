package com.mgr.login.service;

import com.mgr.login.vo.TelLoginVO;

public interface LoginService {
	
	public boolean memberInsert(TelLoginVO vo) throws Exception;
	
	public TelLoginVO memberMypage(TelLoginVO vo) throws Exception;
	
	public boolean memberDelete(TelLoginVO vo) throws Exception;
	
	public boolean memberUpdate(TelLoginVO vo) throws Exception;
	
	public TelLoginVO memberlogin(TelLoginVO vo) throws Exception;
}
