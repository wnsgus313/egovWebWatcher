package egovframework.example.login.service;

import java.util.List;

public interface LoginService {
	public Long selectLoginSeq(LoginVO vo) throws Exception;
	public List<LoginVO> selectLogin(LoginVO vo) throws Exception;
	public Long selectLoginCheck(LoginVO vo) throws Exception;
	public int updateLoginFail(LoginVO vo) throws Exception;
}
