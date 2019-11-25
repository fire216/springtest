package com.hwas.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hwas.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	//마이바티스
	@Inject
	private SqlSession sql;
	
	//메퍼
	private static String namespace = "com.hwas.mappers.replyMapper";
	
	//댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		
		return sql.selectList(namespace + ".readReply", bno);
	}

	//댓글 작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		sql.insert(namespace + ".writeReply", vo);
	}

}
