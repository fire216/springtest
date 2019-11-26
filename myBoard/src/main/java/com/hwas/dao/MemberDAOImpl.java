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

}
