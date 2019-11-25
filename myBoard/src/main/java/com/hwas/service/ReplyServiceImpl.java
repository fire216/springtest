package com.hwas.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.hwas.dao.ReplyDAO;
import com.hwas.domain.ReplyVO;

@Repository
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	//댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return dao.readReply(bno);
	}

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);		
	}

}
