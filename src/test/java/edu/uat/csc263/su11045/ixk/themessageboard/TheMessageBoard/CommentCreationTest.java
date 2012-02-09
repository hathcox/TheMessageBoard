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
public class CommentCreationTest {
	
	BoardFacade boardService;
	
	@Test
	@Transactional()
	public void testCommentCreation() throws Exception {
		Comment comment = new Comment("This is a topic", "This is some content!", "Test Author","1", false);
		getBoardService().saveComment(comment);
	}

	public BoardFacade getBoardService() {
		return boardService;
	}
	
	@Autowired
	public void setBoardService(BoardFacade boardService) {
		this.boardService = boardService;
	}

}
