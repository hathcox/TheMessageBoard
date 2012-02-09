package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.dao;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.Board;

public interface BoardDao extends GenericDao<Board>{
	
	public Board getBoardByID(Long id);

}
