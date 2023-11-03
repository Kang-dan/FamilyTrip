package com.ssafy.enjoytrip.board.model.mapper;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.board.model.Board;
import com.ssafy.enjoytrip.board.model.Page;

@Mapper
public interface BoardMapper {

//	void write(Board board);
//
//	Board view(int articleNo);
//
//	void modify(Board board);
//
//	void delete(int articleNo);
//
	List<Board> list(HashMap<String, Object> params);
//	
	public List<Board> selectBoard(Page search);
	
	public int selectBoardCount();

	void insertBoard(Board board);

	Board selectBoardOne(int no);

	void updateBoard(Board board);

	void deleteBoard(int no);
	
	List<Board> selectBoard();
}
