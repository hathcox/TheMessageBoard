package edu.uat.csc263.su11045.ixk.themessageboard.TheMessageBoard;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
public class UserCreationTest {
	
	BoardFacade boardService;
	
	@Test
	@Transactional()
	public void testUserCreation() throws Exception {
		User user = new User("user","password");
		getBoardService().saveUser(user);
		// assertTrue("Should only be one user", getBlogService().getUsers().size() == 1);
	}

	public BoardFacade getBoardService() {
		return boardService;
	}
	
	@Autowired
	public void setBoardService(BoardFacade boardService) {
		this.boardService = boardService;
	}

}
