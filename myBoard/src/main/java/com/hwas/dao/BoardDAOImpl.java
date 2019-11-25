package com.hwas.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hwas.domain.BoardVO;
import com.hwas.domain.Criteria;
import com.hwas.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	//mybatis
	@Inject
	private SqlSession sql;
	
	//mapper
	private static String namespace = "com.hwas.mappers.boardMapper";
	
	//작성
	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		
	}
	
	//조회
	@Override
	public BoardVO read(int bno) throws Exception {
		return sql.selectOne(namespace + ".read", bno);
	}
	
	//수정
	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + ".update", vo);
		
	}
	
	//삭제
	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
		
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
		
	}

	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		return sql.selectList(namespace + ".listPage", cri);
	}

	@Override
	public int listCount() throws Exception {
		return sql.selectOne(namespace + ".listCount");
	}

	//목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listSearch(SearchCriteria scri) throws Exception {
		return sql.selectList(namespace + ".listSearch", scri);
	}

	// 검색 결과 갯수
	@Override
	public int countSearch(SearchCriteria scri) throws Exception {
		return sql.selectOne(namespace + ".countSearch", scri);
	}

}
