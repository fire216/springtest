package com.hwas.dao;

import java.util.List;

import com.hwas.domain.ReplyVO;

public interface ReplyDAO {

	//댓글 조회
	public List<ReplyVO> readReply(int bno) throws Exception;
	
	//댓글 작성
	public void writeReply(ReplyVO vo) throws Exception;
}
