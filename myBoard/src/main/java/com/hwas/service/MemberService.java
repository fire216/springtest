package com.hwas.service;

import com.hwas.domain.MemberVO;

public interface MemberService {

	//회원가입
	public void register(MemberVO vo) throws Exception;
}
