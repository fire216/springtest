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

}
