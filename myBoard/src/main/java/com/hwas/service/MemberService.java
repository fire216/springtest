package com.hwas.service;

import com.hwas.domain.MemberVO;

public interface MemberService {

	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//회원정보 수정
	public void modify(MemberVO vo) throws Exception;
	
	//회원 탈퇴
	public void remove(MemberVO vo) throws Exception;
}
