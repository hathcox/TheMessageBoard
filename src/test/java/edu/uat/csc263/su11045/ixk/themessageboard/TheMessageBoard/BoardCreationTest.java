package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard.service.BoardFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BoardCreationTest {
	
	BoardFacade boardService;
	
	@Test
	@Transactional()
	public void testBoardCreation() throws Exception {
		Board board = new Board("Test Board!");
		getBoardService().saveBoard(board);
	}

	public BoardFacade getBoardService() {
		return boardService;
	}
	
	@Autowired
	public void setBoardService(BoardFacade boardService) {
		this.boardService = boardService;
	}

}
