package com.hwas.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hwas.dao.MemberDAO;
import com.hwas.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);		
	}

	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}

	//회원수정
	@Override
	public void modify(MemberVO vo) throws Exception {
		dao.modify(vo);		
	}

	//회원탈퇴
	@Override
	public void remove(MemberVO vo) throws Exception {
		dao.remove(vo);
		
	}

	//아이디 확인
	@Override
	public MemberVO idCheck(String userId) throws Exception {
		return dao.idCheck(userId);
	}

}
