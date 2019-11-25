package com.hwas.service;

import java.util.List;

import com.hwas.domain.BoardVO;
import com.hwas.domain.Criteria;
import com.hwas.domain.SearchCriteria;

public interface BoardService {

	//작성
	public void write(BoardVO vo) throws Exception;
	
	//조회
	public BoardVO read(int bno) throws Exception;
	
	//수정
	public void update(BoardVO vo) throws Exception;
	
	//삭제
	public void delete(int bno) throws Exception;
	
	//목록
	public List<BoardVO> list() throws Exception;
	
	//목록 + 페이징
	public List<BoardVO> listPage(Criteria cri) throws Exception;
	
	//게시물 총 개수
	public int listCount() throws Exception;
	
	//목록 + 페이징 + 검색
	public List<BoardVO> listSearch(SearchCriteria scri) throws Exception;
	
	//검색 결과 갯수
	public int countSearch(SearchCriteria scri) throws Exception;
} 
