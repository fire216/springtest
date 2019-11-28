package com.hwas.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.hwas.domain.MemberVO;

@Service
public class MemberDAOImpl implements MemberDAO {

	//마이바티스
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace = "com.hwas.mappers.memberMapper";
	
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		sql.insert(namespace +".register", vo); 
	}

	//로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {	
		return sql.selectOne(namespace + ".login", vo);
	}

	//회원가입
	@Override
	public void modify(MemberVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

	//회원탈퇴
	@Override
	public void remove(MemberVO vo) throws Exception {
		sql.delete(namespace + ".remove", vo);
		
	}

	//아이디 확인
	@Override
	public MemberVO idCheck(String userId) throws Exception {
		return sql.selectOne(namespace + ".idCheck", userId);
	}

}
